Feature:
Search for vegitables

Scenario Outline: Perform Search
Given User is on GreenCart page
When User search for <VegName>
Then Result of search is displayed <VegName>

Examples:
|VegName|
|Mango|
|Cucumber|