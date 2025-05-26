package com.tlevas.notes.domain.useCases

import com.tlevas.notes.domain.entity.Note
import com.tlevas.notes.domain.repository.NotesRepository

class GetNoteUseCase(private val notesRepository: NotesRepository) {

    operator fun invoke(noteId: Int): Note {
        return notesRepository.getNote(noteId)
    }
}