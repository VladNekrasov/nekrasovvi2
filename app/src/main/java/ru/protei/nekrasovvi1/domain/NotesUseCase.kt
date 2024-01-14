package ru.protei.nekrasovvi1.domain

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
class NotesUseCase(
    private val notesRepo: NotesRepository
) {
    suspend fun fillWithInitialNotes(initialNotes: List<Note>){
        notesRepo.deleteAll()
        for (item in initialNotes) {
            notesRepo.add(item)
        }
    }
    suspend fun notesFlow(): Flow<List<Note>> {
        return notesRepo.allFlow()
    }
}