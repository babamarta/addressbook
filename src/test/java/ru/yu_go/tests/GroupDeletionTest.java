package ru.yu_go.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.yu_go.model.GroupData;


public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() throws Exception {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup (new GroupData("test2",null,null));
        }

        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before + 1);
    }

}