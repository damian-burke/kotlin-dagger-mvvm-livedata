package com.brainasaservice.dashboard.repository

import io.reactivex.Single
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date

class DashboardRepositoryImpl : DashboardRepository {

    private val sdf: DateFormat = SimpleDateFormat.getTimeInstance()

    override fun getText(): Single<String> = Single.just("Dashboard Time is " +
            sdf.format(Date()))

}