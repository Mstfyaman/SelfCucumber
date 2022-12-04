
@login
Feature: Krafttech Log in Test

  # Agile story : As a user, I should be able to Log in so I can see my account

  @Mike @smoke @SDET
  Scenario: Login as Mike
    Given The user is on the Login page
    When The user enters Mike credentials
    Then The user should be able to login

  @Sebastian @smoke @QA
  Scenario: Login as Sebastian
    Given The user is on the Login page
    When The user enters Sebastian credentials
    Then The user should be able to login

    # class task user enters Jhon Nash credential 3 minutes

  @developer @db
  Scenario: Login as Jhon Nash
    Given The user is on the Login page
    When The user enters Jhon Nash credentials
    Then The user should be able to login

  @developer @smoke
  Scenario: Login as Rosa
    Given The user is on the Login page
    When The user enters Rosa credentials
    Then The user should be able to login