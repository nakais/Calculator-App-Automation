# Test Automation of Calculator App
This project demonstrates the automated testing of a calculator app using Appium in conjunction with Android Studio and Appium Inspector.

## Requirements:
To run the automated tests, you will need the following software installed:
- IDE
- Appium Inspector
- Android SDK
- Java Development Kit (JDK)
- Gradle

## Steps to run the tests:

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Update the DEVICE_NAME and PLATFORM_VERSION in the Setup.java file to match your emulator or device configuration.
4. Run the tests using the test runner in the IDE or by running the command gradle clean test in the terminal.

## Test scenarios:
The following scenarios are tested in this automation:

1. Sum any of 2 numbers (9+5=14)
2. Subtraction any of 2 numbers (8-3=5)
3. Do multiply of Result of Sum and Subtraction (14*5=70)
4. Divide the result of multiplication with 10 (70/10=7)
5. Solve this series (100+200-100*2/5)

The scenarios are implemented in the TestRunner.java file. The CalScreen.java file contains the Page Object Model for the calculator screen.

## Test Reports:
### HTML Report:
The HTML report provides a summary of the test results and includes a list of passed and failed test cases.

For generating HTML report hit this commmand: ```gradle clean test```

![Html report](https://user-images.githubusercontent.com/52671754/223334242-6ca9724e-3c25-40c4-a4c5-390516897628.png)

### Allure Report: 
The Allure report provides detailed information about each test case and includes screenshots and logs for each step. 

For generating Allure report hit the command:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
 ```

![allure report1](https://user-images.githubusercontent.com/52671754/223334290-b8305e5d-cafe-44eb-a53b-cdc10f0ba239.png)
![allurerepor2](https://user-images.githubusercontent.com/52671754/223334313-85fd50e5-fbc8-49ff-a380-0f883ff02523.png)

## Conclusion:
By automating the testing of the calculator app, we were able to ensure that the app works as expected and that it meets the user's requirements. The use of Allure and HTML reports provides detailed information about the test results, making it easy to identify and fix any issues that arise during testing.



