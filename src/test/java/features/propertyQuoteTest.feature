Feature: Title of your feature

Background:
* this is a property test

@smoke
  Scenario: Create a Join For Free Test
    Given Validating landing page Title
    And click start quote button
     When insert zip code field "11219"
    And click get a quote button
     And insert home address '244 dahill road, brooklyn, NY, 11218'
    Then click let's go button
    And insert home address '244 dahill road'
    
    @dataDriven @csr-677 @regression
    Scenario Outline: Join for free Test With <zipcode>
    Given Validating landing page Title
    And click start quote button
    When insert zip code field <zipcode>
    And click get a quote button
    And insert home address '244 dahill road, brooklyn, NY, 11218'
    Then click let's go button
    And insert property address '244 dahill road'
    Examples:
    |zipcode|
    |'11219'|
    |'11212'|
    |'11216'|


