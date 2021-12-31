Feature: MyAccount not Register Page
Scenario: User not able to register to Account
    Given User go to My Account and Select Register
    And Enter First Name and Last Name
    And Enter Email and Enter Telephone
    Then Click Continue