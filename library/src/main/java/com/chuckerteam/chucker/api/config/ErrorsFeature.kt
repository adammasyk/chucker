package com.chuckerteam.chucker.api.config

import android.content.Context
import androidx.fragment.app.Fragment
import com.chuckerteam.chucker.R
import com.chuckerteam.chucker.api.Chucker
import com.chuckerteam.chucker.internal.ui.error.ErrorListFragment

class ErrorsFeature(
    override var enabled: Boolean,
    var showNotification: Boolean
) : TabFeature {
    override val name: Int = R.string.chucker_tab_errors

    override val id: Int = Chucker.SCREEN_ERROR

    override fun newFragment(): Fragment {
        return ErrorListFragment.newInstance()
    }

    override fun dismissNotification(context: Context) {
        Chucker.dismissErrorsNotification(context)
    }

    companion object {
        fun default(): ErrorsFeature =
            ErrorsFeature(
                enabled = true,
                showNotification = true
            )
    }
}