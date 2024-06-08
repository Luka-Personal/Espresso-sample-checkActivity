package com.ghedamsisabri.ui_testing_for_beginner.steps

import com.ghedamsisabri.ui_testing_for_beginner.Helper.assertIsViewDisplayed
import com.ghedamsisabri.ui_testing_for_beginner.Helper.getText
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isTextOnScreen
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isViewDisplayed
import com.ghedamsisabri.ui_testing_for_beginner.Helper.tap
import com.ghedamsisabri.ui_testing_for_beginner.data.Constants
import org.junit.Assert
import com.ghedamsisabri.ui_testing_for_beginner.pages.MainPage

class MainPageSteps {
    private lateinit var mainPageText: String

    fun checkMainPageLoaded(): MainPageSteps {
        Assert.assertTrue(MainPage.mainPage.isViewDisplayed())
        return this;
    }
    fun saveMainPageText(): MainPageSteps {
        this.mainPageText = MainPage.mainPageActivityText.getText();
        return this;
    }
    fun tapNextBtn(): MainPageSteps {
        MainPage.nextBtn.tap(Constants.TIMEOUT)
        return this;
    }
    fun assertNextButtonIsVisible() {
        Assert.assertTrue(MainPage.nextBtn.isViewDisplayed())
    }
    fun assertMainPageTextEquals(text: String): MainPageSteps {
        Assert.assertEquals(this.mainPageText, text)
        return this;
    }
    fun assertMainTextIsVisible(): MainPageSteps {
        Assert.assertTrue(isTextOnScreen(this.mainPageText))
        return this;
    }
}