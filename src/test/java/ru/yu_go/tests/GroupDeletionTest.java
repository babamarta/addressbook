package ru.yu_go.tests;

import org.testng.annotations.*;
import ru.yu_go.model.GroupData;


public class GroupDeletionTest extends TestBase {


    @Test
    public void testGroupDeletion() throws Exception {

        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup (new GroupData("test2",null,null));
        }

        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnGroupPage();
    }

}