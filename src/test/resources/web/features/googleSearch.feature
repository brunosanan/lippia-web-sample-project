@Search
Feature: As a potential client i need to search in google to find a web site

@Smoke @Automated @Search
Scenario Outline: The client search by <word>
  Given The client is on google page
  When The client search for word <word>
  Then The client verify that results are shown properly
  Examples:
    | word |
    | Crowdar Academy |
    | Calidad |
    | Software |
    | Testing |