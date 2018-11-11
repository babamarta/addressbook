package ru.yu_go.appManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import ru.yu_go.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void GoToHomePage() {
        click(By.linkText("home page"));
    }

    public void FillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        click(By.name("theform"));
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("work"), contactData.getWorck());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email2"), contactData.getEmail());
        type(By.name("email"), contactData.getEmail1());
        clickBday(contactData, By.name("bday"));
        click(By.name("bmonth"));
        clickMonth(contactData, By.name("bmonth"));
        type(By.name("byear"), contactData.getYear());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
    }

    //    public void type(By locator, String text) {
//        click(locator);
//        driver.findElement(locator).clear();
//        driver.findElement(locator).sendKeys(text);
//    }
//    public void click(By locator) {
//        driver.findElement(locator).click();
//    }

    public void goToAddNewPage() {
        click(By.linkText("add new"));
    }
}
