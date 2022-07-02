Feature: Doordash sign up

In order to verify search
as a uger 
I want to sign up Doordash

@doordash_happypath
Scenario Outline:
Given user visit doordash url
When user will enter "<First name>" and"<Last name>" and valid "<email>" and "<Mobile Number>" and "<Password>"
When user selects dropdown Country 
Then user click on sign up button


Examples:
|First name| Last name | email                     |Mobile Number| Password   |Country  |
|John      | Doe       |Donjoee995@gmail.com       |  5615076578 | Donjoe1234 |3        |      
