# new feature
# Tags: optional
Feature: income
    As a user
    I can add money and view the income
    so that I can know how much money I have

Scenario: Add income
    Given a user have 0 in balance
    When I add income amount 100 from salary
    Then I have balance amount 100

