feature: logn feature for btger application

Scenario: as a valid user i want to login to app using valid redentials
Given i will lauvh browser 
And enter the usl
When login page is displayed enter the username and password
And click on login
Then I will verify it will navigate to home page or not

Scenario: as a valid user i want login to app using valid username and password
Given i will launch "chrome" browser
And enter the url "http://localhost:8888"
When login page s dsplayed enter the username "admin" and password "manager"
And click on login
Then verify the title " Administrator - Organizations - vtiger CRM 5 - Commercial Open Source CRM"