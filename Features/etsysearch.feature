@sc2
Feature:  user want to visit etsy web page and verify search

In order to verify search 
as a register user 
i want to visit etsy web page and write a text in search box then search
  
Scenario Outline: 
Given  user visit etsy home page
And     user searched  by "<typeproduct>" 
Then    user  click on the search button

Examples:

|typeproduct    | 
| Jo Malone reed diffusers|
