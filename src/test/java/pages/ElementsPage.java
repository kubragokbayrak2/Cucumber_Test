package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementsPage {

    @FindBy(xpath = "//span[text()='Buttons']")
    private WebElement buttons_tab;

    @FindBy(xpath = "//button[text()='Click Me']")
    private WebElement click_me_btn;

    @FindBy(css = "#dynamicClickMessage")
    private WebElement click_btn_message;

    private WebDriver driver;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void clickButtonsTab() {
        buttons_tab.click();
    }

    public void clickClickMeBtn(){click_me_btn.click();}

    public void read_click_btn_msg(){click_btn_message.getText();}




}
