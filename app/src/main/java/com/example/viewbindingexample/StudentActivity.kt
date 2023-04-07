package com.example.viewbindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentActivity : AppCompatActivity() {

    lateinit var rvStudent : RecyclerView
    lateinit var studentVm : StudentViewModel
    lateinit var studentAdapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        initStudent()
        // Memanggil Student View Model
        studentVm = ViewModelProvider(this).get(StudentViewModel::class.java)

        studentVm.getStudentList()
        studentVm.studentList.observe(this, Observer {
            studentAdapter.setStudentData(it as ArrayList<DataStudent>)
        })

    }

    fun initStudent (){
        rvStudent = findViewById(R.id.rvStudent)
        studentAdapter = StudentAdapter(ArrayList())
        rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvStudent.adapter = studentAdapter
    }

    fun setDataStudent (){

    }


}