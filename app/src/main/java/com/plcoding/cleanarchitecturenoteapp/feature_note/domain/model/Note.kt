package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.plcoding.cleanarchitecturenoteapp.ui.theme.*
import java.lang.Exception

@Entity
data class Note(
  @PrimaryKey val id: Int? = null,
  val title: String,
  val content: String,
  val timestamp: Long,
  val color: Int
) {
  companion object {
    val noteColors = listOf(
      RedOrange,
      RedPink,
      BabyBlue,
      Violet,
      LightGreen
    )
  }
}

class InvalidNoteException(message: String): Exception(message)