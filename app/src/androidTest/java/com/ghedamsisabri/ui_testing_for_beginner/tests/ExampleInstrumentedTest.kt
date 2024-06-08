package com.ghedamsisabri.ui_testing_for_beginner.tests
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.ghedamsisabri.ui_testing_for_beginner.Helper.assertIsViewDisplayed
import com.ghedamsisabri.ui_testing_for_beginner.Helper.getText
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isTextOnScreen
import com.ghedamsisabri.ui_testing_for_beginner.Helper.tap
import com.ghedamsisabri.ui_testing_for_beginner.MainActivity
import com.ghedamsisabri.ui_testing_for_beginner.data.Constants
import com.ghedamsisabri.ui_testing_for_beginner.steps.MainPageSteps
import com.ghedamsisabri.ui_testing_for_beginner.steps.SecondPageSteps
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest {
    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()
    private val mainPageSteps = MainPageSteps()
    private val secondPageSteps = SecondPageSteps()

    @Test
    fun testCaseFirst() {
        mainPageSteps
            .checkMainPageLoaded()
            .tapNextBtn()
        secondPageSteps
            .checkSecondPageLoaded()
            .saveSecondPageText()
            .assertSecondTextIsVisible()
            .assertSecondPageTextEquals(Constants.SECONDARY_PAGE_TEXT)
            .assertBackButtonIsVisible()
    }
    @Test
    fun testCaseSecond() {
        mainPageSteps
            .checkMainPageLoaded()
            .tapNextBtn();
        secondPageSteps
            .tapBackButton()
        mainPageSteps
            .saveMainPageText()
            .assertMainTextIsVisible()
            .assertMainPageTextEquals(Constants.MAIN_PAGE_TEXT)
            .assertNextButtonIsVisible();
    }
}