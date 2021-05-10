package com.example.randomnumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.randomnumbers.dagger.RandomApplication
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory // подключаем фабрику

    override fun onCreate(savedInstanceState: Bundle?) {

        (application as RandomApplication).applicationComponents.createMainSubcomponent().inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProvider(this, factory).get(MainViewModel::class.java)
        viewModel.getLiveData().observe(this, Observer {
                findViewById<TextView>(R.id.activity_main_textView).text = it.toString() //
        // подсоединяем для показа полученных чисел
        } )

        findViewById<TextView>(R.id.activity_main_button).setOnClickListener {
            viewModel.generateNextNumber() // нажатие кнопки вызывает генерацию случайных чисел
        }











    }
}