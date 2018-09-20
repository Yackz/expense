Feature: expense
    As a user
    I can edit income or expense
    so that I can know how much money I have after edit

Scenario: edit to income money
    Given a user have 500 in balance
    When I edit a money amount 200 from income to income amount 300 at 14/5/61
    Then I have balance amount 600

Scenario: edit to expense money
    Given a user have 500 in balance
    When I edit a money amount 200 from income to expense amount 200 at 19/9/61
    Then I have balance amount 100
