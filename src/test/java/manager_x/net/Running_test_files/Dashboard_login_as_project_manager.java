package manager_x.net.Running_test_files;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import manager_x.net.Main_test_file.Main_test_file;
import manager_x.net.Pojo_files.Pojo_file_for_login_as_project_manager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Objects;

public class Dashboard_login_as_project_manager {

    WebDriver driver;

    Main_test_file obj;
    Pojo_file_for_login_as_project_manager obj1;

    int pass_count;
    int fail_count;
    int total_count;
    ArrayList<String> pass_method_list = new ArrayList<String>();
    ArrayList<String> fail_method_list = new ArrayList<String>();
    static ExtentTest test;
    static ExtentReports report;

    public static void timeout2000() {
        try {
            Thread.sleep(2000);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    @BeforeClass
    public static void startTest()
    {
        report = new ExtentReports("./ManagerX_Test_Reports/Project_Manager_Dashboard_report.html");
        report.addSystemInfo("Manager_x","Dashboard");
        report.addSystemInfo("live site","Project Manager dashboard Test Report");
        test = report.startTest("Project Manager Dashboard");
    }

    //THis method run before all methods
    @BeforeClass
    public void beforeClass() {
        try {
            WebDriverManager.chromedriver().setup();//Setup the chrome driver
//            ChromeOptions ops = new ChromeOptions();
//            ops.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver();
            //driver.manage().deleteAllCookies();
            //Thread.sleep(5000);
            driver.get("https://omega.iitcglobal.net/");//Give the URL
            driver.manage().window().maximize(); //maximize the browser window
            //Thread.sleep(5000);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 1)
    public void test_login_method1() {

        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_as_project_manager_wihtout_emailPassword();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_as_project_manager_wihtout_emailPassword"), "Test Passed:-  Can't login to the system without email address and password");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_as_project_manager_wihtout_emailPassword"), "Test failed:-  Login to the system without email address and password");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 2)
    public void test_login_method2() {

        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_login_as_project_manager();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_login_as_project_manager"), "Test Passed:- Login to the system with valid project manager account");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_login_as_project_manager"), "Test failed:- Can't login to the system with valid project manager account");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 3)
    public void test_select_property_address() {

        total_count++;
        try {
            obj = new Main_test_file(driver);
            boolean status = obj.test_select_address_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("test_select_address_section"), "Test Passed:- Select property address when login as project manager");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("test_select_address_section"), "Test failed:- Can't select property address when login as project manager");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 4)
    public void test_select_pagination_and_search_with_validName_of_project() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.select_pagination_and_search_with_validName_of_project("Rash2","perera","Rash2 perera");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("select_pagination_and_search_with_validName_of_project"), "Test Passed:- Display project list when searching with valid name");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("select_pagination_and_search_with_validName_of_project"), "Test failed:- Not display project list when searching with valid name");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 5)
    public void test_select_project_details_method1() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.select_project_details_method1();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("select_project_details_method1"), "Test Passed:- Display project details");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("select_project_details_method1"), "Test failed:- Not display project details");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 6)
    public void test_select_project_details_method2() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.select_project_details_method2("Deposit");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("select_project_details_method2"), "Test Passed:- Display project details");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("select_project_details_method2"), "Test failed:- Not display project details");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 7)
    public void test_move_to_tasklist_and_search_task() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.move_to_tasklist_and_search_task("new");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_tasklist_and_search_task"), "Test Passed:- Move to task list section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_tasklist_and_search_task"), "Test failed:- Not moved to task list section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 8)
    public void test_madd_new_task_method1() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.add_new_task_method1();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_task_method1"), "Test Passed:- Move to add new task section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_task_method1"), "Test failed:- Not moved to add new task section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 9)
    public void test_add_new_task_method2() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.add_new_task_method2("task1","Create task 1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_task_method2"), "Test Passed:- Create new task from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_task_method2"), "Test failed:- Not create new task from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 10)
    public void test_edit_task_from_list1() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.edit_task_from_list1();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_task_from_list1"), "Test Passed:- Edit task from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_task_from_list1"), "Test failed:- Not edit task from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 11)
    public void test_edit_subtask_from_list2() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.edit_subtask_from_list2("sub task1");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_subtask_from_list2"), "Test Passed:- Edit task from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_subtask_from_list2"), "Test failed:- Not edit task from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 12)
    public void test_edit_task_from_list3() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.edit_task_from_list3("note 1","dhr57438","task");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_task_from_list3"), "Test Passed:- Edit task from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_task_from_list3"), "Test failed:- Not edit task from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 13)
    public void test_delete_task_from_list_and_check_with_calender() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.delete_task_from_list_and_check_with_calender();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("delete_task_from_list_and_check_with_calender"), "Test Passed:- Deleting task and check with calender");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("delete_task_from_list_and_check_with_calender"), "Test failed:- Not deleting task and check with calender");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    @Test(priority = 14)
    public void test_move_to_notification_with_searchData() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.move_to_notification_with_searchData("jully31 task");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_notification_with_searchData"), "Test Passed:- Move to notifications and search data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_notification_with_searchData"), "Test failed:- Not Move to notifications and search data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 15)
    public void test_move_to_contacts_section() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.move_to_contacts_section("ABC");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_contacts_section"), "Test Passed:- Move to contacts and searched data");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_contacts_section"), "Test failed:- Not Move to contacts tab and searched data");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 16)
    public void test_add_new_contact_method1() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.add_new_contact_method1();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_contact_method1"), "Test Passed:- Move to add new contact and click submit button");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_contact_method1"), "Test failed:- Not Move to add new contact tab and can't click submit button");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 17)
    public void test_add_new_cntact_method2() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.add_new_cntact_method2("contact3","test3","fhjhr7234");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_cntact_method2"), "Test Passed:- Can't create contact with invalid email");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_cntact_method2"), "Test failed:- create contact with invalid email");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 18)
    public void test_add_new_contact_method3() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.add_new_contact_method3("contact3@gmnail.com","123","634564636","ABC");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_contact_method3"), "Test Passed:- Create new contact");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_contact_method3"), "Test failed:- Can't create new contact");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 19)
    public void test_import_contact_from_list() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.import_contact_from_list();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("import_contact_from_list"), "Test Passed:- Import contact inside list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("import_contact_from_list"), "Test failed:- Can't import contact inside list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 20)
    public void test_edit_contact_from_list() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.edit_contact_from_list("test");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("edit_contact_from_list"), "Test Passed:-Update contact from list");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("edit_contact_from_list"), "Test failed:- Can't update contact from list");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 21)
    public void test_move_to_settings_section() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.move_to_settings_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_settings_section"), "Test Passed:-Move to setting section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_settings_section"), "Test failed:- Can't move to setting section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }


    @Test(priority = 22)
    public void test_update_fields_of_setting_section() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.update_fields_of_setting_section("John","Smith");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("update_fields_of_setting_section"), "Test Passed:-Update fields of setting section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("update_fields_of_setting_section"), "Test failed:- Can't update fields of setting section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 23)
    public void test_move_to_stage_level_section() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.move_to_stage_level_section();
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("move_to_stage_level_section"), "Test Passed:-Move to the stage level section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("move_to_stage_level_section"), "Test failed:- Can't move to the stage level section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 24)
    public void test_add_new_stage_of_stageLevel() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.add_new_stage_of_stageLevel("Stage2");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_stage_of_stageLevel"), "Test Passed:-Create new stage for stage level section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_stage_of_stageLevel"), "Test failed:- Can't create new stage for stage level section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 25)
    public void test_add_new_sub_stage() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.add_new_sub_stage("Sub stage2");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("add_new_sub_stage"), "Test Passed:-Create new sub stage for stage level section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("add_new_sub_stage"), "Test failed:- Can't create new sub stage for stage level section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @Test(priority = 26)
    public void test_create_sub_category_iside_list() {

        total_count++;
        try {
            obj1 = new Pojo_file_for_login_as_project_manager(driver);
            boolean status = obj1.create_sub_category_iside_list("Sub category stage2");
            if (status == true) {
                pass_count++;
                Assert.assertEquals(true, pass_method_list.add("create_sub_category_iside_list"), "Test Passed:-Create new sub category stage for stage level section");
            } else {
                fail_count++;
                Assert.assertEquals(true, fail_method_list.add("create_sub_category_iside_list"), "Test failed:- Can't create new sub category stage for stage level section");
            }

            System.out.println("pass method Count: " + pass_count);
            System.out.println("Fail method count: " + fail_count);
            System.out.println("Pass method lists: " + pass_method_list);
            System.out.println("Fail method lists: " + fail_method_list);

            Dashboard_login_as_project_manager.timeout2000();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    @AfterMethod
    public void getResult(ITestResult result)
    {
        if(result.getStatus()==ITestResult.FAILURE)
        {
            //Take base64Screenshot screenshot for extent reports
            String base64Screenshot =
                    "data:image/png;base64," + ((TakesScreenshot) Objects.requireNonNull(driver)).getScreenshotAs(OutputType.BASE64);
            //test.log(LogStatus.FAIL , test.addBase64ScreenShot(base64Screenshot));
            test.log(LogStatus.FAIL , "Test Failed: " +result.getName()+"&nbsp&nbsp\n\n"+
                    "<p><b>"+result.getThrowable()+"<p><b>"+ " " + test.addBase64ScreenShot(base64Screenshot));


        } else if (result.getStatus()==ITestResult.SUCCESS) {
            test.log(LogStatus.PASS, "Test Passed:  "+result.getName());
        }else{
            test.log(LogStatus.SKIP, "Test Skipped: "+result.getName());
        }

    }
    // extent.endTest(test);


//    @AfterClass
//    public void afterClass() {
//        driver.quit();
//    }

    @AfterTest
    public static void endTest()
    {
        report.endTest(test);
        report.flush();
    }










}
