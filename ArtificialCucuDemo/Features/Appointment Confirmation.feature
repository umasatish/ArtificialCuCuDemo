Feature: Appointment Confirmation


@Regression
Scenario: Successfully Booking an appointment
    Given  User launches chrome browser
    When User enters Url"https://katalon-demo-cura.herokuapp.com/"
    When clicks on Make Appointment
    And User enters "John Doe" and "ThisIsNotAPassword"
    When clicks on login
    When User selects"HongKong CURA Healthcare Center"
    When clicks "Apply for hospital readmission"
    When clicks on"Medicaid"
    When User enters date"29-04-1974"
    When User enters comments"Thank you satish"
    When clicks on BookAppointment
    And User should validate the sucesssful ApointmentConformation page
    Then User clicks on Go to Homepage