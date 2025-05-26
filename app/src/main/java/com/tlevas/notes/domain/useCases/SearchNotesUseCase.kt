package com.tlevas.notes.domain.useCases

import com.tlevas.notes.domain.entity.Note
import com.tlevas.notes.domain.repository.NotesRepository
import kotlinx.coroutines.flow.Flow

class SearchNotesUseCase(private val notesRepository: NotesRepository) {

    operator fun invoke(query: String): Flow<List<Note>> {
        return notesRepository.searchNotes(query)
    }
}