Feature: Register Function
  As a user I want to be able to register on the website


@SmokeTest
Scenario: Register on Website
  Given Navigate to NopCommerce WebSite
  And Click on Register
  And Click on Gender
  And Click on First name
  And Click on Last name
  When I click on the date picker
  And I select the year "2017"
  And I select the month "September"
  And I select the date "25"
  Then the date "2017-09-25" should be displayed
  And Click on Email
  And Click on Company Name
  And Click on Password
  And Click on Confirm Password
  When Click on Register
  Then Success message should be displayed