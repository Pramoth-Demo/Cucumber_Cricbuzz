Feature: Cricbuzz

 
Scenario: 1_Fetching International Cricket match Schedule except saturday matches

Given Open the browser
When User enters the url
Then User should be in Cricbuzz home page
Then User clicks on Schedule
And User fetching international cricket match schedules



Scenario: 2_Fetching International tour of Australia under Series module

Then Click on series
Then Fetching International tour of Australia


Scenario: 3_Fetching live scorecard

Then Go to HomePage by click on Cricbuzz Logo
Then Click on first live match
Then Click on scorecard
And Fetching scorecard details