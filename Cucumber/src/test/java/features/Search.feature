 Feature: Data search
 
 Background:
Given Browser object is created
When Browser is launched
Then Selenium is ready to be used
 
 @RegTest
 Scenario: Search for infomation
 Given User is on google search
 When User enters "Bangalore" to serach
 And clicks on search
 Then Information relavent to search is reflected
 
 @webTest
 Scenario: User log into application
 Given User is on login page
 When User enters userName and password
 | varun | kumar |
 And clicks on login
 Then User is loged in successfully
 
 @RegTest
 Scenario Outline: User log into application parameterized
 Given User is on login page
 When User enters userName as : <userName> and password as : <password>
 And clicks on login
 Then User is loged in successfully
 
 Examples:
 | userName | password |
 | varun | kumar |
 | Preeti | durbha |