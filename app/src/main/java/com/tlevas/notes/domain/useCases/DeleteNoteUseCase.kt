package com.tlevas.notes.domain.useCases

import com.tlevas.notes.domain.repository.NotesRepository

class DeleteNoteUseCase(private val notesRepository: NotesRepository) {

    operator fun invoke(noteId: Int) {
        notesRepository.deleteNote(noteId)
    }
}