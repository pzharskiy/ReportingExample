package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import reporting.MyLogger;

/**
 * Created by Sergey_Poritskiy on 6/15/2017.
 */
public class DroppablePage extends AbstractPage {
    private static final By SQUARE_LOCATOR = By.cssSelector("#draggable");
    private static final By TARGET_LOCATOR = By.cssSelector("#droppable");

    public DroppablePage dragNDropSquare() {
        browser.switchToFrame();
        browser.dragAndDrop(SQUARE_LOCATOR, TARGET_LOCATOR);
        MyLogger.info("Successfully dragged a square!");
        return this;
    }

    @Step
    public DroppablePage dragNDropWrongSquare() {
        browser.switchToFrame();
        browser.dragAndDrop(TARGET_LOCATOR, TARGET_LOCATOR);
        MyLogger.info("Dragged a wrong square");
        return this;
    }

    public boolean squareIsOnThePlace() {
        return false;
    }
}
