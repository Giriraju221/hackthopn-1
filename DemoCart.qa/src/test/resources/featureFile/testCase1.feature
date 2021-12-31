Feature: Booking Hotel Room 

Scenario: Verify user is able to search the hotel room and book the room 

	Given User able to launch chrome browser sucessfully 
	Then Click on the Menu (Three Dotted line) 
	When Select Rooms 
	Then  Click on the Book Now button on the Executive Rooms 
	When Check the Room Price $2.000 
	Then Click on the Book Now 
	Then Click on Proceed to checkout button 
	Then Click on Proceed 
	When Click on Login Now from Guest Information section 
	And Enter Email address 
	And  Enter Password 
	When Click on Proceed 
	And  Click on check box to agree the Terms of services 
	And click on Pay by bank wire 
	When Click on I confirm my order 
	Then Click on Logout 
	
	
Scenario: Verify the user is able to update the personal details 
	Given Go to "Sign In" and enter email Address and password 
	When Click on the "My Personal Information" from My Account page 
	Then Modify your name and DOB 
	And Enter the Current Password 
	Then Click on Save 
	When Click on Log Out