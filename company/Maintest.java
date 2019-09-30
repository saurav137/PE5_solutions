package com.company;

import javax.security.sasl.SaslClient;
import java.util.*;

public class Maintest {
    public void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Students");
        int num=sc.nextInt();
        List<Student> studentList=new ArrayList<Student>();
        for(int i=0;i<num;i++){
            Student student=new Student();
            System.out.println("Name of student?");
            String name=sc.next();
            student.setName(name);
            System.out.println("Enter age");
            int age=sc.nextInt();
            student.setAge(age);
            System.out.println("Enter id");
            int id=sc.nextInt();
            student.setId(id);
            studentList.add(student);

        }
        Collections.sort(studentList,new StudentSortingComparator());
        for(int i=0;i<num;i++){
            System.out.println(studentList.get(i).getAge()+" "+studentList.get(i).getName()+" "+ studentList.get(i).getId());
        }
    }
}
