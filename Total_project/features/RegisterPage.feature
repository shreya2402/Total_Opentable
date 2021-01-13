Feature: Register Functionality

Background:
	Given the application browser is launched
    And the Open Table homepage is opened 


@tag1
Scenario: Successful creation of an account
When user clicks Sign up button
And user enters the first name 
And user enters the last name 
And user enters the email
And user enters valid password
And user Reenters the password
And user selects the primary dining location
And user clicks on create account button
Then the homepage is reloaded
And user clicks on the profile icon
And user clicks on sign out option

@tag2
Scenario: Unsuccessful registration due to invalid data entered in the fields
When user clicks Sign up button
And user enters invalid data in any of the required fields
And user clicks on create account button
Then error message is displayed 

@tag3
Scenario: Unsuccessful registration due to blank field
When user clicks Sign up button
And user clicks on create account button
Then error message will be displayed 

