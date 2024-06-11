package lippia.web.constants;

public class TrackerConstants {

    public static final String MANUAL_MODE_BUTTON = "xpath://a[@id='manual-mode']";

    public static final String INPUT_DESCRIPTION = "xpath://input[@id='undefined']";

    public static final String INPUT_START_HOUR ="xpath://input-time-ampm[1]//input[1]";
    public static final String INPUT_FINISH_HOUR = "xpath://input-time-ampm[2]//input[1]";

    public static final String INPUT_DATE = "xpath://*[@class='cl-d-flex cl-w-100 cl-mobile-hide-input-date-picker ng-star-inserted'][1]/div[3]/input[1]";

    public static final String ADD_BUTTON = "xpath://button[@class='cl-btn cl-btn-primary cl-d-none cl-d-lg-custom-block']";

    public static final String TIME_TRACKED = "xpath://*[contains(text(),'%s')]";

    public static final String PROJECT_BUTTON = "xpath://img[@alt='View Projects']";
    public static final String TRACKER_BUTTON = "xpath://span[contains(text(),'TIME TRACKER')]";


}
