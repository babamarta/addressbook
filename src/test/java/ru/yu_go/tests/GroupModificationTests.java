package ru.yu_go.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yu_go.model.GroupData;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification(){

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup (new GroupData("test2",null,null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("Test1", "Test2", "Test3"));
        app.getGroupHelper().submitModification();
        app.getGroupHelper().returnGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before);
    }
}
