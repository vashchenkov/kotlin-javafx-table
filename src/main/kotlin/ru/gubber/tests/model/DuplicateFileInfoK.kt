package ru.gubber.tests.model

import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.property.SimpleLongProperty
import javafx.beans.property.SimpleStringProperty

/**
 * Created by gubber on 28-Oct-16.
 */
class DuplicateFileInfoK(id: Long, path: String, shouldBeDeleted: Boolean) {

	val id:SimpleLongProperty = SimpleLongProperty()
	val path:SimpleStringProperty = SimpleStringProperty()
	val shouldBeDeleted:SimpleBooleanProperty = SimpleBooleanProperty()
	init{
		this.id.set(id)
		this.path.set(path)
		this.shouldBeDeleted.set(shouldBeDeleted)
	}

	override fun toString(): String {
		return "DuplicateFileInfo(id=$id, path='$path', shouldBeDeleted=$shouldBeDeleted)"
	}

}