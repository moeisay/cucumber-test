Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is in new tab of Google Chrome
	When User navigate to LogIn Page
	And User enters UserName and Password
	Then Message displayed Login Successfully
	When User navigate in homepage
	And User clicks on product
	Then User should be in product details page
	
	