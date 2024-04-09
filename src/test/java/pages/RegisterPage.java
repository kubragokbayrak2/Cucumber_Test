package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {



    @FindBy(css = "#addNewRecordButton")
    public WebElement addUserBtn;

    @FindBy(css = "#submit")
    private WebElement submitBtn;

    @FindBy(css = "#firstName")
    private WebElement firstName;

    @FindBy(css = "#lastName")
    private WebElement LastName;

    @FindBy(css = "#userEmail")
    private WebElement email;

    @FindBy(css = "#age")
    private WebElement userage;

    @FindBy(css = "#salary")
    private WebElement usersalary;

    @FindBy(css = "#department")
    private WebElement userdepartment;

    @FindBy(css = "#edit-record-4")
    private WebElement editBtn;

    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clickAddUserBtn() {addUserBtn.click();}

    public void clickSubmitBtn() {submitBtn.click();}

    public void clickEditBtn(){editBtn.click();}



    public void registerAUser(){
        firstName.sendKeys("kubra");
        LastName.sendKeys("deneme");
        email.sendKeys("deneme@mail.com");
        userage.sendKeys("25");
        usersalary.sendKeys("1000");
        userdepartment.sendKeys("qa");

    }

    public void UpdateUser(){
        firstName.sendKeys("kubragokbayrak");
        LastName.sendKeys("deneme2");
        email.sendKeys("deneme@mail.com");
        userage.sendKeys("30");
        usersalary.sendKeys("1500");
        userdepartment.sendKeys("test");

    }



}
