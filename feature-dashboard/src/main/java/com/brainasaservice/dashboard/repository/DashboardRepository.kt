package com.brainasaservice.dashboard.repository

import io.reactivex.Single

interface DashboardRepository {
    fun getText(): Single<String>
}
