Feature: Refund faulty items

  Scenario: Returning a broken PS5 to the store
    Given that2 customer bought a PS5 for $500
    When customer2 return the PS5 to the store
    And customer2 shows receipt
    Then customer2 will get $500 refunded
