package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.ChatTemplatePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ChatTemplateStepDef {
    private final WebDriver driver = Hooks.driver;
    ChatTemplatePage chatTemplatePage = new ChatTemplatePage(driver);

    @Given("User sudah login")
    public void userSudahLogin() {
        chatTemplatePage.inputEmail("testing-mic@gmail.com");
        chatTemplatePage.inputPassword("DevPassword123!");
        chatTemplatePage.clickSignInButton();
    }

    @When("User berada di halaman Chat Template")
    public void userBeradaDiHalamanChatTemplate() {
        chatTemplatePage.clickChatTemplateButton();
        Assert.assertTrue(chatTemplatePage.verifyChatTemplate());
    }

    @And("User belum pernah membuat Chat Template sebelumnya dan terdapat button “Create New Template”")
    public void userBelumPernahMembuatChatTemplateSebelumnyaDanTerdapatButtonCreateNewTemplate() {
        Assert.assertTrue(chatTemplatePage.verifyCreateNewTemplateButton());
    }

    @When("User menekan button “Create New Template”")
    public void userMenekanButtonCreateNewTemplate() {
        chatTemplatePage.clickCreateNewTemplateButton();
    }

    @Then("Menampilkan pop-up Create New Chat Template")
    public void menampilkanPopUpCreateNewChatTemplate() {
        Assert.assertTrue(chatTemplatePage.verifyChatTemplatePopUp());
    }

    @And("Terbagi menjadi dua bagian, yaitu bagian “Editorial Template” dan bagian “Preview Template”")
    public void terbagiMenjadiDuaBagianYaituBagianEditorialTemplateDanBagianPreviewTemplate() {
        Assert.assertTrue(chatTemplatePage.verifyEditorialTemplate());
        Assert.assertTrue(chatTemplatePage.verifyPreviewTemplate());
    }

    @And("Pada bagian “Editorial Template” terdapat input form “Template Name” dan button “Load Existing” Box bubble chat satu button “Add Bubble Chat” dan button “Wait For Second” Input form “Template Hotkey”")
    public void padaBagianEditorialTemplateTerdapatInputFormTemplateNameDanButtonLoadExistingBoxBubbleChatButtonAddBubbleChatSatuDanButtonWaitForSecondInputFormTemplateHotkeyDefaultnyaTergenerateOlehSistem() {
        Assert.assertTrue(chatTemplatePage.verifyTemplateNameInputField());
        Assert.assertTrue(chatTemplatePage.verifyLoadExistingButton());
        Assert.assertTrue(chatTemplatePage.verifyBoxBubbleChat1());
        Assert.assertTrue(chatTemplatePage.verifyAddBubbleChatButton());
        Assert.assertTrue(chatTemplatePage.verifyWaitForSecondButton());
        Assert.assertTrue(chatTemplatePage.verifyInputTemplateHotkey());
    }

    @And("Pada bagian “Preview Template” akan menampilkan contoh pesan seperti pada Bubble chat yang telah ditambahkan")
    public void padaBagianPreviewTemplateAkanMenampilkanContohPesanSepertiPadaBubbleChatYangTelahDitambahkan() {
        Assert.assertTrue(chatTemplatePage.verifyPreviewChatTemplate());
    }

    @And("Pada kanan bawah pop-up terdapat button “Save Template”")
    public void padaKananBawahPopUpTerdapatButtonSaveTemplate() {
        Assert.assertTrue(chatTemplatePage.verifyCreateTemplateButton());
    }

    @When("User klik dan mengetikkan {string} pada form Template Name")
    public void userKlikDanMengetikkanPadaFormTemplateName(String templateName) {
        chatTemplatePage.inputTemplateNameInputField(templateName);
    }

    @Then("Input form Template Name akan aktif dan terisi {string}")
    public void inputFormTemplateNameAkanAktifDanTerisi(String templateName) {
        Assert.assertTrue(chatTemplatePage.verifyInputTemplateNameField(templateName));
    }

    @When("User klik dan mengetikkan {string} pada form box Bubble Chat Satu")
    public void userKlikDanMengetikkanPromoProdukTerbaruTahunIniPadaFormBoxBubbleChatSatu(String inputBubbleChatSatu) {
        chatTemplatePage.inputChatBubble1(inputBubbleChatSatu);
    }

    @Then("Box bubble chat satu akan terisi pesan {string}")
    public void boxBubbleChatSatuAkanTerisiPesanPromoProdukTerbaruTahunIni(String inputBubbleChatSatu) {
        Assert.assertTrue(chatTemplatePage.verifyInputBubbleChat1(inputBubbleChatSatu));
    }

    @And("Pada bagian Preview menampilkan bubble chat dengan pesan {string}")
    public void padaBagianPreviewMenampilkanBubbleChatDenganPesanPromoProdukTerbaruTahunIni(String inputBubbleChatSatu) {
        Assert.assertTrue(chatTemplatePage.verifyPreviewBubbleChat1(inputBubbleChatSatu));
    }

    @When("User klik button Add Bubble Chat")
    public void userKlikButtonAddBubbleChat() {
        chatTemplatePage.addBubbleChat();
    }

    @Then("Akan muncul bubble chat baru pada bagian Editorial Template")
    public void akanMunculBubbleChatBaruPadaBagianEditorialTemplate() {
        Assert.assertTrue(chatTemplatePage.verifyBubbleChat2());
    }
}
