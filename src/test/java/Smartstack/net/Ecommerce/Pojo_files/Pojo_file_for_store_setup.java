package Smartstack.net.Ecommerce.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Pojo_file_for_store_setup {

    By acceptinOrderInput = By.id("eCommerce_general_Accepting_INPUTSWITCH");   By timezoneOption = By.id("eCommerce_general_TimeZone_dropdown");   By saveBtn = By.id("eCommerce_general_Buttons_Save_BUTTON");
    By weightMeasurementOption = By.id("eCommerce_general_Weight_dropdown");    By selectWeihtMeasurement = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-store-setup/div/div[2]/app-general/div/div[3]/div[2]/div/div/div[2]/div[1]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By lengthMeasurementOption = By.id("eCommerce_general_Length_dropdown");    By lengthMeasurement = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-store-setup/div/div[2]/app-general/div/div[3]/div[2]/div/div/div[2]/div[2]/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]");
    By decimalTokenFiel = By.id("Decimal_Input");   By thousandTokenFiled = By.xpath("//*[@id=\"eCommerce_general_Thousand\"]/input");  By decimalPlacesField = By.id("eCommerce_general_DecimalPlace_INPUT");
    By prefixOption = By.id("eCommerce_general_Prefix_INPUT");  By sufixOption = By.id("eCommerce_general_Suffix_INPUT");   By storeCurrencyOption = By.id("eCommerce_general_StoreCurrency_dropdown");
    By paymentTab = By.id("eCommerce_dashboard_Bar_1");     By selectCraetemanualPaymentmehtodOption = By.id("eCommerce_payment_CreateManual_BUTTON");      By craeteCustomPayemntOption = By.id("eCommerce_payment_ManualPayment_Create");
    By cutomPaymentmehtodName = By.id("eCommerce_custom-payment-method_Name_INPUT");    By additonaldetailsField = By.id("eCommerce_custom-payment-method_Additional_INPUT");   By paymentInstruction = By.id("eCommerce_custom-payment-method_Instructions_INPUT");
    By saveBtnOfpayment = By.id("eCommerce_custom-payment-method_Buttons_Save_BUTTON");     By updatePaymentOptionBtn = By.id("eCommerce_payment_SetupMethods_Update_BUTTON_0");    By deactivateBtn= By.id("eCommerce_custom-payment-method_Buttons_Deactivate_BUTTON");


    WebDriver driver;

    public Pojo_file_for_store_setup(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public boolean test_move_to_general_tab(){
        boolean status = true;
        try{
            driver.findElement(acceptinOrderInput).click();
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(saveBtn).click();
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(timezoneOption).click();
            Pojo_file_for_store_setup.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-store-setup/div/div[2]/app-general/div/div[3]/div[2]/div/div/div[1]/div/p-dropdown/div/div[3]/div/ul/li")).isDisplayed()){
                    Assert.assertEquals(true,false,"Not display timezone list still display 'No results found option'");
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

    public boolean test_select_options_of_generalTab(String decimal, String thosandtoken, String decimalplaces, String prefix, String suffix){
        boolean status = true;
        try{
            driver.findElement(weightMeasurementOption).click();
            Pojo_file_for_store_setup.timeout2000();
            try{
                driver.findElement(selectWeihtMeasurement).click();
                Pojo_file_for_store_setup.timeout2000();
            }catch (Exception ex){}
            driver.findElement(lengthMeasurementOption).click();
            Pojo_file_for_store_setup.timeout2000();
            try{
                driver.findElement(lengthMeasurement).click();
                Pojo_file_for_store_setup.timeout2000();
            }catch (Exception ex){}
            driver.findElement(decimalTokenFiel).sendKeys(decimal);
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(thousandTokenFiled).sendKeys(thosandtoken);
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(decimalPlacesField).sendKeys(decimalplaces);
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(prefixOption).sendKeys(prefix);
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(sufixOption).sendKeys(suffix);
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(storeCurrencyOption).click();
            Pojo_file_for_store_setup.timeout2000();

            try{
                if(driver.findElement(By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[3]/app-store-setup/div/div[2]/app-general/div/div[4]/div[2]/div/div/div[1]/div[1]/div/p-dropdown/div/div[3]/div/ul/li")).isDisplayed()){
                    Assert.assertEquals(true,false,"Not display store currency option, still display 'No results found'");
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

    public boolean test_payment_tab_section(String paymentName, String additionalDetails, String instructions, String updatepaymentName){
        boolean status = true;
        try{
            driver.findElement(paymentTab).click();
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(selectCraetemanualPaymentmehtodOption).click();
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(craeteCustomPayemntOption).click();
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(cutomPaymentmehtodName).sendKeys(paymentName);
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(additonaldetailsField).sendKeys(additionalDetails);
            Pojo_file_for_product_section.timeout2000();
            driver.findElement(paymentInstruction).sendKeys(instructions);
            Pojo_file_for_product_section.timeout2000();
            driver.findElement(saveBtnOfpayment).click();
            Pojo_file_for_store_setup.timeout2000();

            driver.findElement(updatePaymentOptionBtn).click();
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(cutomPaymentmehtodName).sendKeys(updatepaymentName);
            Pojo_file_for_store_setup.timeout2000();
            driver.findElement(saveBtnOfpayment).click();
            Pojo_file_for_store_setup.timeout2000();

            driver.findElement(deactivateBtn).click();
            Pojo_file_for_store_setup.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }


}
