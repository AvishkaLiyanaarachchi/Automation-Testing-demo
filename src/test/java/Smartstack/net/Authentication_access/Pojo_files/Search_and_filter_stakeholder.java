package Smartstack.net.Authentication_access.Pojo_files;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Search_and_filter_stakeholder {

    By searchField = By.id("stackholder-access_individual-stackholder_search_INPUT");   By filterStakehodlerOption = By.id("Elements_services_tree_view_main");     By viewbyOnwerOption = By.id("stackholder-access_individual-stackholder_view-stackholder_DROPDOWN");
    By selectstakeholderGroup2 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND1");   By selectstakeholderGroup1 = By.id("Elements_services_sub_view_treeViewItems_SINGLE$ROUND2");   By showallOption = By.id("stackholder-access_individual-stackholder_show-all_DROPDOWN");
    By showallOption1 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-individual-stakeholder/div/div[2]/div[1]/div[1]/p-dropdown[1]/div/div[3]/div/ul/p-dropdownitem[2]");
    By showallOption2 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-individual-stakeholder/div/div[2]/div[1]/div[1]/p-dropdown[1]/div/div[3]/div/ul/p-dropdownitem[3]");
    By selectShowalloption = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-individual-stakeholder/div/div[2]/div[1]/div[1]/p-dropdown[1]/div/div[3]/div/ul/p-dropdownitem[1]");
    By rightsidePagination = By.xpath("//*[@id=\"stackholder-access_individual-stackholder_pagintion_PAGINATOR\"]/div/button[4]");   By leftsidePagination = By.xpath("//*[@id=\"stackholder-access_individual-stackholder_pagintion_PAGINATOR\"]/div/button[1]");
    By recordsPerpageOption = By.id("stackholder-access_individual-stackholder_rows-per_DROPDOWN");     By selectRecordesPerpageOptionas100 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-individual-stakeholder/div/div[2]/div[1]/div[1]/p-dropdown[2]/div/div[3]/div/ul/p-dropdownitem[5]");
    By selectRecordsPerpageOptionas15 = By.xpath("/html/body/app-root/div/div/div[3]/div/app-master-page/div/div[3]/div/app-individual-stakeholder/div/div[2]/div[1]/div[1]/p-dropdown[2]/div/div[3]/div/ul/p-dropdownitem[2]");
    WebDriver driver;

    public Search_and_filter_stakeholder(WebDriver driver) {
        this.driver = driver;
    }

    public  static void timeout1000(){
        try{
            Thread.sleep(1000);
        }catch (Exception ex){

        }
    }

    public  static void timeout2000(){
        try{
            Thread.sleep(2000);
        }catch (Exception ex){

        }
    }

    public  static void timeout3000(){
        try{
            Thread.sleep(3000);
        }catch (Exception ex){

        }
    }

    public boolean test_search_option_of_stakeholder_list(String invalidName , String firstName, String lastName, String emailAddress){
        boolean status = true;
        try{
            driver.findElement(searchField).sendKeys(invalidName);
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(firstName);
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(lastName);
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(emailAddress);
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Search_and_filter_stakeholder.timeout3000();

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }

    public boolean test_search_option_of_stakeholder_list_with_fullName(String fullname){
        boolean status = true;
        try{
            driver.findElement(searchField).sendKeys(fullname);
            Search_and_filter_stakeholder.timeout3000();

            try {
                WebElement ele = driver.findElement(By.xpath("//*[@id=\"stackholder-access_master-page_individual-stackholder_DIV\"]/app-individual-stakeholder/div/div[2]/div[1]/div[2]/div/span"));
                String val = ele.getText();
                System.out.println(val);
                if (val.equals("There are no records to display")) {
                    Assert.assertEquals(true, false, "Not display stakeholder When searching with full name");
                }
            }catch (Exception ex){}


                status = true;
                return status;
            }catch (Exception ex){
                System.out.println(ex);
                status = false;
                return  status;
            }
    }

    public boolean test_open_filter_stakeholder_group_option(){
        boolean status = true;
        try{
            driver.findElement(searchField).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(filterStakehodlerOption).click();
            Search_and_filter_stakeholder.timeout1000();

            try{
                WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"Elements_services_tree_view_main\"]/div[2]/div[1]/div/div"));
                String val = ele1.getText();
                System.out.println(val);

                WebElement ele2 = driver.findElement(By.xpath("stackholder-access_individual-stackholder_stackholder-group_SPAN_0_0"));
                String  val1 = ele2.getText();
                System.out.println(val1);

                if(val.equals(val1)){

                }else{
                    Assert.assertEquals(true, false,"Not display correct stakeholder list according to the selected stakeholder group");
                }

            }catch (Exception ex){
            }

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }

    public boolean test_filter_with_staholderGroups(){
        boolean status = true;
        try{
            driver.findElement(selectstakeholderGroup1).click();
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(rightsidePagination).click();
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(leftsidePagination).click();
            Search_and_filter_stakeholder.timeout3000();

            driver.findElement(filterStakehodlerOption).click();
            Search_and_filter_stakeholder.timeout1000();
            driver.findElement(selectstakeholderGroup2).click();
            Search_and_filter_stakeholder.timeout3000();

            try{
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
                wait.until(ExpectedConditions.elementToBeClickable(rightsidePagination));
                Assert.assertEquals(true, false, "Not display correct stakeholder list when selecting stakeholder group as administrator");

            }catch (Exception ex){}

            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }

    public boolean test_filter_with_showAll_options(){
        boolean status = true;
        try{
            driver.findElement(viewbyOnwerOption).click();
            Search_and_filter_stakeholder.timeout2000();
            driver.findElement(showallOption).click();
            Search_and_filter_stakeholder.timeout1000();
            try{
            driver.findElement(showallOption1).click();
            }catch (Exception ex){}
            Search_and_filter_stakeholder.timeout2000();
            driver.findElement(showallOption).click();
            Search_and_filter_stakeholder.timeout1000();
            try {
                driver.findElement(showallOption2).click();
            }catch (Exception ex){}
            Search_and_filter_stakeholder.timeout2000();
            driver.findElement(showallOption).click();
            Search_and_filter_stakeholder.timeout1000();
            try {
                driver.findElement(selectShowalloption).click();
            }catch (Exception ex){}
            Search_and_filter_stakeholder.timeout2000();

            driver.findElement(recordsPerpageOption).click();
            Search_and_filter_stakeholder.timeout3000();
            try {
                driver.findElement(selectRecordesPerpageOptionas100).click();
            }catch (Exception ex){}
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(rightsidePagination).click();
            Search_and_filter_stakeholder.timeout3000();
            driver.findElement(recordsPerpageOption).click();
            Search_and_filter_stakeholder.timeout3000();
            try {
                driver.findElement(selectRecordsPerpageOptionas15).click();
            }catch (Exception ex){}
            Search_and_filter_stakeholder.timeout3000();


            status = true;
            return status;
        }catch (Exception ex){
            System.out.println(ex);
            status = false;
            return  status;
        }
    }

}
