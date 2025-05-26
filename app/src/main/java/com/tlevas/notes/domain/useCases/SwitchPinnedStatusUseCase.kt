package com.tlevas.notes.domain.useCases

import com.tlevas.notes.domain.repository.NotesRepository

class SwitchPinnedStatusUseCase(private val notesRepository: NotesRepository) {

    operator fun invoke(noteId: Int) {
        notesRepository.switchPinnedStatus(noteId)
    }
}