package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;

import org.apache.commons.math3.analysis.function.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import constants.Constants;

public class FileuploadUtility {

	public void fileuploadusingsendkeys(WebElement element, String filepath) {

		element.sendKeys(filepath);

	}

	public void fileuploadusingrotbotkey(WebElement element1, String filepath1) throws AWTException {

		element1.click();
		StringSelection ss = new StringSelection(filepath1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
