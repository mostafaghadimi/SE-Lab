@tag
Feature: Calculator
  Scenario: add two numbers
    Given three input values, 1 and 2 and +
    When I operate the three values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given three input values, <first> and <second> and <third>
    When I operate the three values
    Then I expect the result <result>
    Examples:
      | first | second | third | result |
      | 1 | 12 | + | 13 |
      | -1 | 6 | + | 5 |
      | 2 | 2 | + | 4 |

  Scenario: minus two numbers
    Given three input values, 1 and 2 and -
    When I operate the three values
    Then I expect the result -1

  Scenario Outline: minus two numbers
    Given three input values, <first> and <second> and <third>
    When I operate the three values
    Then I expect the result <result>
    Examples:
      | first | second | third | result |
      | 1 | 12 | - | -11 |
      | -1 | 6 | - | -7|
      | 2 | 2 | - | 0 |

  Scenario: multiply two numbers
    Given three input values, 1 and 2 and *
    When I operate the three values
    Then I expect the result 2

  Scenario Outline: multiply two numbers
    Given three input values, <first> and <second> and <third>
    When I operate the three values
    Then I expect the result <result>
    Examples:
      | first | second | third | result |
      | 1 | 12 | * | 12 |
      | -1 | 6 | * | -6 |
      | 2 | 2 | * | 4 |
  Scenario: divide two numbers
    Given three input values, 2 and 2 and /
    When I operate the three values
    Then I expect the result 1

  Scenario Outline: divide two numbers
    Given three input values, <first> and <second> and <third>
    When I operate the three values
    Then I expect the result <result>
    Examples:
      | first | second | third | result |
      | 12 | 12 | / | 1 |
      | 6 | 2 | / | 3 |
      | 7 | 3 | / | 2 |