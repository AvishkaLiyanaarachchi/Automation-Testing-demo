package Smartstack.net.Authentication_access.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Pojo_file_for_Edit_Stakeholder {

    By searchField = By.id("stackholder-access_individual-stackholder_search_INPUT");   By editIconOfstakeholder = By.id("stackholder-access_individual-stackholder_update_BUTTON_0");  By worphonefield1 = By.id("authentication_profile-filed_work_phone_INPUT");
    By workphone2 = By.id("authentication_profile-filed_phone_INPUT");  By mobileInput = By.id("authentication_profile-filed_mobile_INPUT");    By addanitehrpostalAddressLink = By.id("authentication_profile-filed_Add_Postal_Address_Click");
    By addressField = By.id("authentication_profile-filed_Postal_Address_INPUT");   By addressLine2 = By.id("authentication_profile-filed_Postal_Address_line2_INPUT");     By cityField = By.id("authentication_profile-filed_Postal_Address_City_INPUT");
    By countryOption = By.id("authentication_profile-filed_country_dropdown");  By inputOFcountryoption = By.xpath("//*[@id=\"authentication_profile-filed_country_dropdown\"]/div/div[3]/div[1]/div/input");
    By selectCountryOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[3]/div[1]/app-profile-details/div/div[2]/div[4]/div/app-profile-fields/div/div/div[4]/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem[1]");
    By stateOption = By.id("authentication_profile-filed_Postal_Address_State_dropdown");   By selectStateoption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[3]/div[1]/app-profile-details/div/div[2]/div[4]/div/app-profile-fields/div/div/div[5]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By postcodeField = By.id("authentication_profile-filed_Postal_Address_Postcode_INPUT");     By itemRemoval = By.id("authentication_login-access_removal_INPUTSWITCH");      By addStakeholderGroupBtn = By.id("authentication_stakeholder-groups_Add_button");
    By stakeholdergroupOption = By.id("authentication_stakeholder-groups_user_prompt_dropdown_1");  By selectStakeholderGroup2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[3]/div[3]/app-stakeholder-groups/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[3]");
    By selectStackeholderGroup1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[3]/div[3]/app-stakeholder-groups/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By typeOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[3]/div[3]/app-stakeholder-groups/div/div[2]/div/div[2]/div[1]/div[2]/div[2]/div[3]/app-tree-view1/div/div/div/div/div");
    By changeRateField = By.id("authentication_stakeholder-groups_rate_INPUT_1");   By makeThisprimaryBtn = By.id("authentication_stakeholder-groups_Make_button");     By manageStakeholderGroupOption = By.id("authentication_stakeholder-groups_Manage_button");
    By selectStakeholderGroupinStakeholderGroupSection = By.id("authentication_select-stakeholder-group_StakeholderGroup_Name_0");      By selectStakehodlerGroup2instaekhodlerGroupSection = By.id("authentication_select-stakeholder-group_StakeholderGroup_Name_1");
    By allowAccessOption = By.id("stackholder-access_access-level-settings_allow-full-access_SWITCH");      By accessModule1 = By.id("stackholder-access_access-level-settings_allow-access-1_SWITCH_0");   By accessModule2 = By.id("stackholder-access_access-level-settings_allow-access-1_SWITCH_2");
    By accessModule3 = By.id("stackholder-access_access-level-settings_allow-access-1_SWITCH_4");   By switcttoSigleModuleBtn = By.id("stackholder-access_access-level-settings_switch-module_BUTTON");     By selectedaModuleOption = By.id("stackholder-access_access-level-settings_select-module_DROPDOWN");
    By selectModuleOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/div/app-group-stakeholder/div/div[6]/app-access-level-settings/div/div[3]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By allowOptionforSElectedModule = By.id("stackholder-access_access-level-settings_first-level_SWITCH_0");   By allowOptionForselectedModule2 = By.id("stackholder-access_access-level-settings_first-level_SWITCH_2");
    By indivualStakeholderTab = By.xpath("//*[@id=\"stackholder-access_master-page_top-buttons_tab\"]/div/div[1]/span");    By laguageOption = By.id("authentication_localisation_language_dropdown");
    By searchOptionOflanguage = By.xpath("//*[@id=\"authentication_localisation_language_dropdown\"]/div/div[3]/div[1]/div/input");
    By selectLanguage = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[4]/div[1]/app-localisation-settings/div/div[2]/div[1]/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem[1]");
    By dateformatOption = By.id("authentication_localisation_date_dropdown");       By selectedDateformat = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[4]/div[1]/app-localisation-settings/div/div[2]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By timeformatoption = By.id("authentication_localisation_time_drpdown");    By selectTiemformat = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[4]/div[1]/app-localisation-settings/div/div[2]/div[3]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[1]");
    By weekstratoption = By.id("authentication_localisation_week_start_dropdown");  By selectweekstart = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[4]/div[1]/app-localisation-settings/div/div[2]/div[4]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By timezoneoption = By.id("authentication_localisation_time_zone_dropdown");    By selecttimeoption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-stakeholder-details/div/div[4]/div[1]/app-localisation-settings/div/div[2]/div[5]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[5]");
    By stakeholderAccesslist = By.id("authentication_stake-dash-access_stakeholder_dropdown");  By allowThiStakeholder = By.id("authentication_stake-dash-access_allow_access_INPUTSWITCH");    By filterStakeholderGroupOption = By.id("authentication_stake-dash-access_change_group_treeView");
    By selectStakeholderGroup1 = By.xpath("//*[@id=\"authentication_stake-dash-access_change_group_treeView\"]/div/div[2]/div[1]/div/div");     By selectStakeholderSubGroup = By.xpath("//*[@id=\"authentication_stake-dash-access_change_group_treeView\"]/div/div[2]/div[1]/div[2]/app-sub-tree-view1/div/div/div/div");
    By searchFieldOfStakeholderAccess = By.id("authentication_stake-dash-access_search_box_INPUT");     By socialAccountField1 = By.id("authentication_social-profile_messenger_INPUT_1");  By socialAccountField2 = By.id("authentication_social-profile_messenger_INPUT_2");
    By viewBtnOfSocialProfile = By.id("authentication_social-profile_view_button1");    By addSocialProfileBtn = By.id("authentication_social-profile_add_stakeholder");    By accountName = By.id("authentication_social-profile_new_social_INPUT");
    By updateBtn = By.id("authentication_social-profile_new_social_update");    By Okpopup = By.id("stackholder-access_alert-box_ok_BUTTON");   By updateBtnOfeditStakeholder = By.id("authentication_stakeholder-details_Update");
    By manageSocialProfileBtn = By.id("authentication_social-profile_manage_stakeholder");      By moveOptionofmanageAccounts = By.xpath("//*[@id=\"authentication_manage-social-accounts_Media_Move_2\"]/button");     By moveInputOfmanageAccounts = By.id("authentication_manage-social-accounts_Media_Move_INPUT_2");
    By moveBtnofManageaccount =By.id("authentication_manage-social-accounts_Media_Move_BUTTON_2");      By updateBtnOfmanageAccounts = By.id("authentication_manage-social-accounts_Main_Buttons_Section_Update_BUTTON");
    By plceLivedOption = By.xpath("//*[@id=\"authentication_social-profile_tab_place\"]/span");     By currentCity = By.id("authentication_social-profile_current_city_INPUT");     By homeTown = By.id("authentication_social-profile_home_town_INPUT");
    WebDriver driver;

    public Pojo_file_for_Edit_Stakeholder(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout1000(){
        try{
            Thread.sleep(1000);
        }catch (Exception ex){}
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public static void timeout3000(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){}
    }

    public boolean test_with_edit_stakeholder(String arg1, String worphone, String workphone22, String mobileNo, String address, String address2, String city, String enterInvalidCountry, String enterValidCountry ,String postcode){
        boolean status = true;
        try{
            driver.findElement(searchField).sendKeys(arg1);
            Pojo_file_for_Edit_Stakeholder.timeout3000();
            try {
                driver.findElement(editIconOfstakeholder).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(worphonefield1).sendKeys(worphone);
                    Pojo_file_for_Edit_Stakeholder.timeout2000();
                    driver.findElement(workphone2).sendKeys(workphone22);
                    Pojo_file_for_Edit_Stakeholder.timeout2000();
                    driver.findElement(mobileInput).sendKeys(mobileNo);
                    Pojo_file_for_Edit_Stakeholder.timeout2000();
                }catch (Exception ex){}

                try {
                    driver.findElement(addanitehrpostalAddressLink).click();
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(addressField).sendKeys(address);
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(addressLine2).sendKeys(address2);
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(cityField).sendKeys(city);
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(countryOption).click();
                Pojo_file_for_Edit_Stakeholder.timeout1000();
                driver.findElement(inputOFcountryoption).sendKeys(enterInvalidCountry);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(inputOFcountryoption).clear();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(inputOFcountryoption).sendKeys(enterValidCountry);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(selectCountryOption1).click();
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(stateOption).click();
                Pojo_file_for_Edit_Stakeholder.timeout1000();
                try {
                    driver.findElement(selectStateoption1).click();
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(postcodeField).sendKeys(postcode);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(itemRemoval).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();

            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display edit stakeholder section");
            }

                status = true;
                return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_add_stakeholderGroup_option(String arg1){
        boolean status = true;
        try{
            try {
                driver.findElement(addStakeholderGroupBtn).click();
                Pojo_file_for_Edit_Stakeholder.timeout3000();  //Can't select another stakeholder group
                driver.findElement(stakeholdergroupOption).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(selectStakeholderGroup2).click();
                }catch (Exception ex){
                    driver.findElement(selectStakeholderGroup1).click();
                }

                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(typeOption1).click();
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(changeRateField).sendKeys(arg1);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(makeThisprimaryBtn).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();

            }catch (Exception ex){

                try
                {
                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
                    wait.until(ExpectedConditions.elementToBeClickable(By.id("authentication_stakeholder-groups_user_prompt_dropdown_0")));
                    Assert.assertEquals(true, false, "1.Stakeholder group, type, changeout rate display as disable and Can't create new stakeholder group\n\n" +
                            "2.Can't create new stakeholder group and group as make a primary\n\n" +
                            "3. Allow full access option, display as disable");

                }
                catch (Exception e)
                {
                    if (driver.findElement(By.id("authentication_stakeholder-groups_user_prompt_dropdown_0")).isEnabled()) {
                        driver.findElement(By.id("authentication_stakeholder-groups_user_prompt_dropdown_0")).click();
                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                    }

                }

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_select_localization_settings(String arg1, String invaliddata, String validData){
        boolean status = true;
        try{
            driver.findElement(manageStakeholderGroupOption).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(selectStakeholderGroupinStakeholderGroupSection).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(selectStakehodlerGroup2instaekhodlerGroupSection).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            try {
                    driver.findElement(allowAccessOption).click();
                    Pojo_file_for_Edit_Stakeholder.timeout2000();
                    try {
                        driver.findElement(accessModule1).click();
                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                        driver.findElement(accessModule2).click();
                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                        driver.findElement(accessModule3).click();

                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                        driver.findElement(switcttoSigleModuleBtn).click();
                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                        driver.findElement(selectedaModuleOption).click();
                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                        try {
                            driver.findElement(selectModuleOption1).click();
                        } catch (Exception ex) {
                        }
                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                        driver.findElement(allowOptionforSElectedModule).click();
                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                        driver.findElement(allowOptionForselectedModule2).click();
                        Pojo_file_for_Edit_Stakeholder.timeout2000();

                    }catch (Exception ex){
                        driver.findElement(allowAccessOption).click();
                        Pojo_file_for_Edit_Stakeholder.timeout2000();
                    }

            }catch (Exception ex){
                System.out.println("Allow access option display as disabled");
            }

            driver.findElement(indivualStakeholderTab).click();
            Pojo_file_for_Edit_Stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(arg1);
            Pojo_file_for_Edit_Stakeholder.timeout3000();
            try{
                driver.findElement(editIconOfstakeholder).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(laguageOption).click();
                Pojo_file_for_Edit_Stakeholder.timeout1000();
                driver.findElement(searchOptionOflanguage).sendKeys(invaliddata);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(searchOptionOflanguage).clear();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(searchOptionOflanguage).sendKeys(validData);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(selectLanguage).click();
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(dateformatOption).click();
                Pojo_file_for_Edit_Stakeholder.timeout1000();
                try {
                    driver.findElement(selectedDateformat).click();
                }catch (Exception ex){}

                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(timeformatoption).click();
                Pojo_file_for_Edit_Stakeholder.timeout1000();
                try {
                    driver.findElement(selectTiemformat).click();
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(weekstratoption).click();
                Pojo_file_for_Edit_Stakeholder.timeout1000();
                try {
                    driver.findElement(selectweekstart).click();
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(timezoneoption).click();
                Pojo_file_for_Edit_Stakeholder.timeout1000();
                try {
                    driver.findElement(selecttimeoption1).click();
                }catch (Exception ex){}
                Pojo_file_for_Edit_Stakeholder.timeout2000();

                try{
                    WebElement ele = driver.findElement(worphonefield1);
                    String val1 = ele.getAttribute("value");

                    WebElement ele1 = driver.findElement(addressField);
                    String val2 = ele1.getAttribute("value");

                    if(val1.isEmpty() || val2.isEmpty()){
                        Assert.assertEquals(true, false,"After managing stakeholder group , not display updated profile details for selected stakeholder ");
                    }
                }catch (Exception ex){}

            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display edit stakeholder");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_stakeholder_Access_setting(String arg1){
        boolean status = true;
        try{
            driver.findElement(stakeholderAccesslist).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(stakeholderAccesslist).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(allowThiStakeholder).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            try {
                driver.findElement(filterStakeholderGroupOption).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(selectStakeholderGroup1).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(selectStakeholderSubGroup).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(searchFieldOfStakeholderAccess).sendKeys(arg1);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(searchFieldOfStakeholderAccess).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
                Pojo_file_for_Edit_Stakeholder.timeout2000();

                Assert.assertEquals(true,false,"Not display stakeholder list when filtering and searching");

            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            Assert.assertEquals(true,false,"Not display stakeholder dashboard access settings");
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_social_accounts_section(String invalidData1, String validData1, String validData2, String profileName){
        boolean status = true;
        try{
            try {
                driver.findElement(socialAccountField1).sendKeys(invalidData1);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(socialAccountField1).clear();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(socialAccountField1).sendKeys(validData1);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(viewBtnOfSocialProfile).click();
                Pojo_file_for_Edit_Stakeholder.timeout3000();
                // hold all window handles in array list
                ArrayList<String> newTb1 = new ArrayList<String>(driver.getWindowHandles());
                //switch to parent window
                driver.switchTo().window(newTb1.get(0));
                System.out.println("Page title of parent window: " + driver.getTitle());
                Pojo_file_for_Edit_Stakeholder.timeout3000();
            }catch (Exception ex){}

            try {
                driver.findElement(socialAccountField2).sendKeys(invalidData1);
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(socialAccountField2).clear();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                driver.findElement(socialAccountField2).sendKeys(validData2);
                Pojo_file_for_Edit_Stakeholder.timeout2000();

            }catch (Exception ex1){}

            driver.findElement(addSocialProfileBtn).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(accountName).sendKeys(profileName);
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(updateBtn).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();

            try {
                driver.findElement(Okpopup).click();
                Pojo_file_for_Edit_Stakeholder.timeout3000();
            }catch (Exception ex){}

            driver.findElement(addSocialProfileBtn).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(accountName).sendKeys(profileName);
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(updateBtn).click();
            Pojo_file_for_Edit_Stakeholder.timeout3000();

            try{
                driver.findElement(Okpopup).click();
                Pojo_file_for_Edit_Stakeholder.timeout3000();

            }catch (Exception ex){
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"authentication_social-profile_messenger_Fields_6\"]/span"));
                String val = ele.getText();
                System.out.println(val);
                if(val.equals(profileName)){
                    Assert.assertEquals(true,false,"Create already exist social accounts");
                }

            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_manage_social_accounts(String arg1){
        boolean status = true;
        try{
            driver.findElement(manageSocialProfileBtn).click();
            Pojo_file_for_Edit_Stakeholder.timeout3000();
            try{
                driver.findElement(moveOptionofmanageAccounts).click();
                Pojo_file_for_Edit_Stakeholder.timeout2000();
                try {
                    driver.findElement(moveBtnofManageaccount).click();
                    Pojo_file_for_Edit_Stakeholder.timeout3000();

                    Assert.assertEquals(true, false, "Click move button without data and moved record between list");
                }catch (Exception ex){
                    driver.findElement(moveInputOfmanageAccounts).sendKeys(arg1);
                    Pojo_file_for_Edit_Stakeholder.timeout2000();
                    driver.findElement(moveBtnofManageaccount).click();
                    Pojo_file_for_Edit_Stakeholder.timeout3000();
                }
            }catch (Exception ex){
                Assert.assertEquals(true, false, "Not display move option");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public  boolean test_place_lived_section(String arg1, String arg2){
        boolean status = true;
        try {
            driver.findElement(updateBtnOfmanageAccounts).click();
            Pojo_file_for_Edit_Stakeholder.timeout3000();
            driver.findElement(plceLivedOption).click();
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(currentCity).sendKeys(arg1);
            Pojo_file_for_Edit_Stakeholder.timeout2000();
            driver.findElement(homeTown).sendKeys(arg2);

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            Assert.assertEquals(true,false,"Not display place lived option");
            status = false;
            return status;
        }
    }
    public boolean test_update_selected_stakeholder(){
        boolean status = true;
        try{
            driver.findElement(updateBtnOfeditStakeholder).click();
            Thread.sleep(4000);

            try{
               if(driver.findElement(By.id("stakeholderFullnameId")).isDisplayed()){
                   Assert.assertEquals(true,false,"After updating  edit stakeholder section , not move to the stakeholder list");
               }

            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }
}
