

Feature: LogIn Feature Test
 
Background:

 Given Open Browser
    And Enter Url "https://classic.freecrm.com/index.html?e=1"
    
  Scenario: User able to login with valid UsarName and valid PassWoard
   
    When I Enter valid UserName "batchautomation"
    And I Enter valid PassWoard "Test@12345"
    And I Click LogInButton
    Then I am able to LogIn
 

 Scenario: User are not able to login with invalid UsarName and valid PassWoard
  
    When I Enter invalid UserName "batchautomation1"
   And I Enter valid PassWoard "Test@123456"
    And I Click LogInButton
    Then I am not able to LogIn
 
 
 