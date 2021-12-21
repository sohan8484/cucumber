Feature: user can create modify and delete organization

  Background: 
    Given i will launch "chrome" browser
    And enter the url "http://localhost:8888/"
    And login page is displayed enter the username "admin" and password "manager"
    And click on login

  Scenario Outline: as valid user iwill enter mutliple set of invlaid user crede
    When Home page is displayed click on organixaition link
    And Click on create new oraganiation
    And enter the organization name "<organization>" and click on save button
    Then verify organization "<organization>" create or not
    Then click on signout

    Examples: 
      | organization |
      | amazon       |
#
  #Scenario: As a valid user create a organization with organization,phone,websiet and employees
    #When Home page is displayed click on create new organization
    #And Click on create new oraganiation
    #And Enter organization name,phhone,websiet ad employees
      #| organizaiton name | phone | website        | employees |
      #| TestYantra        |  1234 | testyantra.com |       200 |
    #And click on save button
    #Then verify the organization name, phone, website and employees
