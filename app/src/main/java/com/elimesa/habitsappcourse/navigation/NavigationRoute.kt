package com.elimesa.habitsappcourse.navigation

sealed class NavigationRoute(val route: String) {
    object Onboarding: NavigationRoute("onboarding")
}