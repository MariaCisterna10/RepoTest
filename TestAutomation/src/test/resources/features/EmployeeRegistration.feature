@Employee
Feature: Crear y modificar empleados

  Background: Inicio de sesion
    Given Access to the TownSend cafe platform url
    When valid entry to login screen
    And login username "Maria"
    And login password "angular"
    And press login button
    When access to the TownSend cafe platform
    Then valid user entered

  @createEmployee
  Scenario Outline: Crear registro de empleado
    And press create button
    Then validate form labels
    And enter first name <firstName>
    And enter last name <lastName>
    And enter e-Mail <email>
    And enter date <startDate>
    And press save button
    Then validate new record created <firstName><lastName><email><startDate>
    And close browser


    Examples:
    |firstName | lastName   | email             |  startDate    |
    | "Lucy"   | "Venegas"  | "lucy@venegas.cl" |  "01/03/2020" |

  @editEmployee
  Scenario Outline: Editar registro de datos de empleado
    And presionar boton edit en empleado
    Then validate form labels
    And enter first name <firstName>
    And enter last name <lastName>
    And enter e-Mail <email>
    And enter date <startDate>
    And press save button
    And close browser

    Examples:
      |firstName | lastName   | email             |  startDate    |
      | "Lucas"   | "Venegas"  | "lucy@venegas.cl" |  "01/03/2020" |

  @deleteEmployee
  Scenario: Editar registro de datos de empleado
    And select employee
    And press button delete
    And close browser