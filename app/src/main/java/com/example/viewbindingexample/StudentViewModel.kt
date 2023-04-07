package com.example.viewbindingexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentViewModel : ViewModel() {

    val list = arrayListOf(
        DataStudent("Sekar", "J3C119113", R.mipmap.inf_foreground),
        DataStudent("Difya Aulia Rani", "64634634", R.mipmap.inf_foreground),
        DataStudent("Ageng Ayu", "536436436", R.mipmap.inf_foreground),
        DataStudent("Faishal Rasyid", "454345435",  R.mipmap.inf_foreground),
        DataStudent("Metty Ken Mukrominatin", "3252664",  R.mipmap.inf_foreground)
    )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudentList(){
        var stu = list
        studentList.value = stu
    }
}