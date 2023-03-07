
Feature: Stack Tab

Background: Login in with valid credentials
		Given I enter "ninjawesdet102" and "tintintin"
		And I click Login button

Scenario: The User able to navigate to operation in stack  page
		Given The user clicks on Get Started tab of stack box
		Then The user directed to stack data structure page
		When The user click on operation in stack link
		Then The user directed to operation in stack page
		When The user click on try here button on operations in stack page
		Then The user directed to Try Editor page of operations in stack page having run button to test
		When The user enter valid python code in tryEditor 
		And The user clicks on run button
		Then The user should be getting run result  
    