package lippia.web.services;


import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TrackerConstants;
import org.testng.Assert;

import java.time.Instant;

public class TrackerService {
    public static void clickManualModeButton() {
        WebActionManager.click(TrackerConstants.MANUAL_MODE_BUTTON);
    }


    public static String generateUniqueDescription() {
        System.out.println("-");
        return "Description" + Instant.now().getEpochSecond();

    }

    public static void inputDescription(String description) {

        WebActionManager.setInput(TrackerConstants.INPUT_DESCRIPTION, description);

    }

    public static void inputStartHour(String hour) {
        WebActionManager.setInput(TrackerConstants.INPUT_START_HOUR, "\b\b\b\b");
        WebActionManager.setInput(TrackerConstants.INPUT_START_HOUR, hour);
    }

    public static void inputFinishHour(String hour) {
        WebActionManager.setInput(TrackerConstants.INPUT_FINISH_HOUR, "\b\b\b\b");
        WebActionManager.setInput(TrackerConstants.INPUT_FINISH_HOUR, hour);
    }

    public static void inputDate(String date) {
        WebActionManager.click(TrackerConstants.INPUT_DATE);
        WebActionManager.setInput(TrackerConstants.INPUT_DATE, "\b\b\b\b\b\b\b\b\b\b");
        WebActionManager.setInput(TrackerConstants.INPUT_DATE, date);
    }

    public static void clickADDSTARTButton() {
        WebActionManager.waitVisibility(TrackerConstants.ADD_START_BUTTON);
        WebActionManager.click(TrackerConstants.ADD_START_BUTTON);
    }

    public static void clickDISCARDButton() {
        WebActionManager.click(TrackerConstants.DISCARD_BUTTON);
    }


    public static void verifyTimeTracked(String name) {
        WebActionManager.waitPresence(TrackerConstants.TIME_TRACKED, name);
        Assert.assertTrue(WebActionManager.isPresent(TrackerConstants.TIME_TRACKED, name));
    }

    public static void verifyTimeNotTracked(String name) {
        WebActionManager.waitPresence(TrackerConstants.ADD_START_BUTTON);
        Assert.assertFalse(WebActionManager.isPresent(TrackerConstants.TIME_TRACKED, name));
    }



    public static void goProjectPage() {
        WebActionManager.click(TrackerConstants.PROJECT_BUTTON);
    }

    public static void goTrackerPage() {
        WebActionManager.click(TrackerConstants.TRACKER_BUTTON);
    }

    public static void confirmDiscard() {
        WebActionManager.waitVisibility(TrackerConstants.CONFIRM_DISCARD_TEXT);
        WebActionManager.click(TrackerConstants.CONFIRM_DISCARD_BUTTON);
    }

    public static void viewMoreOptions(){
        WebActionManager.click(TrackerConstants.VIEW_MORE_OPTIONS_BUTTON);
    }


    public static void changeDescription(String description){
        WebActionManager.setInput(TrackerConstants.MODIFY_INPUT_DESCRIPTION, "\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
        WebActionManager.setInput(TrackerConstants.MODIFY_INPUT_DESCRIPTION, description);
    }
    public static void changeStartHour(String hour){
        WebActionManager.setInput(TrackerConstants.MODIFY_INPUT_START_HOUR, "\b\b\b\b");
        WebActionManager.setInput(TrackerConstants.MODIFY_INPUT_START_HOUR, hour);
        WebActionManager.click(TrackerConstants.MANUAL_MODE_BUTTON); //confirma el cambio haciendo click fuera del recuadro
    }
    public static void changeFinishHour(String hour){
        WebActionManager.setInput(TrackerConstants.MODIFY_INPUT_FINISH_HOUR, "\b\b\b\b");
        WebActionManager.setInput(TrackerConstants.MODIFY_INPUT_FINISH_HOUR, hour);
        WebActionManager.click(TrackerConstants.MANUAL_MODE_BUTTON); //confirma el cambio haciendo click fuera del recuadro
    }
    public static void toggleBillable(){
        WebActionManager.waitClickable(TrackerConstants.TOGGLE_BILLABLE);
        WebActionManager.click(TrackerConstants.TOGGLE_BILLABLE);
    }
    public static void changeProject(){
        WebActionManager.waitInvisibility(TrackerConstants.NOTIFICATION, "Successfully updated date and time"); //realizo el wait ya que sino las notificaciones de clockify por alguna razon cierran el recuadro para ver los proyectos
        WebActionManager.click(TrackerConstants.MORE_PROJECTS);
        WebActionManager.click(TrackerConstants.MAXIMIZE_PROJECTS);
        WebActionManager.waitPresence(TrackerConstants.FIRST_PROJECT);
        WebActionManager.click(TrackerConstants.FIRST_PROJECT);
    }

    public static void verifyNotification(String text) {
        WebActionManager.waitPresence(TrackerConstants.NOTIFICATION, text);
        Assert.assertTrue(WebActionManager.isPresent(TrackerConstants.NOTIFICATION, text));
    }

    public static void changeDate() {
        WebActionManager.click(TrackerConstants.MODIFY_INPUT_DATE);
        //no supe resolver el cambio de fecha con un input asique realicé clicks hardcodeados sobre el calendario
        WebActionManager.click("xpath://table[1]/tbody/tr[1]/td[5]");
    }
}


