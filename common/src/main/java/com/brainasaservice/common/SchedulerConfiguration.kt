package com.brainasaservice.common

import io.reactivex.Scheduler

interface SchedulerConfiguration {
    var io: Scheduler

    var computation: Scheduler

    var ui: Scheduler
}
