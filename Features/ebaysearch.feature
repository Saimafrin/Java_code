@sc2
Feature:  user want to visit ebay web page and verify search

In order to verify search 
as a register user 
I want to visit ebay web page and write a text in search box then search
  
Scenario Outline: 
Given user visit ebay home page
And     user will be able to search by "<productname>" 
Then    user click on search button
Examples:
  
| productname            | 
| Lenovo Gaming Laptop   |
