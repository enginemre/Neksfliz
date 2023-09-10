package com.engin.neksfliz.navigation



import com.engin.neksfliz.R
import com.engin.neksfliz.common.Routes

sealed class BottomTabs {

    abstract val title: Int
    abstract val icon: Int
    abstract val selectedIcon : Int
    abstract val route: String
    data class Home(
        override val title: Int = R.string.home,
        override val icon: Int = R.drawable.ic_home_unselected,
        override val selectedIcon: Int = R.drawable.ic_home_selected,
        override val route: String = Routes.Home
    ) : BottomTabs()

    data class Downloads(
        override val title: Int = R.string.downloads,
        override val icon: Int = R.drawable.ic_download_unselected,
        override val selectedIcon: Int = R.drawable.ic_download_selected,
        override val route: String =  Routes.Downloads
    ) : BottomTabs()

    data class NewAndPopulars(
        override val title: Int = R.string.new_and_popular,
        override val icon: Int = R.drawable.ic_popular_unselected,
        override val selectedIcon: Int = R.drawable.ic_popular_selected,
        override val route: String = Routes.NewAndPopulars
    ) : BottomTabs()

    companion object{
        val tabs = listOf<BottomTabs>(
            Home(),
            Downloads(),
            NewAndPopulars()
        )
    }
}