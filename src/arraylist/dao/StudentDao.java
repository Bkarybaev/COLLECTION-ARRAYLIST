package arraylist.dao;

import arraylist.models.Student;

import java.util.ArrayList;

public interface StudentDao {

    void save(ArrayList<Student> newStudents);

    ArrayList<Student> getAll();

    ArrayList<Student> sortTOGroupName(String GroupName);

    ArrayList<Student> sortTOAge(int age1 , int age2);

    ArrayList<Student> nameSingleA();
}
