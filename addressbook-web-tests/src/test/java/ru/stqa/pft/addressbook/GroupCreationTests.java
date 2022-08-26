package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
public class GroupCreationTests extends TestBase {
  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test_1", "test_2", "test_3"));
    submitGroupCreation();
    returnToGroupPage();
    //wd.findElement(By.linkText("Logout")).click();
  }
}
