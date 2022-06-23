Feature: QA Challenge

  Scenario: Wipe existing test data
    * header Content-Type = "application/fhir+json"
    * header accept = "application/fhir+json"
    * def wipeConfig =
    """
    {
      "resourceType": "Parameters",
      "parameter": [
      {
        "name": "expungeDeletedResources",
        "valueBoolean": true
      },
      {
        "name": "expungePreviousVersions",
        "valueBoolean": true
      },
      {
        "name": "expungeEverything",
        "valueBoolean": true
      },
      {
        "name": "count"
      }
    ]
    }
    """
    Given url 'http://localhost:8080/fhir/$expunge'
    And request wipeConfig
    When method post
    Then status 200