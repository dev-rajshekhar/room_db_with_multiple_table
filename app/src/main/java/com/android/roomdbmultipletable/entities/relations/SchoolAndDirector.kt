package com.android.roomdbmultipletable.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.android.roomdbmultipletable.entities.Director
import com.android.roomdbmultipletable.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(parentColumn = "schoolName", entityColumn ="schoolName " ) val director: Director
)