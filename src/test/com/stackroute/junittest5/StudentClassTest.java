package com.stackroute.junittest5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class StudentClassTest {

    StudentMain obj;
    @Before
    public void setUp() throws Exception {
        obj = new StudentMain();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }

    @Test
    public void studentInfo() {
        StudentClass obj1 = new StudentClass(1, "Abinash", 23);
        StudentClass obj2 = new StudentClass(3, "Sudip", 25);
        StudentClass obj3 = new StudentClass(2, "Vishnu Priya", 27);
        StudentClass obj4 = new StudentClass(4, "Moupali", 23);
        StudentClass obj5 = new StudentClass(5, "Clinton", 24);
        List<StudentClass> list=new ArrayList<StudentClass>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        List<StudentClass> ans=obj.studentInfo();
        String expected="",actual="";
        for(int i=0;i<list.size();i++) {
            expected+=list.get(i).getId()+" "+list.get(i).getName()+" "+list.get(i).getAge()+" ";
        }
        for(int j=0;j<ans.size();j++){
            actual+=ans.get(j).getId()+" "+ans.get(j).getName()+" "+ans.get(j).getAge()+" ";

        }
        assertEquals(expected,actual);
    }

}
