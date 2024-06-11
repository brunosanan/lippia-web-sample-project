package lippia.web.constants;

public class TrackerConstants {

    public static final String MANUAL_MODE_BUTTON = "xpath://a[@id='manual-mode']";

    public static final String INPUT_DESCRIPTION = "xpath://input[@id='undefined']";

    public static final String INPUT_START_HOUR ="xpath://input-time-ampm[1]//input[1]";
    public static final String INPUT_FINISH_HOUR = "xpath://input-time-ampm[2]//input[1]";

    public static final String INPUT_DATE = "xpath://*[@class='cl-d-flex cl-w-100 cl-mobile-hide-input-date-picker ng-star-inserted'][1]/div[3]/input[1]";

    public static final String ADD_START_BUTTON = "xpath://button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block']";
    public static final String DISCARD_BUTTON = "xpath://a[@class='cl-dropdown-item cl-text-red']";
    public static final String CONFIRM_DISCARD_BUTTON = "xpath://button[contains(text(),'Discard')]";

    public static final String CONFIRM_DISCARD_TEXT = "xpath://div[contains(text(),'Are you sure?')]";

    public static final String TIME_TRACKED = "xpath://*[contains(text(),'%s')]";

    public static final String PROJECT_BUTTON = "xpath://img[@alt='View Projects']";
    public static final String TRACKER_BUTTON = "xpath://span[contains(text(),'TIME TRACKER')]";

    public static final String VIEW_MORE_OPTIONS_BUTTON = "xpath://img[@class='cl-px-2'][1]";



    public static final String MODIFY_INPUT_START_HOUR ="xpath://span[text()='Sun, Jun 11']/../../../../time-tracker-entry[1]//input-time-ampm[1]//input[1]";
    public static final String MODIFY_INPUT_FINISH_HOUR = "xpath://span[text()='Sun, Jun 11']/../../../../time-tracker-entry[1]//input-time-ampm[2]//input[1]";

    public static final String MODIFY_INPUT_DESCRIPTION = "xpath://span[text()='Sun, Jun 11']/../../../../time-tracker-entry[1]/div/div[1]/span[1]/div[1]/input[1]";

    public static final String MODIFY_INPUT_DATE = "xpath://span[text()='Sun, Jun 11']/../../../../time-tracker-entry[1]//input-single-date";


    public static final String TOGGLE_BILLABLE = "xpath://span[text()='Sun, Jun 11']/../../../../time-tracker-entry[1]/div//span[contains(text(),'$')]";

    public static final String MORE_PROJECTS = "xpath://span[text()='Sun, Jun 11']/../../../../time-tracker-entry[1]//project-picker-label/div/div";

    public static final String FIRST_PROJECT = "xpath://div[@class='cl-scroll-items']/div[1]/div[1]//button[1]";

    public static final String MAXIMIZE_PROJECTS = "xpath://img[@alt='Maximize window']";


    public static final String NOTIFICATION = "xpath://div[@aria-label='%s']";
}
