package ru.yu_go.tests;

import org.openqa.selenium.By;

import org.testng.annotations.Test;
import ru.yu_go.model.ContactData;


public class ContactModificationTest extends TestBase {



    @Test
    public void testContactModification() throws Exception {


        app.getNavigationHelper().goToHomePage();

        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact (new ContactData("457821", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, null, null, null));
        }


        app.getContactHelper().selectContact(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='import'])[1]/following::img[2]"));
        app.getContactHelper().FillContactForm(new ContactData("rrr", "rrr", "eee", "uuu", "iii", "ooo", "ppp", "aaa", "sss", "ddd", "fff", "ggg@rt.ty", "rrr.yyyttt.@ooo.tu", "ccc", "vvv", "bbb","15", "January", "1234", null), false);
        app.getContactHelper().updateContact("update");
    }


}
