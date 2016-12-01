package ru.gubber.tests

import javafx.beans.property.SimpleBooleanProperty
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TableColumn
import javafx.scene.control.TableView
import javafx.scene.control.cell.CheckBoxTableCell
import ru.gubber.tests.model.DuplicateFileInfo

/**
 * Created by a.vashchenkov on 28.11.2016.
 */
class MainScreenController {
	@FXML
	lateinit var duplicatesList: TableView<DuplicateFileInfo>
	@FXML
	lateinit var removeColumn: TableColumn<DuplicateFileInfo, SimpleBooleanProperty>

	@FXML
	lateinit var printBrn: Button

	fun initialize() {

		printBrn.onAction = EventHandler { e->
			run {
				duplicatesList.items.forEach(::println)
			}
		}
		removeColumn.setCellFactory({ col ->
			val cell = CheckBoxTableCell<DuplicateFileInfo, SimpleBooleanProperty> { index ->
				val active = duplicatesList.items[index].shouldBeDeletedProperty()
				active.addListener { obs, wasActive, isNowActive ->
					val item = duplicatesList.items[index]
					item.shouldBeDeletedProperty().set(isNowActive)
				}
				active
			}
			cell
		})

		duplicatesList.items.add(DuplicateFileInfo(1L, "d:/test/1.txt", true))
	}

	@FXML
	public fun printAllItems(event: ActionEvent) {
		duplicatesList.items.forEach(::println)
	}
}