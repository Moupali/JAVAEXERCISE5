package com.stackroute.junittest5;

import java.util.Comparator;

public class StudentSorter implements Comparator<StudentClass>
{

    public int compare(StudentClass Stu1,StudentClass Stu2)
    {
        if(Stu1.getAge()>Stu2.getAge())
            return Stu1.getAge()-Stu2.getAge();

        else if(Stu1.getAge()==Stu2.getAge()&&!Stu1.getName().equals(Stu2.getName()))
            return Stu1.getName().compareToIgnoreCase(Stu2.getName());

        else
            return Stu1.getId()-Stu2.getId();
    }

}
