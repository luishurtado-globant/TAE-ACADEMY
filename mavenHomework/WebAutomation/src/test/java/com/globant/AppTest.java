package com.globant;
import org.testng.annotations.*;


/**
 * Unit test for simple App.
 */
public class AppTest {

    @BeforeSuite
    public void launchBrowser(){
        System.out.println("Open Chrome");
    }

    @BeforeTest 
    @Parameters({"website"})
    public void launchWebsite(String website){
        System.out.println("*Open " + website + "**" );
    }

    @Test (groups = "Login", priority = 0)
    public void loginAccount(){
        System.out.println("------Logging into your account-------");
    }

    @Test (groups = "Profile", priority = 1)
    public void showProfile(){
        System.out.println("My profile");
    }

    @Test (groups = "EditProfile", priority = 1)
    public void editProfile(){
        System.out.println("Edit profile");
    }

    @Test (groups = "EditProfile", priority = 2)
    public void changeProfilePicture(){
        System.out.println("Change the profile picture");
    }

    @Test (groups = "Profile", priority = 2)
    public void showFriends(){
        System.out.println("List of friends");
    }

    @Test (groups = "Profile", priority = 3)
    public void selectFriend(){
        System.out.println("This friend has been selected");
    }

    @Test (groups = "Profile", priority = 4)
    public void deleteFriend(){
        System.out.println("This friend has been deleted from the list");
    }

    @AfterTest (groups = "Login")
    public void logoutAccount(){
        System.out.println("Facebook account has been successfully log out.");
    }

}
