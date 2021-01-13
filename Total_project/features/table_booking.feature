@tag2

Feature: Table Booking
  This feauture deals with booking the table in restaurant using OpenTable Web application.
  
@tag1
Scenario: Successful table booking after Signing in
	Given User has navigated to the OpenTable website
#And User has signed in with <email> and password <password> to the website
	And User has signed in with email and password password to the website
	When User selects the date 
And User selects the time
And User selects number of people 
And User enters the location,restaurant or cuisine
And User clicks on Find a table button
Then Available tables should be displayed to User
And User selects the time slot from available restaurant
And User clicks on Complete the Reservation button
Then Table is Booked
#Examples:
#|email |password |
#|tanmayee@gmail.com |Tanu1234@! |
