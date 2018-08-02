Feature: High level definition of functionality
  As a user
  I want to do something
  So I can realise a benefit

@tag
  Scenario: My business use case
  Given I do something to begin
  When I perform an action
  Then More stuff and some assertions
  And If I need an And


  # you can't reuse an exact Given statement in another feature file (or when/then/and)
  Scenario Outline: When I want to do a multi parameter test
    Given I do something to begin
    When Multiple things happen such '<first>' as '<second>' this '<third>'
    And Singular parameter example '<another>'
    Then More stuff and some assertions

    Examples:
    | first | second | third | another |
    | parameter | another | last_one | last_last_one |

 # TODO still works in here
  # but do not intersperse comments into feature definitions