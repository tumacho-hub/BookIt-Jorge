@smoke
  Feature: User Verification


    Scenario: verify information about logged user
      Given I logged Bookit api using "sbirdbj@fc2.com" and "asenorval"
      When I get the current user information from api
      Then status code should be 200

      ##eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMzkiLCJhdWQiOiJzdHVkZW50LXRlYW0tbGVhZGVyIn0._vM1-eRoS7SsHu6T-QPdJoEdA8LSwnxUvvTTbhV-8ms
  @db
  Scenario: verify information about logged user from api and database
    Given I logged Bookit api using "sbirdbj@fc2.com" and "asenorval"
    When I get the current user information from api
    Then the information about current user from api and database should match

    @wip
    Scenario: three point verification ( UI,API,DataBase)
        Given user logs in using "sbirdbj@fc2.com" "asenorval"
        And user is on the my self page
        Given I logged Bookit api using "sbirdbj@fc2.com" and "asenorval"
        When I get the current user information from api
        Then UI,API andDatabase user information must be match

