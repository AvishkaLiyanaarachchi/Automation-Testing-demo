package Smartstack.net.CRM_digital_assets.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_customize_settings {

    By searchOptionSection = By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[2]");     By customMenuTitle1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-tab-settings/div/div[2]/div[2]/div[2]/input");
    By customMenutitle2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-tab-settings/div/div[2]/div[3]/div[2]/input");   By restoreBtn1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-tab-settings/div/div[2]/div[2]/div[3]/button");
    By restoreBtn2= By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-tab-settings/div/div[2]/div[3]/div[3]/button");    By updateBtn = By.xpath("/html/body/app-root/div/div/div[3]/div/app-dashboard/div/div[2]/div[3]/app-tab-settings/div/div[2]/div[9]/button[1]");
    WebDriver driver;

    public Pojo_file_for_customize_settings(WebDriver driver) {
        this.driver = driver;
    }

    public  static  void  timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public boolean test_move_to_the_customize_settings_section(){
        boolean status = true;
        try{
            if(driver.findElement(searchOptionSection).isDisplayed()){
                Assert.assertEquals(true,false,"Display search and filter section when move to the customize settings");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_custom_menu_titles_with_invalidData(String invalidData){
        boolean status = true;
        try{
            try {
                driver.findElement(customMenuTitle1).sendKeys(invalidData);
                Pojo_file_for_customize_settings.timeout2000();
                try {
                    WebElement ele = driver.findElement(customMenuTitle1);
                    String val = ele.getText();
                    System.out.println(val);

                    if (val.equals(invalidData)) {
                        Assert.assertEquals(true, false, "Enter invalid data as custom menu titles");
                    }
                } catch (Exception ex) {
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't find custom menu titles");
            }

                status = true;
                return status;
            }catch (Exception ex){
                System.out.println(ex);
                status = false;
                return status;
            }
    }

    public boolean test_update_custom_menuTitles(String validData1, String validData2){
        boolean status = true;
        try{
            try {
                driver.findElement(customMenuTitle1).clear();
                Pojo_file_for_customize_settings.timeout2000();
                driver.findElement(customMenuTitle1).sendKeys(validData1);
                Pojo_file_for_customize_settings.timeout2000();
                driver.findElement(customMenutitle2).sendKeys(validData2);
                Pojo_file_for_customize_settings.timeout2000();
                driver.findElement(restoreBtn1).click();
                Pojo_file_for_customize_settings.timeout2000();
                driver.findElement(restoreBtn2).click();
                Pojo_file_for_customize_settings.timeout2000();
                driver.findElement(updateBtn).click();
                Pojo_file_for_customize_settings.timeout2000();

                try {
                    WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"pageBodyWrapperID\"]/div[3]/div/app-dashboard/div/div[2]/div[1]/div/app-tab-view/div/div[1]/span"));
                    String val1 = ele1.getText();
                    System.out.println(val1);

                    if (!(val1.equals(validData1))) {
                        Assert.assertEquals(true, false, "Not display updated custom menu titles for tabs");
                    }
                } catch (Exception ex) {
                    driver.findElement(restoreBtn1).click();
                    Pojo_file_for_customize_settings.timeout2000();
                    driver.findElement(restoreBtn2).click();
                    Pojo_file_for_customize_settings.timeout2000();
                    driver.findElement(updateBtn).click();
                    Pojo_file_for_customize_settings.timeout2000();
                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Can't find custom menu titles");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }
}
