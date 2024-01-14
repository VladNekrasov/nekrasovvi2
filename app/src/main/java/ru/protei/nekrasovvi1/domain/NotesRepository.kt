package ru.protei.nekrasovvi1.domain

import kotlinx.coroutines.flow.Flow

interface NotesRepository {
    suspend fun add(note: Note): Long
    suspend fun update(note: Note)
    fun allFlow(): Flow<List<Note>>
    fun deleteAll()

}