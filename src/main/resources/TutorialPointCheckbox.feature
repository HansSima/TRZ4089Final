Feature: TutorialPointCheckbox

  Scenario: Checkbox zakladni zaskrtnuti
    Given Uzivatel se nachazi na strance TutorialPoint checkbox
    When Uzivatel klikne na checkbox "c_bs_1"
    Then Checkbox "c_bs_1" je zaskrtnut

