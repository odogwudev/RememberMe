package odogwudev.rememberme.app.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import odogwudev.rememberme.app.NoteDao.NoteDao;
import odogwudev.rememberme.app.entities.Note;

@Database(entities = Note.class, version = 1, exportSchema = false)
public abstract class DeleteDatabase extends RoomDatabase {

    protected static DeleteDatabase deleteDatabase;

    public static synchronized DeleteDatabase getNotesDatabase(Context context){
        if(deleteDatabase == null){
            deleteDatabase = Room.databaseBuilder(
                    context,
                    DeleteDatabase.class,
                    "delete_db"
            ).build();
        }
        return deleteDatabase;
    }

    public abstract NoteDao noteDao();
}
