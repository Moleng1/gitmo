Feature: This my work 
Scenario: Homepage page default login
Given  User is on netbanking landing page 
When User login into application with "mike" and password "9087"
Then home page is populated
And Cards are displayed "true"
 
Scenario: Homepage page default login
Given Home page default login
When User login into application with "john" and password "4567"
Then home page is populated
And Cards are displayed "false"