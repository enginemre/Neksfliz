package com.engin.neksfliz.navigation

import com.engin.neksfliz.downloads.api.DownloadsApi
import com.engin.neksfliz.home.api.HomeApi
import com.engin.neksfliz.new_and_popular.api.NewAndPopularApi
import javax.inject.Inject

class NavigationProvider @Inject constructor(
     val homeApi: HomeApi,
     val newAndPopularApi: NewAndPopularApi,
     val downloadsApi: DownloadsApi
)