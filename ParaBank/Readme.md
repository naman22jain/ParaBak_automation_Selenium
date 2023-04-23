

                                                                  ParaBank Automation Project



This project is an automation framework for testing the ParaBank website using Java,
Selenium, TestNG, Page Object Model, and Project Factory. The project aims to
automate the testing of various functionalities of the ParaBank website and
ensure its reliability and stability.

Requirementsp-

 Java
 Selenium WebDriver
 TestNG
 Maven
 ChromeDriver (or any other WebDriver executable)

Project Structure-
The project follows the Page Object Model (POM) design pattern and
Project Factory structure. The following are the packages and their


description:

base: This package contains the base classes for initializing
     WebDriver, loading properties, and setting up TestNG.
 pages: This package contains the page classes for each page on the
     ParaBank website.
 tests: This package contains the test classes for various test cases.
 utils: This package contains utility classes for data management,
     reading/writing to files, taking screenshots, and generating reports.


How to Run Tests-

 Clone the repository to your local machine.
 Open the project in your preferred Java IDE.
 Update the config.properties file with the correct URL and WebDriver path.
 Run the testng.xml file.

Reporting-
 The framework generates an HTML report for each test run, located in the
 test-output folder.
 The report includes a summary of the test run, including passed, failed, and
 skipped tests, along with the duration of the test run.

Test Cases-
The following are the test cases covered in the framework:
 Login Test
 Registration Test
 Forgot Login info

Conclusion-

This framework provides a reliable and efficient way to automate the
testing of the ParaBank website. By following the Page Object Model and Project
Factory design patterns, the project is scalable and easy to maintain.

Contributing:
This project is developed and created by Naman Jain and is open to contributions. If you find an error or want to suggest an improvement, feel free to create a pull request.
