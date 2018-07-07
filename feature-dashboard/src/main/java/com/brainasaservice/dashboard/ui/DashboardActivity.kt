package com.brainasaservice.dashboard.ui

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.brainasaservice.dashboard.R
import com.brainasaservice.dashboard.R.id.timerText
import com.brainasaservice.dashboard.viewmodel.DashboardViewModel
import com.brainasaservice.dashboard.viewmodel.DashboardViewModelFactory
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_dashboard.timerText
import timber.log.Timber
import javax.inject.Inject

class DashboardActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: DashboardViewModelFactory

    private val viewModel: DashboardViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(DashboardViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)

        setContentView(R.layout.activity_dashboard)

        viewModel.observeText().observe({ this@DashboardActivity.lifecycle }) { text ->
            timerText.text = text
        }
    }
}
