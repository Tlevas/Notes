package com.tlevas.notes.domain.repository

import com.tlevas.notes.domain.entity.Note
import kotlinx.coroutines.flow.Flow

interface NotesRepository {

    fun addNote(note: Note)

    fun deleteNote(noteId: Int)

    fun editNote(note: Note)

    fun getAllNotes(): Flow<List<Note>>

    fun getNote(noteId: Int): Note

    fun searchNotes(query: String): Flow<List<Note>>

    fun switchPinnedStatus(noteId: Int)
}