

                                                   ParaBank Automation Project



This project is an automation framework for testing the ParaBank website using Java,
Selenium, TestNG, Page Object Model, and Project Factory. The project aims to
automate the testing of various functionalities of the ParaBank website and
ensure its reliability and stability.


Requirements-

 1.Java
 
 2.Selenium WebDriver
 
 3.TestNG
 
 4.Maven
 
 5.ChromeDriver (or any other WebDriver executable)
 
 6.Apache POI

Project Structure-
The project follows the Page Object Model (POM) design pattern and
Project Factory structure. The following are the packages and their



description:

1.base: This package contains the base classes for initializing
     WebDriver, loading properties, and setting up TestNG.
     
 2.pages: This package contains the page classes for each page on the
     ParaBank website.
     
 3.tests: This package contains the test classes for various test cases.
 
 4.utils: This package contains utility classes for data management,
     reading/writing to files, taking screenshots, and generating reports.
     


How to Run Tests-

 1.Clone the repository to your local machine.
 
 2.Open the project in your preferred Java IDE.
 
 3.Update the config.properties file with the correct URL and WebDriver path.
 
 4.Run the testng.xml file.
 

Reporting-
 The framework generates an HTML report for each test run, located in the
 test-output folder.
 The report includes a summary of the test run, including passed, failed, and
 skipped tests, along with the duration of the test run.
 

Test Cases-
The following are the test cases covered in the framework:

 1.Login Test
 
 2.Registration Test
 
 3.Forgot Login info
 

Conclusion-

This framework provides a reliable and efficient way to automate the
testing of the ParaBank website. By following the Page Object Model and Project
Factory design patterns, the project is scalable and easy to maintain.


Contributing:This project is developed and created by Naman Jain and is open to contributions. If you find an error or want to suggest an improvement, feel free to create a pull request.
