Feature: TutorialPointTable

  Scenario: Kontrola dat tabulky
    Given Uzivatel je na strance s tabulkou
    Then V bunce tabulky "/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[1]" jsou data "Alden"
    And V bunce tabulky "/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[2]" jsou data "Cantrell"
    And V bunce tabulky "/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[3]" jsou data "45"
    And V bunce tabulky "/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[4]" jsou data "alden@example.com"
    And V bunce tabulky "/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[5]" jsou data "12000"
    And V bunce tabulky "/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[6]" jsou data "Compliance"

