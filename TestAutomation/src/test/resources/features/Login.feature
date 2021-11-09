@IngresoLogin
  Feature: Ingreso a plataforma

    @ingresoExitoso
    Scenario Outline: Ingreso exitoso a plataforma
      Given Access to the TownSend cafe platform url
      When valid entry to login screen
      Then valid username label
      Then valid username input
      And login username <userName>
      Then valid password label
      Then valid password input
      And login password <password>
      Then valid password text
      And press login button
      And close browser

      Examples:
      | userName     | password     |
      | "Maria"      |  "angular"   |

    @passIncorrecto
    Scenario Outline: Ingreso exitoso a plataforma
      Given Access to the TownSend cafe platform url
      When valid entry to login screen
      And login username <userName>
      And login password <password>
      Then valid password text
      And press login button
      Then valido mensaje de error
      And close browser

      Examples:
        | userName      | password   |
        | "Maria"      |  "angula"   |

    @cerrarSesion
    Scenario Outline: Ingreso exitoso a plataforma
      Given Access to the TownSend cafe platform url
      When valid entry to login screen
      And login username <userName>
      And login password <password>
      Then valid password text
      And press login button
      And press logout button
      And close browser

      Examples:
        | userName     | password     |
        | "Maria"      |  "angular"   |