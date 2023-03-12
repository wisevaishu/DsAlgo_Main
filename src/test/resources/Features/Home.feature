Feature: Home feature with ExcelSheet Handling

Scenario Outline: User clicks all Get started buttons and drop down list 
Given User navigate to home page
When  User clicks get started button of each link from excel "<Sheetname>"
Then  User Should not go further
When User clicks links from Drop-Down from excel "<Sheetname">
Then User Should not go further 

Examples:
|Sheetname|
| Sheet1  | 
