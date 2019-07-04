package com.stackroute.junittest5;

import com.stackroute.junittest5.StudentClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

    public List<StudentClass> studentInfo()
    {
        //data entered
        StudentClass obj1 = new StudentClass(1, "Abinash", 23);
        StudentClass obj2 = new StudentClass(3, "Sudip", 25);
        StudentClass obj3 = new StudentClass(2, "Vishnu Priya", 27);
        StudentClass obj4 = new StudentClass(4, "Moupali", 23);
        StudentClass obj5 = new StudentClass(5, "Clinton", 24);

        List<StudentClass> list = new ArrayList<StudentClass>();
        //data added to the list
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

        //sorting of the data
        Collections.sort(list, new StudentSorter());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        return list;
    }

}