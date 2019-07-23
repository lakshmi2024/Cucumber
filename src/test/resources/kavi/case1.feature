Feature: Test TestMeApp
Scenario: Registration
Given Open the application
When Click on signup
And Enter username as "poojalakshmi"
And enter first name as "lakshmi"
And enter last name as "pooja"
And enter password as "lakshmi123"
And confirm password as "lakshmi123"
And choose gender
And enter email as "lakzz@gmail.com"
And enter mobile number as "9876543210"
And enter dob as "20/09/1997"
And enter address as "gfruyggthy"
And choose security question
And enter answer
Then click register
Then close application
