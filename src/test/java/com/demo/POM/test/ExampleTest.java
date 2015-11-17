package com.demo.POM.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.POM.BaseTest;
import com.demo.POM.pages.LandingPage;
import com.demo.POM.pages.QuestionsPage;

public class ExampleTest extends BaseTest{
  
	public ExampleTest() {
        super();
    }

    @Test
    public void clickQuestionsTest() {
        LandingPage landingPage = new LandingPage(driver);
        QuestionsPage questionsPage = landingPage.clickQuestionsTab();
        Assert.assertTrue(questionsPage.isUsersTabDisplayed());
    }

    @Test
    public void isLogoDisplayedTest() {
        LandingPage landingPage = new LandingPage(driver);
        Assert.assertTrue(landingPage.isQuestionsTabDisplayed());
    }
}
