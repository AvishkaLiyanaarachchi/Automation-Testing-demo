package Smartstack.net.First_Test_Files;

import Smartstack.net.Pojo_Files.Page_factory_pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class First_test_file_for_smartstack {

    By clickAuthenticationModule = By.xpath("//*[@id=\"sidebar\"]/ul/div[2]/li/a");     By stakeholderGroupTab = By.xpath("//*[@id=\"stackholder-access_master-page_top-buttons_tab\"]/div/div[2]/span");
    By customizePermissionTab = By.xpath("//*[@id=\"stackholder-access_master-page_top-buttons_tab\"]/div/div[3]/span");    By otherStakeholderGrouppropfilepageTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-master-page/div/div[2]/div[2]/div/app-tab-view/div/div[2]/span");
    By settingsTab = By.xpath("//*[@id=\"stackholder-access_master-page_top-buttons_tab\"]/div/div[4]/span");     By emailTemplateTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-master-page/div/div[2]/div[2]/div/app-tab-view/div/div[2]/span");
    By customizationSettings = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[2]/div/div/app-tab-view/div/div[5]");     By clickCrmModule = By.xpath("//*[@id=\"sidebar\"]/ul/div[3]/li/a");
    By organizationTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[1]/div/app-tab-view/div/div[2]/span");    By leadsTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[1]/div/app-tab-view/div/div[3]/span");
    By digitalAssetManagementTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[1]/div/app-tab-view/div/div[4]/span");
    By customizaSettingsTab = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[1]/div/app-tab-view/div/div[5]");    By ecommerceTab = By.xpath("//*[@id=\"sidebar\"]/ul/div[5]/li/a");
    By awaitingpaymentSection = By.id("eCommerce_dashboard_Bar_Awaiting_payment");     By awaitingFullfillmentSection = By.id("eCommerce_dashboard_Bar_Awaiting_fulfilment");    By shippedtab = By.id("eCommerce_dashboard_Bar_Shipped");     By completedTab = By.id("eCommerce_dashboard_Bar_Completed");
    By productTab = By.id("eCommerce_dashboard_Bar_Product");     By productCategoryTab = By.id("eCommerce_dashboard_Bar_Product_categories");     By couponCodeTab = By.id("eCommerce_dashboard_Bar_Coupon_codes");      By quantityDiscountTab = By.id("eCommerce_dashboard_Bar_Quantity_discounts");
    By storesetupTab = By.id("eCommerce_dashboard_Bar_5");
    WebDriver driver;
    Page_factory_pattern obj;

    public First_test_file_for_smartstack(WebDriver driver) {
        this.driver = driver;
    }


    //THis method sued to create login page object and call login method then navigate to the CRM module
    public boolean test_login_section(){
        boolean status = true;
        try{
            //Login to the site
            obj = new Page_factory_pattern(driver);
            obj.loginDetails("&%^&hdjadh","performance@gmail.com", "admin@123", "9", "6", "5", "2", "4", "7");
            Thread.sleep(2000);

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_loginSection_with_password_and_code(){
        boolean status  = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.check_login_details_with_password("85724dfhkj","performance@gmail.com", "fhjs753","admin@123","1","2","3","4","5","6","9","6",
                    "5","2","4","7");
            Thread.sleep(2000);

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_authentication_access(){
        boolean status = true;
        try{
            driver.findElement(clickAuthenticationModule).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_stakeholderGroup_section(){
        boolean status = true;
        try{
            driver.findElement(stakeholderGroupTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_customize_permission_section(){
        boolean status = true;
        try{
            driver.findElement(customizePermissionTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_other_stakeholder_group_profile_page_section(){
        boolean status =true;
        try{
            driver.findElement(otherStakeholderGrouppropfilepageTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_settings_tab(){
        boolean status =true;
        try{
            driver.findElement(settingsTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_email_template_tab(){
        boolean status = true;
        try{
            driver.findElement(emailTemplateTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_customization_settings(){
        boolean status = true;
        try{
            driver.findElement(customizationSettings).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_CRM_section(){
        boolean status = true;
        try{
            driver.findElement(clickCrmModule).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_organization_section(){
        boolean status = true;
        try{
            driver.findElement(organizationTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_leads_section(){
        boolean status = true;
        try{
            driver.findElement(leadsTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_digital_assets_management_section(){
        boolean status = true;
        try{
            driver.findElement(digitalAssetManagementTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_customize_settings_section(){
        boolean status = true;
        try{
            driver.findElement(customizaSettingsTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_ecommerce_section(){
        boolean status = true;
        try{
            driver.findElement(ecommerceTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_awaiting_payment_section(){
        boolean status = true;
        try{
            driver.findElement(awaitingpaymentSection).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_awaiting_fullfillment_section(){
        boolean status = true;
        try{
            driver.findElement(awaitingFullfillmentSection).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_shipped_section_dashboard(){
        boolean status = true;
        try{
            driver.findElement(shippedtab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_completed_section_of_dashboard(){
        boolean status = true;
        try{
            driver.findElement(completedTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_product_tab(){
        boolean status = true;
        try{
            driver.findElement(productTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_product_category_tab(){
        boolean status = true;
        try{
            driver.findElement(productCategoryTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_couponCode_section(){
        boolean status = true;
        try{
            driver.findElement(couponCodeTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_quantity_discountTab(){
        boolean status = true;
        try{
            driver.findElement(quantityDiscountTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_store_setupTab(){
        boolean status = true;
        try{
            driver.findElement(storesetupTab).click();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }


}
