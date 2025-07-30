package Meris_hub.Main_test_files;

import org.openqa.selenium.WebDriver;

public class Main_test_file {

    WebDriver driver;

    public Main_test_file(WebDriver driver){
        this.driver = driver;
    }

    Page_factory_pattern obj;

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }

    public boolean test_login_method1(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.click_loginBtn_without_email_and_password();
            Main_test_file.timeout2000();

            status = true;
            return status;

        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }

    }

    public boolean test_login_method2(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.enter_email_and_password_and_click_loginBtn("dafdafd","123");
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            status = false;
            return status;
        }
    }
}
