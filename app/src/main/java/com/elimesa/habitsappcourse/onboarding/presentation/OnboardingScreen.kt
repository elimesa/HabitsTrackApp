package com.elimesa.habitsappcourse.onboarding.presentation

import androidx.compose.runtime.Composable
import com.elimesa.habitsappcourse.R
import com.elimesa.habitsappcourse.onboarding.presentation.components.OnboardingPager

@Composable
fun OnboardingScreen(
    onFinish: () -> Unit
) {
    val pages = listOf(
        OnboardingPagerInformation(
            title = "Welcome to Monumental Habits",
            subtitle = "We can help yoy to be a better version of yourself.",
            image = R.drawable.onboarding1
        ),
        OnboardingPagerInformation(
            title = "Create new habits easily",
            subtitle = "We can help yoy to be a better version of yourself.",
            image = R.drawable.onboarding2
        ),
        OnboardingPagerInformation(
            title = "Keep track of your progress",
            subtitle = "We can help yoy to be a better version of yourself.",
            image = R.drawable.onboarding3
        ),
        OnboardingPagerInformation(
            title = "Join a supportive community",
            subtitle = "We can help yoy to be a better version of yourself.",
            image = R.drawable.onboarding4
        )
    )
    OnboardingPager(pages = pages, onFinish = onFinish)
}