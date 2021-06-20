package com.android.roomdbmultipletable.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.android.roomdbmultipletable.entities.Student
import com.android.roomdbmultipletable.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)

    )
    val students: List<Student>


)