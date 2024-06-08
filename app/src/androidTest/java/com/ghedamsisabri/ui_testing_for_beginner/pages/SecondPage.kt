package com.ghedamsisabri.ui_testing_for_beginner.pages
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.ghedamsisabri.ui_testing_for_beginner.R
import org.hamcrest.Matcher

object SecondPage {
    val secondPage: Matcher<View> by lazy { withId(R.id.secondary) }
    val backBtn : Matcher<View> by lazy { withId(R.id.button_back) }
    val secondPageActivityText: Matcher<View> by lazy { withId(R.id.activity_secondary_title) }
}