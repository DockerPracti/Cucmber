Feature: Application login


Background:
    Given Set up the driver property
    And Open the application using URL:"https://rahulshettyacademy.com/seleniumPractise/#/"
    And Extract url and print in console
   



Scenario: Search total images and availble in table
Given I am on home page Greenvcard
When User is search for img and get the count and extract name of images
And User is get tomato avaible in table and get name of "tomato"
And Browser is closed




