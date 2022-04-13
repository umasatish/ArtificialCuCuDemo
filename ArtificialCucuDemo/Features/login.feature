Feature: login 


@Regression
Scenario: Successful login with valid credentials
      Given User launches chrome browser
      When User enters Url"https://katalon-demo-cura.herokuapp.com/"
      And clicks on MakeAppointment
      And User enters "John Doe" and "ThisIsNotAPassword"
      When clicks login 
      Then User should validate the successful landing of Homepage
      
      
@Sanity      
Scenario Outline:  login data driven
       Given User launches chrome browser
      When User enters Url"https://katalon-demo-cura.herokuapp.com/"
      And clicks on MakeAppointment
      And User enters "<Username>" and "<Password>"
      When clicks login 
      Then User should validate the successful landing of Homepage
  
  Examples:
  |Username	|	|Password						|    
  |John Doe	|	|ThisIsNotAPassword	|
  |John Doe1|	|ThisIsNotAPassword1|