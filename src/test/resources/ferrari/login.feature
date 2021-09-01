@java
Feature: Hey mark

Scenario: Hey Verify login

Given Hey User opens the browser and hit the url
Then Hey User is on login page
And Hey User enters username and passoword
And Hey user is login into facebook
Then Hey Validate the title "Facebook" of facebook
And close the browser
 
