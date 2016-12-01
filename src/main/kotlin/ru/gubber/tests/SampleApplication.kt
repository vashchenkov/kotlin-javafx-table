package ru.gubber.tests

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

/**
 * Created by a.vashchenkov on 28.11.2016.
 */
class SampleApplication : Application() {

	override fun init() {
	}

	@Throws(Exception::class)
	override fun start(initStage: Stage) {
		val resource = javaClass.classLoader.getResource("ru/gubber/tests/main-screen.fxml")
		val fxmlLoader = FXMLLoader()
		val root: Parent = fxmlLoader.load(resource.openStream())
		// layout the scene.
		val scene = Scene(root, 1000.0, 600.0)
		initStage.scene = scene
		initStage.minHeight = 400.0
		initStage.minWidth = 600.0
		initStage.show()
	}

}