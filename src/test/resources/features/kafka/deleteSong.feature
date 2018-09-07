Feature:
  As kafka administrator
  I want to delete an existing song
  so that the song won't be visible

  Scenario Outline: Delete song
    Given I have access to Kafka Service
    And the song with "<id>" exists
    When I delete a song with "<id>"
    Then I wont see the song with that "<id>"
    Examples:
      | id |
      | 2  |