package com.ghedamsisabri.ui_testing_for_beginner.steps

import com.ghedamsisabri.ui_testing_for_beginner.Helper.assertIsViewDisplayed
import com.ghedamsisabri.ui_testing_for_beginner.Helper.getText
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isTextOnScreen
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isViewDisplayed
import com.ghedamsisabri.ui_testing_for_beginner.Helper.tap
import com.ghedamsisabri.ui_testing_for_beginner.data.Constants
import com.ghedamsisabri.ui_testing_for_beginner.pages.MainPage
import com.ghedamsisabri.ui_testing_for_beginner.pages.SecondPage
import org.junit.Assert

class SecondPageSteps {
    private lateinit var secondPageText: String;

    fun saveSecondPageText(): SecondPageSteps {
        this.secondPageText = SecondPage.secondPageActivityText.getText();
        return this;
    }
    fun assertSecondTextIsVisible(): SecondPageSteps {
        Assert.assertTrue(isTextOnScreen(this.secondPageText))
        return this;
    }
    fun assertSecondPageTextEquals(text: String): SecondPageSteps {
        Assert.assertEquals(this.secondPageText, text)
        return this;
    }
    fun assertBackButtonIsVisible() {
        Assert.assertTrue(SecondPage.backBtn.isViewDisplayed())
    }
    fun tapBackButton(): SecondPageSteps {
        SecondPage.backBtn.tap(Constants.TIMEOUT)
        return this;
    }
    fun checkSecondPageLoaded(): SecondPageSteps {
        Assert.assertTrue(SecondPage.secondPage.isViewDisplayed())
        return this;
    }
}