
 Feature: Challenges Tasks


   Scenario: Login as User
     Given : The user is on the Login page
     When The user enter self credentials
     Then The user see titles on the right of page
     |Dashboard|
     |Developers|
     |Edit Profile|
     |Mustafa |

   @wip
     Scenario: Login as User
       Given : The user is on the Login page
       When Gecerli kriterleri giris yapar
       And My profile e gider
       And Tiklar "Add Experience"
       And Bilgileri doldurur
       Then Overview Sayfasina geldigini dogrular







