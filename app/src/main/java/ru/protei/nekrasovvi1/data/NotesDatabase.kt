package ru.protei.nekrasovvi1.data

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.protei.nekrasovvi1.domain.Note

@Database(
    entities = [Note::class],
    version = 2,
    exportSchema = false
)
abstract class NotesDatabase : RoomDatabase() {
    abstract fun notesDao(): NotesDao
}