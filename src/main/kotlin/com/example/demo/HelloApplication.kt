package com.example.demo

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class ScreenshoterApp : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(ScreenshoterApp::class.java.getResource("hello-view.fxml"))
        val layout: Parent = fxmlLoader.load()
        fxmlLoader.getController<HelloController>().stage = stage
        val scene = Scene(layout)
        stage.title = "ScreenshoterApp"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(ScreenshoterApp::class.java)
}