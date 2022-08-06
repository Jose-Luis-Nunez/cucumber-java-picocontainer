Feature: Refund items

  Scenario: Returning a broken PS5 to the store
    Given that customer bought a PS5 for $500
    When customer return the PS5 to the store
    And customer shows receipt
    Then customer will get $500 refunded
