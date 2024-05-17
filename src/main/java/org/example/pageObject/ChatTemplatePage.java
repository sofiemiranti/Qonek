package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ChatTemplatePage {
    public static WebDriver driver;

    public ChatTemplatePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='sign_in_text_input_email']")
    private WebElement inputEmailField;
    @FindBy(xpath = "//input[@id='sign_in_text_input_password']")
    private WebElement inputPasswordField;
    @FindBy(xpath = "//button[@id='sign_in_button_sign_in']")
    private WebElement signinButton;
    @FindBy(xpath = "//div[@id='navmenu_navbtn_guidebook']")
    private WebElement chatTemplateButton;
    @FindBy(xpath = "//h4[.='Chat Template']")
    private WebElement chatTemplateLabel;
    @FindBy(xpath = "//button[@class='connect']")
    private WebElement createNewTemplateButton;
    @FindBy(xpath = "//div[@class='BroadcastChatTemplate']")
    private WebElement chatTemplatePopUp;
    @FindBy(xpath = "//div[@class='BCTemplateBody']/div[1]/div[@class='leftModalAddNewTemplate']")
    private WebElement editorialTemplate;
    @FindBy(xpath = "//div[@class='BCTemplateBody']/div[1]/div[@class='RightModalAddNewTemplate']")
    private WebElement previewTemplate;
    @FindBy(xpath = "//input[@id='addnewtemplatechat_textinput_templatename']")
    private WebElement inputTemplateNameField;
    @FindBy(xpath = "//button[@id='addnewtemplatechat_btn_loadexisting']")
    private WebElement loadExistingButton;
    @FindBy(xpath = "//div[@class='ContainerBuble']")
    private WebElement boxBubbleChat1;
    @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
    private WebElement inputBubbleChat1;
    @FindBy(xpath = "//button[@id='addnewtemplate_buble_btn_addbublechat']")
    private WebElement addBubbleChatButton;
    @FindBy(xpath = "//div[@id='addnewtemplatechat_editorial_part']/div[2]//div[@class='ql-editor ql-blank']/div[1]")
    private WebElement inputBubbleChat2;
    @FindBy(xpath = "//button[@id='addnewtemplate_buble_btn_waitforrespond']")
    private WebElement waitForSecondButton;
    @FindBy(xpath = "//input[@id='inputlabel_textinput_hotkey']")
    private WebElement inputTemplateHotkey;
    @FindBy(xpath = "//div[@class='CardPreviewAddNewTemplate']")
    private WebElement previewChatTemplate;
    @FindBy(xpath = "//button[@id='addnewtemplate_buble_btn_createtemplate']")
    private WebElement createTemplateButton;


    public void inputEmail (String email) {
        inputEmailField.sendKeys(email);
    }

    public void inputPassword (String password) {
        inputPasswordField.sendKeys(password);
    }

    public void clickSignInButton () {
        signinButton.click();
    }

    public void clickChatTemplateButton () {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        chatTemplateButton.click();
    }

    public boolean verifyChatTemplate () {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return chatTemplateLabel.isDisplayed();
    }

    public boolean verifyCreateNewTemplateButton () {
        return createNewTemplateButton.isEnabled();
    }

    public void clickCreateNewTemplateButton () {
        createNewTemplateButton.click();
    }

    public boolean verifyChatTemplatePopUp () {
       return chatTemplatePopUp.isDisplayed();
    }

    public boolean verifyEditorialTemplate () {
        return editorialTemplate.isDisplayed();
    }

    public boolean verifyPreviewTemplate () {
        return previewTemplate.isDisplayed();
    }

    public boolean verifyTemplateNameInputField () {
        return inputTemplateNameField.isEnabled();
    }

    public boolean verifyLoadExistingButton () {
        return loadExistingButton.isEnabled();
    }

    public boolean verifyBoxBubbleChat1 () {
        return boxBubbleChat1.isDisplayed();
    }

    public boolean verifyAddBubbleChatButton () {
        return addBubbleChatButton.isEnabled();
    }

    public boolean verifyWaitForSecondButton () {
        return waitForSecondButton.isEnabled();
    }

    public boolean verifyInputTemplateHotkey () {
        return inputTemplateHotkey.isEnabled();
    }

    public boolean verifyPreviewChatTemplate () {
        return previewChatTemplate.isDisplayed();
    }

    public boolean verifyCreateTemplateButton () {
        return createTemplateButton.isDisplayed();
    }

    public void inputTemplateNameInputField (String templateName) {
        inputTemplateNameField.sendKeys(templateName);
    }

    public boolean verifyInputTemplateNameField (String templateName) {
        String xpath = "//input[@value='" + templateName + "']";
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void inputChatBubble1 (String inputBubbleChatSatu) {
        inputBubbleChat1.sendKeys(inputBubbleChatSatu);
    }
    public boolean verifyInputBubbleChat1 (String bubbleChatSatu) {
        String xpath = "//div[@class='ql-editor']/div[.='" + bubbleChatSatu + "']";
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public boolean verifyPreviewBubbleChat1 (String previewBubbleChatSatu) {
        String xpath = "//p[@class='text']/div[.='" + previewBubbleChatSatu + "']";
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }

    public void addBubbleChat () {
        addBubbleChatButton.click();
    }

    public boolean verifyBubbleChat2 () {
        return inputBubbleChat2.isDisplayed();
    }

}
