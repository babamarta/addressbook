package ru.yu_go.tests;

import org.testng.annotations.Test;
import ru.yu_go.model.ContactData;

public class ContactCreationTest extends TestBase {
    @Test
    public void testGroupCreation() throws Exception {

        app.getNavigationHelper().goToAddNewPage();
        app.getContactHelper().FillContactForm(new ContactData("rrr", "ttt", "yyy", "uuu", "iii", "ooo", "ppp", "aaa", "sss", "ddd", "fff", "ggg@rt.ty", "rrr.yyyttt.@ooo.tu", "ccc", "vvv", "bbb","15", "January", "1234"));
        app.getContactHelper().EnterContact();
        app.getContactHelper().GoToHomePage();

    }

}


