Feature: MyAccount Register Page

  Scenario: User able to launch browser
    Given User able to launch chrome browser sucessfully

  #Scenario: User able to register to Account
    #Given User go to My Account and Select Register
    #And Enter First Name and Last Name
    #And Enter Email and Enter Telephone
    #And Enter Password and Confirm Password
    #When Check Privacy policy
    #Then Click Continue
#
  #Scenario: User able to login Account
    #Given User go to My Account and Select Login
    #When Enter email address
    #And Enter password
    #And click on the login button
    #Then user able to see the title


  Scenario: user able to  select desktops
  Given User able to mousehover desktops
  When select mac book
  And After adding product display a message
  And user able to click on checkout
  Then click the checkout button
  
  Scenario: user select laptops and notebooks and checkout with guest account
  Given Mouse over on Laptops and Notebooks and click on Show all laptops and Notebooks
  And Select HP LP3065
  And Scroll down the page and change the delivery date to a future date " 2021-07-15"
 And Scroll down the page and click on Add to Cart button
  When user able to click on checkout
  And click the checkout button
  Then Click on the Guest checkout button and enter details and comments confirm order
  
  Scenario Outline: Click on MyAccount and edit account
  
    Given User go to My Account and Select Login
    When Enter email address
    And Enter password
    And click on the login button
    And Select the Edit Account from the right side corner update the Last Name <LastName>
    And Click continue and Log the success msg success Your account as been successfully updated
    Then Scroll down Click on logout button and Click continue to return to homepage
    
    Examples: 
    |LastName|
    |reddys|
    
    Scenario: user able to upload file
    Given User go to My Account and Select Login
    When Enter email address
    And Enter password
    And click on the login button
    And Mouseover to the Components tab Click on monitors Click on Apple Cinema30
And Enter all the required fields and upload file  in available options Click on Add to cart button
And The item should be added to the cart
Then If the file is not uploaded then it should throw an error message and the item is not added to cart.
