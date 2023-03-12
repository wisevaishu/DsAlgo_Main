Feature: Linked List Tab
Background: 
		Given I enter "config_user" and "config_password"
		And I click Login button

#Linked List - Introduction
Scenario: Click Linked List Get Started button
Given Click Linked list start button
And Click Introduction Link
Then User should redirect to Introduction List Page
When User clicks current Type Here button in page   
And user enter python program 
Then python program print down 
 
 #Array
 Scenario: Click Array Get Started button
 Given Click Array Get Started  button
 And Click Array - Arrays in python link
 When User clicks current Type Here button in page
 And user enter python program
 Then python program print down in Array - Arrays in Python link
 
 #Data Structures
 Scenario: Data Structures Tab
Given The user clicks on Get Started tab button in data structures page
Then The user directed to data structures page
When click time complexity link in data structures page
Then directed to time complexity page in data structures page
When User clicks current Type Here button in page
And user enter python program
Then python program print down in time complexity in data structures page
		
#Stack - Operation in Stack Link
Scenario: The User able to navigate to operation in stack  page
Given The user clicks on Get Started tab of stack box
Then The user directed to stack data structure page
When The user click on operation in stack link
Then The user directed to operation in stack page
When User clicks current Type Here button in page
And user enter python program
Then The user should be getting run result 	
		
#Stack - Implementation
Scenario: The User able to navigate to Stack - Implementation page
Given The user clicks on Get Started button in Stack
Then The user directed to stack data structure page
When The user click on Implementation link in stack page
Then The user directed to implementation page of stack
When User clicks current Type Here button in page
And user enter python program 


#Stack - Application Link
Scenario: The User able to navigate to Stack - Application Page
Given The user in Home Page
Then The user clicks on Get Started button in Stack
Then The user directed to stack data structure page
When The user click on Application link in stack page
Then The user directed to Application Link Page of Stack
When User clicks current Type Here button in page
And The User click run button with wrong code

#Graph - All Links
Scenario: Click Graph Get Started button
Given Click Graph get started button
And Click Graph Link
Then User should redirect to Graph Page having try here button
When User clicks current Type Here button in page
And user enter python program 
Then python program print down in Graph - Graph Page

 Scenario: Click Graph Get Started button
 Given Click Graph get started button
 And Click Graph Representation Link
 Then User should redirect to Graph Representation Page having try here button
 Then python program print down in Graph - Representation Page



