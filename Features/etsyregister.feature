Feature: Etsy sign up
In order to verify search
as a user 
i want to Etsy sign up 

@fbsignup_happypath


Scenario Outline:

Given user visits Etsy url
When user will enter valid "<email address>" and "<First name>"and "<new password>"
Then user will be able to click on sign in button


Examples:
| email address         |First name| |new password|
| donjoee995@gmail.com  |Don     | |Donjoe15!   |
