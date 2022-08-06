Feature: Refund faulty items

  Scenario: Returning a broken PS5 to the store
    Given John Doe bought a PS5 for $500 in store
    When John Doe returns PS5 to the store
    And shows receipt with price $500
    Then customer will get $500 refunded from store
