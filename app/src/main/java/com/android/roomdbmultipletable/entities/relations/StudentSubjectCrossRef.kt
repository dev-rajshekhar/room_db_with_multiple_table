package com.android.roomdbmultipletable.entities.relations

import androidx.room.Entity

@Entity(primaryKeys = ["studentName","subjectName"])
data class StudentSubjectCrossRef(val subjectName: String, val studentName: String) {
}