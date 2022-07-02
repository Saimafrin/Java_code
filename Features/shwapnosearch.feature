@sc2
Feature:  user want to visit shwapno web page and verify search

In order to verify search 
as a register user 
I want to visit shwapno web page and write a text in search box then search
  
Scenario Outline: 
Given user visit shwapno home page
And     user will able to search by "<productname>" 
Then    user clicks on search button
Examples:
  
| productname            | 
| Fresh mustard oil   |
