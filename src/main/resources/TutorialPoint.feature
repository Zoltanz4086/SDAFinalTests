Feature: TutorialPoint

  #REQ - C1
  Scenario: Checkbox zakladni zaskrtavani
    Given Uzivatel je na stranke tutorialpoint checkbox
    When Uzivatel zaklikne checkbox s id "c_bs_1"
    Then Uzivatel vidi zaskrtnuty checkbox id "c_bs_1"

    #REQ - C2
  Scenario: Checkbox zaskrtnuti vsech checkboxu
    Given Uzivatel je na stranke tutorialpoint checkbox
    When Uzivatel klikne na tlacitko plus pro rozbaleni nabidky s xpath "/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"
    And Uzivatel zaklikne checkbox s id "c_bf_1"
    And Uzivatel zaklikne checkbox s id "c_bf_2"
    Then Uzivatel vidi zaskrtnuty checkbox id "c_bs_1"

    #REQ - C2
  Scenario: Checkbox odskrtnuti checkboxu odskrtne i nadrazeny checkbox
    Given Uzivatel je na stranke tutorialpoint checkbox
    When Uzivatel zaklikne checkbox s id "c_bs_1"
    And Uzivatel klikne na tlacitko plus pro rozbaleni nabidky s xpath "/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"
    And Uzivatel zaklikne checkbox s id "c_bf_1"
    Then Uzivatel vidi nezaskrtnuty checkbox s id "c_bs_1"

    #REQ-C3
  Scenario: Checkox hromadne odskrtnuti
    Given Uzivatel je na stranke tutorialpoint checkbox
    When Uzivatel zaklikne checkbox s id "c_bs_1"
    And Uzivatel klikne na tlacitko plus pro rozbaleni nabidky s xpath "/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"
    Then Uzivatel vidi zaskrtnuty checkbox s id "c_bf_1"
    And Uzivatel vidi zaskrtnuty checkbox s id "c_bf_2"
    When Uzivatel zaklikne checkbox s id "c_bs_1"
    Then Uzivatel vidi nezaskrtnuty checkbox s id "c_bf_1"
    And Uzivatel vidi nezaskrtnuty checkbox s id "c_bf_2"