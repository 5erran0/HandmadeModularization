package com.ginebra.featurea

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ginebra.di.DIApp
import com.ginebra.featurea.di.FeatureAModule
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = ((application as DIApp).componentManager.featureAComponent as FeatureAModule).provideMainPresenter(this)
    }

    override fun onStart() {
        super.onStart()
        presenter.onStart()
    }

    override fun showValue(string: String) {
        text.text = string
    }
}
