@ReviewEmployee
  Feature: Review worker data

    Background: Login
      Given Access to the TownSend cafe platform url
      When valid entry to login screen
      And login username "Maria"
      And login password "angular"
      And press login button

    @dataEmployee
    Scenario: Review employee data
      When access to the TownSend cafe platform
      Then valid user entered
      Then review employee data
      And close browser

