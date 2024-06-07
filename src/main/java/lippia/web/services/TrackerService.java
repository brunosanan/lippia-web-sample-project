package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TrackerConstants;

import java.time.Instant;

public class TrackerService {
    public static void clickManualModeButton() {
        WebActionManager.click(TrackerConstants.MANUAL_MODE_BUTTON);
    }

    public static String generateUniqueDescription() {
        return "Description" + Instant.now().getEpochSecond();
    }

    public static void inputDescription(String description) {
        WebActionManager.setInput(TrackerConstants.INPUT_DESCRIPTION, description);
    }

    public static void inputStartHour(String hour) {
        WebActionManager.setInput(TrackerConstants.INPUT_START_HOUR, hour);
    }

    public static void inputFinishHour(String hour) {
        WebActionManager.setInput(TrackerConstants.INPUT_FINISH_HOUR, hour);
    }

    public static void inputDate(String date) {
        WebActionManager.setInput(TrackerConstants.INPUT_DATE, date);
    }

    public static void clickADDButton() {
        WebActionManager.click(TrackerConstants.ADD_BUTTON);
    }
}
