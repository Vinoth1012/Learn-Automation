@test
Feature: I want to use this template for my feature file
Scenario: Title
    Given Launch the browser
    When Open the application
    Then Homepage should be displayed
    When Search for the Product
    Then Search Results should be displayed 
    And Close the application

  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
