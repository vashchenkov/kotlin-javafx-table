package ru.gubber.tests

import javafx.application.Application

/**
 * Created by a.vashchenkov on 28.11.2016.
 */
class TestApp {

	companion object {

		@Throws(Exception::class)
		@JvmStatic fun main(args: Array<String>) {
			Application.launch(SampleApplication::class.java)
		}
	}

}