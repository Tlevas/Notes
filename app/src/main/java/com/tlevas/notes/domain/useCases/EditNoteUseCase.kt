package com.tlevas.notes.domain.useCases

import com.tlevas.notes.domain.entity.Note
import com.tlevas.notes.domain.repository.NotesRepository

class EditNoteUseCase(private val notesRepository: NotesRepository) {

    operator fun invoke(note: Note) {
        notesRepository.editNote(note)
    }
}