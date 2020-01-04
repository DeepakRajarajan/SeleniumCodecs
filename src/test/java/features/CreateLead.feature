Feature: Login to Leaftaps application and create Lead

Scenario:  To Create a Lead by completing all mandatory fields

Given Launch the browser
And Load the url
And Maximize the browser
And Enter the username as demosalesmanager
And Enter the password as crmsfa
And Click on the login button
And Click on CRM/SFA button
And Click on Leads
And Click on Create Leads Button
And Enter Company Name
And Enter First Name
And Enter Last Name
When Click on Submit button
Then Verify if Lead is created