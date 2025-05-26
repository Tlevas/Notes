package com.tlevas.notes.domain

import com.tlevas.notes.domain.entity.Note
import kotlinx.coroutines.flow.Flow

class SearchNotesUseCase {

    operator fun invoke(query: String): Flow<List<Note>> {
        TODO()
    }
}