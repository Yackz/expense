Feature: expense
    As a user
    I can remove money and view expense
    so that I can know how much money I have

Scenario: normal remove money
    Given a user have 500 in balance
    When I expense a money amount 200 from buy rice
    Then I have balance amount 300

Scenario: remove money more than balance
    Given a user have 500 in balance
    When I expense a money more than balance amount 800 from buy food
    Then I have balance amount -300


