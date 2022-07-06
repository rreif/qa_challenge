Feature: Create set of 30 individual patients
  Background:
    * def generator =
    """
    function(i){
      if (i == 30) return null;
      var patientDataGenerator = Java.type('resources.patients.PatientDataGenerator');
      var nameGenerator = new patientDataGenerator();
      return nameGenerator.humanNames();
    }
    """

  Scenario Outline: Create set of patients with generated names

    Given url 'http://localhost:8080/fhir/Patient'
    * header Content-Type = "application/fhir+json"
    * header accept = "application/fhir+json"

    * def patient =
      """
      {
        "resourceType": "Patient",
        "name" : [
          {
            "given" : '#(given)',
            "family" : '#(family)'
          }
        ]
      }
      """

    And request patient
    When method post
    Then status 201

    Examples:
      | generator |

