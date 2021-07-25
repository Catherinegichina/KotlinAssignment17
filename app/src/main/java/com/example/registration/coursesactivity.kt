package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class coursesactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coursesactivity)
        var rvCourses=findViewById<RecyclerView>(R.id.rvcourses)
        var courseList= listOf(
            Course("hhh06","Kotlin","introduction","john"),
            Course("HFF88","backend","introduction","mwai"),
            Course("jjj44","backend","intro","purity"),

//            dont forget the comma after the bracket.

        )
        var coursesAdapter=CoursesAdapter(courseList)
        rvCourses.layoutManager=LinearLayoutManager(baseContext)
        rvCourses.adapter=coursesAdapter
//        if horizontally,or gid-manager
//        coursesList-what we have inputed.
//        here we are creating our adapter.
    }

}
//viewholder-multiple text views.
//Create a contacts app:list of contacts(in a recycler view)-name,number,email(recyclerview/cardview)