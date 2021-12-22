package com.noor.yasser.ps.testcompose

import android.os.SystemClock
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import com.noor.yasser.ps.testcompose.ui.components.RallyTopAppBar
import org.junit.Rule
import org.junit.Test

class AnimatingCircleTests {

    @get:Rule
    val composeTestRule = createComposeRule()


    @Test
    fun rallyTopAppBarTest() {
        val allScreens = RallyScreen.values().toList()
        composeTestRule.setContent {
            RallyTopAppBar(
                allScreens = allScreens,
                onTabSelected = { },
                currentScreen = RallyScreen.Accounts
            )
        }

        composeTestRule
            .onNodeWithContentDescription(RallyScreen.Accounts.name)
            .assertIsSelected()
    }

}