package Smartstack.net.Ecommerce.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pojo_file_for_dashboard_section {

    By  showIcon = By.id("eCommerce_ecommerce-all_main_Top_Minus");     By hideIcon = By.id("eCommerce_ecommerce-all_main_Top_Plus");   By paginationSection = By.id("eCommerce_ecommerce-all_Paginator");
    WebDriver driver;

    public Pojo_file_for_dashboard_section(WebDriver driver) {
        this.driver = driver;
    }

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}

    }

    public boolean test_move_to_the_dashboard_section(){
        boolean status = true;
        try {
            try {
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"eCommerce_ecommerce-all_Table_Section\"]/div/span"));
                String val = ele.getText();
                System.out.println(val);

                if (val.equals("Sorry, no matching results found")) {
                    Assert.assertEquals(true, false, "Not display records, when moving to the dashboard/All section");
                }
            } catch (Exception ex) {
                Assert.assertEquals(true, false, "If not display records in dashboard section , not display message");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_show_hide_options_for_dashboard(){
        boolean status = true;
        try{
            try {
                if (driver.findElement(showIcon).isDisplayed()) {
                    driver.findElement(showIcon).click();
                    Pojo_file_for_dashboard_section.timeout2000();
                    driver.findElement(hideIcon).click();
                    Pojo_file_for_dashboard_section.timeout2000();

                }
            }catch (Exception ex){
                Assert.assertEquals(true,false,"Not display show/hide options of dashboard");
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_move_to_the_awaitignPayment_shipped_completed_sections(){
        boolean status = true;
        try{
            try {
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"eCommerce_ecommerce-all_Table_Section\"]/div/span"));
                String val = ele.getText();
                System.out.println(val);

                if (val.equals("Sorry, no matching results found") || driver.findElement(paginationSection).isDisplayed()) {
                    Assert.assertEquals(true, false, "Not display records, when moving to the dashboard/All section , display pagination section without records");
                }
            }catch (Exception ex){
                Assert.assertEquals(true, false, "If not display records in dashboard section , not display message");
            }

            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }

    }


}
