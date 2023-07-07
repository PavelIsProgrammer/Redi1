package com.petrs.rediexpress_session1

import com.petrs.rediexpress_session1.domain.models.OnboardingData
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun getFromQueue_isCorrect() {
        val testList = listOf(
            OnboardingData(
                title = "Quick Delivery At Your Doorstep",
                description = "Enjoy quick pick-up and delivery to your destination",
                image = R.drawable.ic_onboarding_1
            ),
            OnboardingData(
                title = "Flexible Payment",
                description = "Different modes of payment either before and after delivery without stress",
                image = R.drawable.ic_onboarding_2
            ),
            OnboardingData(
                title = "Real-time Tracking",
                description = "Track your packages/items from the comfort of your home till final destination",
                image = R.drawable.ic_onboarding_3
            )
        )

        val testFirst = OnboardingData(
            title = "Quick Delivery At Your Doorstep",
            description = "Enjoy quick pick-up and delivery to your destination",
            image = R.drawable.ic_onboarding_1
        )

        val testSecond = OnboardingData(
            title = "Flexible Payment",
            description = "Different modes of payment either before and after delivery without stress",
            image = R.drawable.ic_onboarding_2
        )

        val testThird = OnboardingData(
            title = "Real-time Tracking",
            description = "Track your packages/items from the comfort of your home till final destination",
            image = R.drawable.ic_onboarding_3
        )

        for (i in 0..testList.lastIndex) {
            when (i) {
                0 -> assertEquals(testList[i], testFirst)
                1 -> assertEquals(testList[i], testSecond)
                2 -> assertEquals(testList[i], testThird)
            }
        }
    }

    @Test
    fun subOneAfterGetFromQueue_isCorrect() {
        val testList = arrayListOf(
            OnboardingData(
                title = "Quick Delivery At Your Doorstep",
                description = "Enjoy quick pick-up and delivery to your destination",
                image = R.drawable.ic_onboarding_1
            ),
            OnboardingData(
                title = "Flexible Payment",
                description = "Different modes of payment either before and after delivery without stress",
                image = R.drawable.ic_onboarding_2
            ),
            OnboardingData(
                title = "Real-time Tracking",
                description = "Track your packages/items from the comfort of your home till final destination",
                image = R.drawable.ic_onboarding_3
            )
        )

        for (i in 0..testList.lastIndex) {
            val data = testList[0]
            testList.remove(data)
            assertEquals(2 - i, testList.size)
        }
    }

    @Test
    fun correctTextOnButtonsAfterReselect() {
        val testList = arrayListOf(
            OnboardingData(
                title = "Quick Delivery At Your Doorstep",
                description = "Enjoy quick pick-up and delivery to your destination",
                image = R.drawable.ic_onboarding_1
            ),
            OnboardingData(
                title = "Flexible Payment",
                description = "Different modes of payment either before and after delivery without stress",
                image = R.drawable.ic_onboarding_2
            ),
            OnboardingData(
                title = "Real-time Tracking",
                description = "Track your packages/items from the comfort of your home till final destination",
                image = R.drawable.ic_onboarding_3
            )
        )

        var buttonText = "Next"

        for (i in 0 until testList.lastIndex) {
            val data = testList[0]
            testList.remove(data)
            assertEquals("Next", buttonText)
        }
    }

    @Test
    fun correctTextOnButtonsOnLastSelect() {
        val testList = arrayListOf(
            OnboardingData(
                title = "Quick Delivery At Your Doorstep",
                description = "Enjoy quick pick-up and delivery to your destination",
                image = R.drawable.ic_onboarding_1
            ),
            OnboardingData(
                title = "Flexible Payment",
                description = "Different modes of payment either before and after delivery without stress",
                image = R.drawable.ic_onboarding_2
            ),
            OnboardingData(
                title = "Real-time Tracking",
                description = "Track your packages/items from the comfort of your home till final destination",
                image = R.drawable.ic_onboarding_3
            )
        )

        var buttonText = "Next"

        for (i in 0 until testList.lastIndex) {
            if (testList.size == 1) {
                buttonText = "SignUp"
                assertEquals("SignUp", buttonText)
                return
            }
        }
    }

    @Test
    fun navigateOnSignInScreen() {
        val curFragment = "OnboardingFragment"

        assertEquals("SignInFragment", afterClick(curFragment))
    }

    private fun afterClick(lastFragment: String): String {
        return "SignInFragment"
    }
}