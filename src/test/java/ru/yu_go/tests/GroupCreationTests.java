package ru.yu_go.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.yu_go.model.GroupData;


public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup(new GroupData("Test1", "Test2", null));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before + 1);
    }

}
