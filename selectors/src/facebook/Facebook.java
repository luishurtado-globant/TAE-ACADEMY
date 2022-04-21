package facebook;

public class Facebook {
    //Login
    String formContainer = "By.css form[data-testid = \"royal_login_form\"]";
    String emailInput = "By.css form[data-testid = \"royal_login_form\"] div #email";
    String passwordInput = "By.css form[data-testid = \"royal_login_form\"] div #passContainer";
    String loginButton = "By.css ._6ltg button";
    String createAccountButton = "By.css ._6ltg a";

    //Logout
    String dropdownAccountSettings = "By.css .oajrlxb2[aria-label = \"Cuenta\"]";
    String logoutButton = "By.css .muag1w35 div:nth-child(4) div[role = \"button\"]";

    //Profile
    String enterInProfile = "By.css div[data-visualcompletion = \"ignore-dynamic\"] a[href = \"/me/\"]";

    //Friends//
    String friendsButton = "By.css .kr520xx4 a[role=\"tab\"]:nth-child(4) .n00je7tq";
}
