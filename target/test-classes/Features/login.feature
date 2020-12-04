Feature: Test login kaskus

  @test_login_kaskus
  Scenario: user successfully login to kaskus
    Given user access kaskus page
    When user click login button
    Then user is on login form
