package arraylist.dao.impl;
import arraylist.dao.StudentDao;
import arraylist.db.DataBase;
import arraylist.models.Student;
import java.util.ArrayList;


public class StudentDaoImpl implements StudentDao {

    @Override
    public void save(ArrayList<Student> newStudents) {
        DataBase.students.addAll(newStudents);
    }

    @Override
    public ArrayList<Student> getAll() {
        return DataBase.students;
    }

    @Override
    public ArrayList<Student> sortTOGroupName(String GroupName) {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : DataBase.students) {
            if (student.getGroup().equals(GroupName)){
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public ArrayList<Student> sortTOAge(int age1 , int age2) {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : DataBase.students) {
            if (student.getAge() >= age1 && student.getAge() < age2+1){
                students.add(student);
            }
        }
        return students;
    }

    @Override
    public ArrayList<Student> nameSingleA() {
    ArrayList<Student> students = new ArrayList<>();
        for (Student student : DataBase.students) {
            if (student.getName().charAt(0) == 'A'){
                students.add(student);
            }

        }
        return students;
    }


}
