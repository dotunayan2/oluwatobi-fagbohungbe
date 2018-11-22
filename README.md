# oluwatobi-fagbohungbe

## Appium - Mobile Automation Testing (Android)

Appium is an open source, cross-platform test automation tool for native, hybrid and mobile web apps, tested on simulators (iOS, FirefoxOS), emulators (Android), and real devices (iOS, Android, FirefoxOS).

### What do I need?
This should download everything for you, but the following may be useful anyway:
1. Appium Desktop - https://github.com/appium/appium-desktop/releases/latest
2. Android Studio (Allows you to install SDK and Emulators) - 
3. Eclipse IDE

### Core dependencies
1. Appium - test automation framework for use with native, hybrid and mobile web apps
2. Selenium Java
3. TestNg
4. Install Maven

### Appium Installation on WINDOWS for Android AutomationAppium Installation on WINDOWS for Android Automation
1. Download java and set Java_Home in environment variables
2. Download android studio
3. Check android installation path in machine
4. Set Android+Home environment variables path to SDK location and include bin folder paths in PATH variable
5. Open android studio and configure virtual device/emulator
6. Download node.js
7. Set Node_Home environment variable path
8. Set npm environment variable path
9. Download appium server from Node ie. open command prompt (Administrator) and enter C:\Users\hp>npm install -g appium
10. Note: if you get error you may need to install python
11. Download Appium java client library - http://appium.io/downloads.html
12. Install eclipse - Create a project - Configure Appium libraries
13. Download selenium java libraries``

`To Start Appium server - Open command prompt and enter C:\Users\hp>appium
#### `


#### Architecture (Maven Project)
Framework is divided in such subsections:

`src/test/java/coCoin/TestCase/sanityTest.java
src/test/java/coCoin/TestBase/TestBase.java
src/test/resources/properties/OR.properties`


**Package: coCoin.TestBase**
**TestBase** - It consists of various setups for Appium dirver instance like platform version, device name, Appium server url etc.

**Package: coCoin.TestCase.**
SanityTest - it contains various test cases to execute for our test. 

**OR.properties** - locator storage used to interact with page elements. 

**Pom File: **The pom.xml file contains information of project and configuration information for the maven to build the project such as dependencies, build directory, source directory, test source directory, plugin, goals etc

**Testng.xml: **Here you define execution order of your android tests. It is used to define test suites and tests. It is also used to pass Parameters to the test methods.

#### Execution
**Testng.xml**
Right click on testng.xml file and run with testng

**Maven Test**
Right click project folder, click on maven and click on maven test or run via command line using mvn clean run


*Note: start appium server on your machine if not included programatically*
