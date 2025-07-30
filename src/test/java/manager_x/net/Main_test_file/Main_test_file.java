package manager_x.net.Main_test_file;

import org.openqa.selenium.WebDriver;

public class Main_test_file {

    WebDriver driver;

    public Main_test_file(WebDriver driver) {
        this.driver = driver;
    }

    Page_factory_pattern obj;

    public static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){}
    }
    public boolean test_login_section1(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.clickLoginButton_without_email_password();
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_login_section2(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.clickLoginbutton_with_email_address("admin@gmail.com");
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }

    }

    public boolean test_login_section3(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.clickLoginbutton_with_password("123");
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_login_section4(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.loginWithInvalidemailandPassword("ghqer34","hfde784");
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_login_section5(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.loginWithValidemailAndpassword("admin@gmail.com","123");
            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_select_address_section(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.select_property_address();

            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_logout_option(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.logout_from_system();

            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_login_as_project_manager_wihtout_emailPassword(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.click_projectManagerloginBtn_without_filling_fields();

            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_login_as_project_manager(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.login_as_project_manager("projectmanager@gmail.com","123");

            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

    public boolean test_click_contractor_loginBtn_without_filling_fields(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.click_contractor_loginBtn_without_filling_fields();

            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }
    public boolean test_login_as_contractor(){
        boolean status = true;
        try{
            obj = new Page_factory_pattern(driver);
            obj.login_as_contractor("contractor@gmail.com","123");

            Main_test_file.timeout2000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return status;
        }
    }

}
