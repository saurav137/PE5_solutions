package com.company;


import java.util.Comparator;

class StudentSortingComparator implements Comparator<Student> {

    @Override
    public int compare(Student name1, Student name2) {

        // for comparison
       //
        int NameCompare = name1.getName().compareTo(name2.getName());
        int AgeCompare = name1.getAge()-(name2.getAge());
        int IdCompare=name1.getId()-name2.getId();

        // 2-level comparison using if-else block
        if (AgeCompare == 0) {
            if(NameCompare==0) {
                return IdCompare;
            }
            else return NameCompare;
        } else {
            return AgeCompare;
        }
    }
}