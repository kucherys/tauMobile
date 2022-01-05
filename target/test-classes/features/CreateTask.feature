Feature: Create New Task
  @testIOS
  Scenario: The user can add new task
    Given Click Add new Task
    Given Enter TaskName
    Given Enter TaskDesc
    When Click Save
    Then Task added successfully

  @landIOS
  Scenario: Verify elements on landing page for iOS
    Given Appium server and simulator with application type iOS started
    When I verify landing page is loaded
    Then I print login button name


  @landAndroid
  Scenario: Verify elements on landing page for Android
    Given Appium server and simulator with application type Android started
    When I verify landing page is loaded
    Then I verify elements on landing page
      | logInButton | logoLabel  | signUpButton        |
      | Log In      | Welcome to | I'm new to Digibank |
    And I print login button name
    And I confirm tests completed with result TEST PASSED