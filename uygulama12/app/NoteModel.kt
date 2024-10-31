import androidx.room.Entity
package com.example.uygulama12
import androidx.room.PrimaryKey

@Entity(tableName = "notlar")
data class NoteModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val note: String
    val noteTitle: String,
    val noteDescription: String
}
