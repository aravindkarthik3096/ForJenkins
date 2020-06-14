Feature:  To check the facebook login

Background: 
Given User is facebook login page
         

Scenario: To check using invalid credentials1
When User enters the username and password
And User click the login button once
Then User validates the outcome of the test  once

Scenario: To check using invalid credentials2
When User enters the invalid username and invalid password
And User click the login button twice
Then User validates the outcome of the test twice

Scenario: To check using invalid credentials3
When User enters the valid username and invalid password 
And User click the login button third time
Then User validates the outcome of the test third time 

Scenario: To check using invalid credentials4
When User enters the invalid username and valid password
And User click the login button fouth time
Then User validates the outcome of the test  fourth time
