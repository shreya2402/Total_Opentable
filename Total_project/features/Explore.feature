@tag2
Feature: Opentable Explore Validations 
@tag1
Scenario: Opentable search positive scenarios 
	Given Open chrome browser and enter url 
	When Enter location  in search criteria 
	Then Click on search button 
	Then verify hotel for location
 @tag4
Scenario: Opentable search1 positive scenarios 
	Given Open chrome browser and enter url 
	When Enter restaurant  in search criteria 
	Then Click on search button 
	Then verify restaurant for name 
	@tag3
	Scenario: Opentable search2 positive scenarios 
	Given Open chrome browser and enter url 
	When Enter cuisine in search criteria 
	Then Click on search button 
	Then verify cuisine