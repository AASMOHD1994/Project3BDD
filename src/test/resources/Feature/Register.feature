Feature: SimpleTest

  @DI
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    |name|Age|Nationality|Qualitification|
    |AasMohd|31|Indian|B.Tech|
    |Aas1|29|Indian|B.Com|
    |Aas2|30|Indian|B.Sc|
    And some other precondition
    Given II want to write a step with precondition
    And somee other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes
