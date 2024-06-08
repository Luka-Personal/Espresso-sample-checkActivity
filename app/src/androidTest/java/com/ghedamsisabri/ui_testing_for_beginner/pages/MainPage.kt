package com.ghedamsisabri.ui_testing_for_beginner.pages
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.ghedamsisabri.ui_testing_for_beginner.R
import org.hamcrest.Matcher

object MainPage {
    val mainPage: Matcher<View> by lazy { withId(R.id.main) }
    val nextBtn: Matcher<View> by lazy { withId(R.id.button_next_activity) }
    val mainPageActivityText: Matcher<View> by lazy { withId(R.id.activity_main_title) }
}