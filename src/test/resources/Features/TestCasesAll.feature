Feature: DsAlgo Test Cases

Background: 
Given I enter "config_user" and "config_password"
And I click Login button
#
#@LinkedList_Introduction
#Scenario: Click Linked List Get Started button
#Given Click Linked list start button
#And Click Introduction Link
#Then User should redirect to Introduction List Page
#When User clicks current Type Here button in page in "Linked List - Introduction"
#And user enter python program in "Linked List - Introduction"
#Then python program print down in "Linked List - Introduction"
#
#@LinkedList_CreatingLinkedList
#Scenario Outline: Validate Linked List - Creating Linked List
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Linked List" List
#Then User Clicks "Creating Linked LIst" Link
#Then User clicks current Type Here button in page in "Linked List - Creating Linked List"
#And User enter "<Programs>"
#And User get Output of Programs in "Linked List - Creating Linked List"
#Examples: 
#| Programs			     |
#| print ('welcome')  |
#
#@LinkedList_TypedOfLinkedList
#Scenario Outline: Validate Linked List - Typed Of Linked List
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Linked List" List
#Then User Clicks "Types of Linked List" Link
#Then User clicks current Type Here button in page in "Linked List - Typed Of Linked List"
#And User enter "<Programs>"
#And User get Output of Programs in "Linked List - Types Linked List"
#Examples: 
#| Programs			     |
#| Welcome            | 
#
#@LinkedList_Implement_Link_List_Python
#Scenario Outline: Validate Linked List - Implement Link List Python
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Linked List" List
#Then User Clicks "Implement Linked List in Python" Link
#Then User clicks current Type Here button in page in "Linked List - Implement Link List in Python"
#And User enter "<Programs>"
#And User get Output of Programs in "Linked List - Implement Link List Python"
#Examples: 
#| Programs			     |
#| Welcome            | 
#
#@LinkedList_Traversal
#Scenario Outline: Validate Linked List - Traversal
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Linked List" List
#Then User Clicks "Traversal" Link
#Then User clicks current Type Here button in page in "Linked List - Traversal"
#And User enter "<Programs>"
#And User get Output of Programs in "Linked List - Traversal"
#Examples: 
#| Programs			     |
#| print ('welcome')  |
#
#
#@LinkedList_Insertion
#Scenario Outline: Validate Linked List - Insertion
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Linked List" List
#Then User Clicks "Insertion" Link
#Then User clicks current Type Here button in page in "Linked List - Insertion"
#And User enter "<Programs>"
#And User get Output of Programs in "Linked List - Insertion"
#Examples: 
#| Programs			     |
#| Welcome            | 
#
#@LinkedList_Deletion
#Scenario Outline: Validate Linked List - Deletion
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Linked List" List
#Then User Clicks "Insertion" Link
#Then User clicks current Type Here button in page in "Linked List - Deletion"
#And User enter "<Programs>"
#And User get Output of Programs in "Linked List - Deletion"
#Examples: 
#| Programs			     |
#| Welcome            | 
 #
#@Data_Structures
#Scenario: Data Structures Tab
#Given The user clicks on Get Started tab button in data structures page
#Then The user directed to data structures page
#When click time complexity link in data structures page
#Then directed to time complexity page in data structures page
#When User clicks current Type Here button in page in "Data Structures"
#And user enter python program in "Data Structures"
#Then python program print down in time complexity in data structures page
#		
#@Stack_Operation_in_Stack_Link
#Scenario: The User able to navigate to operation in stack  page
#Given The user clicks on Get Started tab of stack box
#Then The user directed to stack data structure page
#When The user click on operation in stack link
#Then The user directed to operation in stack page
#When User clicks current Type Here button in page in "Stack - Operation in Stack Link"
#And user enter python program in "Stack - Operation in Stack Line"
#Then The user should be getting run result 	
#		
#@Stack_Implementation
#Scenario: The User able to navigate to Stack - Implementation page
#Given The user clicks on Get Started button in Stack
#Then The user directed to stack data structure page
#When The user click on Implementation link in stack page
#Then The user directed to implementation page of stack
#When User clicks current Type Here button in page in "Stack - Implementation"
#And user enter python program in "Stack Implementation"
#
#@Stack_Application_Link
#Scenario: The User able to navigate to Stack - Application Page
#Given The user in Home Page
#Then The user clicks on Get Started button in Stack
#Then The user directed to stack data structure page
#When The user click on Application link in stack page
#Then The user directed to Application Link Page of Stack
#When User clicks current Type Here button in page in "Stack - Application Link"
#And The User click run button with wrong code
#
#@Graph_All_Links
#Scenario: Click Graph Get Started button
#Given Click Graph get started button
#And Click Graph Link
#Then User should redirect to Graph Page having try here button
#When User clicks current Type Here button in page in "Graph"
#And user enter python program in "Graph"
#Then python program print down in Graph - Graph Page
#
#Scenario: Click Graph Get Started button
#Given Click Graph get started button
#And Click Graph Representation Link
#Then User should redirect to Graph Representation Page having try here button
#When User clicks current Type Here button in page in "Graph"
#And user enter python program in "Graph - Graph Representation"
#Then python program print down in Graph - Representation Page
 #
