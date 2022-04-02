package pages.productpages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class ProductOrderPage {

    public ProductOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    private WebElement productName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement quantity;

    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    private WebElement customerName;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox2")
    private WebElement street;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    private WebElement city;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    private WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zipCode;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    private WebElement visaButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
    private WebElement masterCardButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_2")
    private WebElement americanExpressButton;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox6")
    private WebElement cardNumber;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox1")
    private WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;

    @FindBy(tagName = "strong")
    private WebElement message;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_orderGrid']//tr[2]//td")
    private List<WebElement> productInfo;

    public void sendProductInfo(String product,String quantity){
        BrowserUtils.selectBy(productName,product,"value");
        this.quantity.clear();
        this.quantity.sendKeys(quantity);
    }

    public void sendAdressInformation(String customerName,String street,String city,
                                      String state,String zipCode){
        this.customerName.sendKeys(customerName);
        this.street.sendKeys(street);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zipCode.sendKeys(zipCode);
    }

    public void sendPaymentInformation(String cardNumber,String expireDate){
        this.cardNumber.sendKeys(cardNumber);
        this.expireDate.sendKeys(expireDate);
    }

    public void selectCard(String cardType){

        switch (cardType){

            case "Visa":
                visaButton.click();
                break;
            case "MasterCard":
                masterCardButton.click();
                break;
            case "American Express":
                americanExpressButton.click();
                break;
        }
    }

    public void clickProcessButton(){
        processButton.click();
    }

    public String getSuccessMessage(){
        return BrowserUtils.getTextMethod(message);
    }

    public void getinfo(String customerName,String productName,String quantity,String street,String city,String state,
                        String zipCode,String cardType,String cardNumber,String expireDate){

        Assert.assertEquals(productInfo.get(1).getText().trim(),customerName);
        Assert.assertEquals(productInfo.get(2).getText().trim(),productName);
        Assert.assertEquals(productInfo.get(3).getText().trim(),quantity);
        Assert.assertEquals(productInfo.get(5).getText().trim(),street);
        Assert.assertEquals(productInfo.get(6).getText().trim(),city);
        Assert.assertEquals(productInfo.get(7).getText().trim(),state);
        Assert.assertEquals(productInfo.get(8).getText().trim(),zipCode);
        Assert.assertEquals(productInfo.get(9).getText().trim(),cardType);
        Assert.assertEquals(productInfo.get(10).getText().trim(),cardNumber);
        Assert.assertEquals(productInfo.get(11).getText().trim(),expireDate);

    }
}
