package arraylist.service;

import arraylist.models.Student;

import java.util.ArrayList;

public interface StudentService {

    String addStudent(ArrayList<Student> students);

    ArrayList<Student> getAll();

    ArrayList<Student> getAllGroupName(String groupName);

    ArrayList<Student> sortTOAge(int age1 , int age2);

    ArrayList<Student> nameSingleA();


}
