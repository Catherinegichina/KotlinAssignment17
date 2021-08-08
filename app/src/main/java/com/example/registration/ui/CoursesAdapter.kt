package com.example.registration

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CoursesAdapter(var courseList:List<Course>): RecyclerView.Adapter<CoursesViewHolder>() {
    //  list<course>-takes in a list of type course.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.course_list_item,parent,false)
        return CoursesViewHolder(itemView)

//        we have created our adapter next,bind the adapter to the reccyler view.
    }

    override fun onBindViewHolder(holder: CoursesViewHolder, position: Int) {
//        gets the item at the current position.
//        displays details we want to display our details in.-viewholder.
//        TAKES DATA FROM OUR LIST AND DISPLAYS IT.GOES THROUGH IT ONE BY ONE.
//        pick the view,a
        var currentCourse=courseList.get(position)
        holder.tvcourseName.text=currentCourse.courseName
        holder.tvdescription.text=currentCourse.description
        holder.tvinstructor.text=currentCourse.instructor
        holder.tvcoursecode.text=currentCourse.courseCode
//        .text-gets the value stored in the text edit

    }

    override fun getItemCount(): Int {
        return courseList.size

    }


//    we will pass a list of courses to that adapter.
//    3 methods the adapter need(control and i)
//    getting size of ur list


}

class CoursesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
//    what we get to see

    var tvcourseName=itemView.findViewById<TextView>(R.id.tvcoursename)
    var tvdescription=itemView.findViewById<TextView>(R.id.tvdescription)
    var tvinstructor=itemView.findViewById<TextView>(R.id.tvinstructor)
    var tvcoursecode=itemView.findViewById<TextView>(R.id.tvcoursecode)
//    R.id.tvcoursecode is a way we have labeled the tvcoursecode.
}
//ALLOWS US TO ACCESS INDIVIDULA RTEXT VIEWS
//takes an item view as a parameter
//inherits from recyclerview.then we pass it to view holder and pass it to the parent class
//Adapter has 2 classes:view  holder and adapter......viewholder||adapter||recycler view.