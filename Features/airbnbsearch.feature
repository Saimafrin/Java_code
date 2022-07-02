Feature: airbnb search

@ airbnbsearch
Scenario:
Given user Visit Airbnb HomePage
When user enter    ”<LOCATION>”
When user will click  CHECK IN 
When user will click  CHECK OUT
When user will click dropdown ADULT and dropdown CHILDREN
When user will click on WiFi
Then user will click on Search

Examples:

|LOCATION   |ADULT|CHILDREN |
|Aurora  IL |2    |1        |