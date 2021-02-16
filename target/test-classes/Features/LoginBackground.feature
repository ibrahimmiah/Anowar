Feature: CRMPRO Login feature test 

Scenario: CRMPRO User Login with valide Username and Passwoard 
	Given Open browser 
	And User enter CRMPRO Url "https://classic.freecrm.com/index.html?e=1" 
	When User Enter Valid Username "" and Valid Passwoard "" 
	And Click On Login button 
	Then User able to successfully Login 
	And Close browser