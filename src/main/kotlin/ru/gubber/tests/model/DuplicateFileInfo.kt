package ru.gubber.tests.model

import javafx.beans.property.*

/**
 * Created by gubber on 01-Dec-16.
 */
	class DuplicateFileInfo(id: Long?, path: String, shouldBeDeleted: Boolean?) {

		private val id: LongProperty
		private val path: StringProperty
		private val shouldBeDeleted: BooleanProperty

		init {
			this.id = SimpleLongProperty(id!!)
			this.path = SimpleStringProperty(path)
			this.shouldBeDeleted = SimpleBooleanProperty(shouldBeDeleted!!)
		}

		fun getId(): Long {
			return id.get()
		}

		fun idProperty(): LongProperty {
			return id
		}

		fun setId(id: Long) {
			this.id.set(id)
		}

		fun getPath(): String {
			return path.get()
		}

		fun pathProperty(): StringProperty {
			return path
		}

		fun setPath(path: String) {
			this.path.set(path)
		}

		var isShouldBeDeleted: Boolean
			get() = shouldBeDeleted.get()
			set(shouldBeDeleted) = this.shouldBeDeleted.set(shouldBeDeleted)

		fun shouldBeDeletedProperty(): BooleanProperty {
			return shouldBeDeleted
		}

		override fun toString(): String {
			val sb = StringBuffer("DuplicateFileInfo{")
			sb.append("id=").append(id.get())
			sb.append(", path=").append(path.get())
			sb.append(", shouldBeDeleted=").append(shouldBeDeleted.get())
			sb.append('}')
			return sb.toString()
		}
	}