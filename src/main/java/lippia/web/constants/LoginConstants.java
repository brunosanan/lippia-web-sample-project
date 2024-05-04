package lippia.web.constants;

public class LoginConstants {
    public static final String HOME_LOGIN_BUTTON = "xpath://*[text()='Log in']";
    public static final String LOGIN_MANUALLY_BUTTON= "xpath://*[text()=' Log in manually ']";
    public static final String LOGIN_BUTTON = "xpath://*[text()=' Log In ']";

    public static final String MAIL_INPUT= "id:email";
    public static final String PASSWORD_INPUT= "xpath://input[@id ='password']";


    public static final String ERROR_MESSAGE= "xpath://span[@class = 'cl-invalid-feedback cl-block cl-mt-0 ng-star-inserted']";


    public static final String INVALID_CREDENTIALS_ERROR = "xpath://span[normalize-space()='Invalid email or password']";
}
