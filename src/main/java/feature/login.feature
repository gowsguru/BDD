Feature: Validate demo automation
@Reg
//launchuing url
Scenario: Register page
Given launch the url
When click on skip signin button
Then enter first name as <gowthami> and last name as <guru>
Then close the browser