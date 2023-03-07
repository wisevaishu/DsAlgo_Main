Feature: Linked List Tab
Background: 
		Given I enter "config_user" and "config_password"
		And I click Login button


  Scenario: Click Linked List Get Started button
    Given Click Linked list start button
    And Click Introduction Link
    Then User should redirect to Introduction List Page
    When User clicks try here button 
    And user redirect to try editor page 
    And user enter python program "print ('welcome')"
    Then python program print down 
    
    
    
  
	
   
