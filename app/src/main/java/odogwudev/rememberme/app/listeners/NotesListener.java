package odogwudev.rememberme.app.listeners;

import odogwudev.rememberme.app.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
