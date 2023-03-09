Feature: Booking a products in DemoBlaze

  Scenario Outline: Book a phone in DemoBlaze
    Given User must login to home page
    When User must click on Phone tab
    And User must click on selected phone "<Phone>"
    Then User must verify the phone

    Examples: 
      | Phone   |
      | I Phone |

  Scenario Outline: Book a Laptop in DemoBlaze
    Given User must login to home page
    When User must click on Laptop tab
    And User must click on selected Laptop "<Laptop>"
    Then User must verify the laptop

    Examples: 
      | Laptop  |
      | MacBook |
