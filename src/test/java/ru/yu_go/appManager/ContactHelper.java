package ru.yu_go.appManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.yu_go.model.ContactData;

public class ContactHelper extends HelperBase {



    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void goToAddNewPage() {
        click(By.linkText("add new"));
    }

    public void goToHomePage() {
        if (isElementPresent(By.id ("maintable"))){return;}
        click(By.linkText("home"));
    }


    public void FillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
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
        type(By.name("byear"), contactData.getYear());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
            }
        }

    public void FillContactForm2(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
    }
    public void createContact (ContactData contact){
        goToAddNewPage();
        FillContactForm2(contact);
        EnterContact();
        goToHomePage();
    }

    public void updateContact(String locator) {
        driver.findElement(By.name(locator)).click();
    }

    public void selectContact(By locator) {
        driver.findElement(locator).click();
    }
    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }


}