#@Array
#Scenario: Click Array Get Started button
#Given Click Array Get Started  button
#And Click Array - Arrays in python link
#When User clicks current Type Here button in page in "Array"
#And user enter python program in "Array"
#Then python program print down in Array - Arrays in Python link
 #
#@Array_Arrays_Using_List
#Scenario:  The User able to navigate the operations on ArraysUsingList
#Given Click Array Get Started  button
#Then The user click on the ArraysUsingList
#Then Open ArraysUsingList page
#When User clicks current Type Here button in page in "Array - Arrays Using List"
#And user enter python program in "Array - Arrays Using List"
#And User get Output of Programs in "Arrays - Arrays Using Lists"
   
 @Arrays_Practice_Questions  
 Scenario: The User able to navigate the PracticeQuestions in Arrays
Given Click Array Get Started  button
And Click Array - Arrays in python link
And The user click on the  PracticeQuestions
Then Open PracticeQuestions page
And The user click on the SquaresOfaSortedArray
Then Open SquaresOfaSortedArray page
And user enter python program in "Arrays - Practice Questions"
And User get Output of Programs in "Arrays - Practice Question Lists" 
#
#@Array_Basic_Operation_In_Lists
#Scenario Outline: Validate Array - Basic Operation In Lists
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Arrays" List
#Then User Clicks "Basic Operations in Lists" Link
#Then User clicks current Type Here button in page in "Array - Basic Operation in Lists"
#And User enter "<Programs>"
#And User get Output of Programs in "Arrays - Basic Operation in Lists"
#Examples: 
#| Programs			     |
#| print ('welcome')  |
#
#@Array_Basic_Application_Of_Array
#Scenario Outline: Validate Array - Basic Operation In Lists
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Arrays" List
#Then User Clicks "Applications of Array" Link
#Then User clicks current Type Here button in page in "Array - Basic Application of Array"
#And User enter "<Programs>"
#And User get Output of Programs in "Arrays - Basic Application of Array"
#Examples: 
#| Programs			     |
#| print ('welcome')  |
#
#@Queue
#Scenario Outline: User validate all the links in Queue Page
#Given User navigate to queue page
#When  User clicks each link from excel "<Sheetname>" and click Try here and Run button with valid python code
#Then User should get to see Print Program
 #Examples:
#|Sheetname|
#| Sheet1  |
#
#@Tree_OverviewOfTrees
#Scenario: Validate Tree - Overview of Tree
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Tree" List
#Then User Clicks "Overview of Trees" Link
#Then User clicks current Type Here button in page in "Tree - Overview Of Trees"
#And user enter python program in "Tree - Overview Of Trees"
#And User checks python result
#
#@Tree_Terminologies
#Scenario: Validate Tree - Overview of Tree
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Tree" List
#Then User Clicks "Terminologies" Link
#Then User clicks current Type Here button in page in "Tree - Terminologies"
#And The User click run button with wrong code
#And No Program Prints
#
#@Tree_TypesOfTrees
#Scenario: Validate Tree - Overview of Tree
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Tree" List
#Then User Clicks "Types of Trees" Link
#Then User clicks current Type Here button in page in "Tree - Types Of Trees"
#And The User click run button with no code
#And No Program Prints in Tree - Types of Trees
#
#@Tree_RestOfLinks
#Scenario: Validate Tree - Overview of Tree
#Given User clicks "Data Structures" Drop Down
#Then User Clicks "Tree" List
#Then User Clicks Following Links one by one
#|Tree Traversals                |  
#|Traversals-Illustration        | 
#|Binary Trees                   | 
#|Types of Binary Trees          | 
#|Implementation in Python       | 
#|Binary Tree Traversals         |  
#|Implementation of Binary Trees | 
#|Applications of Binary trees   | 
#|Binary Search Trees            | 
#|Implementation Of BST          | 
 #And User checks python result in all links
