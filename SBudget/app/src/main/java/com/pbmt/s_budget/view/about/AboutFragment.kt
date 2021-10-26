package com.pbmt.s_budget.view.about

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.viewModels
import com.pbmt.s_budget.BuildConfig
import com.pbmt.s_budget.R
import com.pbmt.s_budget.databinding.FragmentAboutBinding
import com.pbmt.s_budget.view.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutFragment : BaseFragment<FragmentAboutBinding, AboutViewModel>() {
    override val viewModel: AboutViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() = with(binding) {
        appVersion.text = getString(
            R.string.text_app_version,
            BuildConfig.VERSION_NAME,
            BuildConfig.VERSION_CODE
        )

//        license.setOnClickListener {
//            viewModel.launchLicense().run {
//                launchBrowser(viewModel.url.value)
//            }
//        }

//        visitURL.setOnClickListener {
//            viewModel.launchRepository().run {
//                launchBrowser(viewModel.url.value)
//            }
//        }
    }

    private fun launchBrowser(url: String) =
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
            startActivity(it)
        }

    override fun getViewBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentAboutBinding.inflate(inflater, container, false)
}