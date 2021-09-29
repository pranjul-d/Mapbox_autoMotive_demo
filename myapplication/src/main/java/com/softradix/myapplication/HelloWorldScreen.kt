package com.softradix.myapplication

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.Pane
import androidx.car.app.model.Template
import androidx.car.app.model.PaneTemplate
import androidx.car.app.model.Row


class HelloWorldScreen(carContext: CarContext) : Screen(carContext) {

    override fun onGetTemplate(): Template {

        val row: Row = Row.Builder().setTitle("Hello AA World!").addText("Example text").build()
        return PaneTemplate.Builder(Pane.Builder().addRow(row).build()).setTitle("AA Hello!!!").build()

    }
}