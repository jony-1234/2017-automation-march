package us;

import base.CommonAPI;
import homepage.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.TestLogger;

/**
 * Created by Md.Golam Robbani on 5/15/2017.
 */

/*public class UsPage extends CommonAPI {
    @FindBy(how = How.CSS, using = ".postid-10943106")
    public static WebElement newsHeader;

    public WebElement getNewsHeader() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return newsHeader;
    }

    public void clickOnHeadLine(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.goToNewsSection();
    }
}*/


