@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5      |
      | 2     | 2      | 4      |
      | -3    | 2      | -1     |

  Scenario: sqr or rvs input number
    Given One input value, 4
    When I op sqr the value
    Then I wish for the result 2

    Given One input value, 4
    When I op rvs the value
    Then I wish for the result 0.25

  Scenario Outline: sqr or rvs input number
    Given One input value, <Input>
    When I op <opt> the value
    Then I wish for the result <result>

    Examples:
      | Input | opt    | result |
      | 9     | rvs    | 0.1111 |
      | 2     | sqr    | 1.4142 |
      | 169   | sqr    | 13     |
      | -3    | rvs    | -0.3333|
      | 0     | rvs    | 0      |
      | -2    | sqr    | -1     |
