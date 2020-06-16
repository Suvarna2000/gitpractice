package com.wbl.utils;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerListener extends TestListenerAdapter{
    Logger logger = LogManager.getLogger(LoggerListener.class);
    private int m_count = 0;

    @Override
    public void onTestStart(ITestResult tr){
        logger.info("Test Started.....");
    }

    @Override
    public void onTestSuccess(ITestResult tr){
        logger.info("Test "+ tr.getName() + " Passed.....");
        logger.info("Priority of this method is : "+ tr.getMethod().getPriority());
    }

    @Override
    public void onTestFailure(ITestResult tr){
        logger.info("Test "+ tr.getName() + " Failed.....");
        logger.info("Priority of this method is : "+ tr.getMethod().getPriority());
    }

    @Override
    public void onTestSkipped(ITestResult tr){
        logger.info("Test "+ tr.getName() + " Skipped.....");
        logger.info("Priority of this method is : "+ tr.getMethod().getPriority());
    }


    private void logger(String string){
        System.out.print(string);
        if(++m_count%40 == 0){
            System.out.println("m_count : " + m_count);
        }
    }

}