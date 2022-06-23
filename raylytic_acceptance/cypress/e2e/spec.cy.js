describe('empty spec', () => {
  it('passes', () => {
    cy.visit('http://localhost:8080')
    cy.contains('Patient').click()
    cy.contains('CRUD Operations').click()
    cy.get('button').contains('Read').click()
    cy.get('.alert-danger').should('have.text', '\n\t\tWarning!\n\t\tNo ID specified\n\t')
  })
})