package com.wbl.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {
    public static void takeScreenShot(String fileName, WebDriver driver){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(file, new File("C:\\Users\\kulka\\IdeaProjects\\TalentscreenAutomationProject\\src\\main\\resources\\screenshots\\"+fileName+System.currentTimeMillis()+".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
