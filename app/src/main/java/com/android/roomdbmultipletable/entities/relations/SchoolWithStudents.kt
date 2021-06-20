package com.android.roomdbmultipletable.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.android.roomdbmultipletable.entities.Director
import com.android.roomdbmultipletable.entities.School
import com.android.roomdbmultipletable.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(parentColumn = "schoolName", entityColumn = "schoolName") val students: List<Student>
)