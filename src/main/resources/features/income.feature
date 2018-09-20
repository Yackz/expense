
Feature: income
    As a user
    I can add money and view the income
    so that I can know how much money I have

Scenario: Add income
    Given a user have 0 in balance
    When I earned 100 from work at 17/2/61
    Then I have balance amount 100

