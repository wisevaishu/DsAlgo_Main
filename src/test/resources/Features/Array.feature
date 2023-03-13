@TagArray
Feature: Array
  To explore about Array oparations 
  user need to click the GetStarted button

  
  Background: user logged into  DS Algo portal
    Given I enter "config_user" and "config_password"
    And I click Login button
    Given The user click on the GetSTarted button in Array
    Then Open Array page
 
  @TagArraysInPython
  Scenario Outline:  The User able to navigate the operations on ArraysInPython
    Given The user click on the ArraysInPython 
    Then the User able to navigate about ArraysInPython
    Given the user click on the Try here button
    Then the user directed to text editor box of ArraysInPython
    When the user enter valid python code for Array in the text editor box
    And  click the run button
    Then the user gets the run result
    
    @TagArraysUsingList
   Scenario Outline:  The User able to navigate the operations on ArraysUsingList
    Given The user click on the ArraysUsingList
    Then Open ArraysUsingList page
    Given the user click on the Try here button
    Then the user directed to text editor box of ArraysUsingList
    When the user enter valid python code for  ArraysUsingList in the text editor box
    And  click the run button
    Then the user gets the run result
    
    @TagBasicOperationsinLists
    Scenario Outline:  The User able to navigate the BasicOperationsinLists 
    Given The user click on the BasicOperationsinLists 
    Then Open BasicOperationsinLists page
    Given the user click on the Try here button
    Then the user directed to text editor box of BasicOperationsinLists
    When the user enter valid python code in for BasicOperationsinLists  the text editor box
    And  click the run button
    Then the user gets the run result 
    
    @TagApplicationsOfArray
    Scenario Outline:  The User able to navigate the ApplicationsOfArray 
    Given The user click on the ApplicationsOfArray 
    Then Open ApplicationsOfArray page
    Given the user click on the Try here button
    Then the user directed to text editor box of  ApplicationsOfArray
    When the user enter valid python code for ApplicationsOfArray in the text editor box
    And  click the run button
    Then the user gets the run result 
    
    @TagPracticeQuestions
    Scenario Outline:  The User able to navigate the PracticeQuestions
    Given The user click on the ApplicationsOfArray 
    And The user click on the  PracticeQuestions
    Then Open PracticeQuestions page
    Given The user click on the SquaresOfaSortedArray
    Then Open SquaresOfaSortedArray page
    When the user enter valid python code for  PracticeQuestions in the text editor box
    And  click the run button
    Then the user gets the run result 
