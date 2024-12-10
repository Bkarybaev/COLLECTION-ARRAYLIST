package arraylist.service.impl;
import arraylist.dao.impl.StudentDaoImpl;
import arraylist.exception.AgeException;
import arraylist.exception.NullPointerException;
import arraylist.models.Student;
import arraylist.service.StudentService;
import java.util.ArrayList;


public class StudentServiceImpl implements StudentService {
    StudentDaoImpl studentDao;

    public StudentServiceImpl(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public String addStudent(ArrayList<Student> student) {
        if (student.isEmpty()) {
            try {
                throw new NullPointerException("Student null!!");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        } else {
            studentDao.save(student);
            return "Successful save!";
        }
        return "try again!!";
    }

    @Override
    public ArrayList<Student> getAll() {
        return studentDao.getAll();
    }

    @Override
    public ArrayList<Student> getAllGroupName(String groupName) {
        if (groupName == null || groupName.equals("")) {
            try {
                throw new NullPointerException("Group name null!!");
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
        return studentDao.sortTOGroupName(groupName);

    }

    @Override
    public ArrayList<Student> sortTOAge(int age1, int age2) {
        boolean i = false;
        try {
            if (age1 <= 0 || age1 > 60 || age2 <= 0 || age2 > 60) {
                throw new AgeException("ERROR AGE " + age1);
            } else if (age1 > age2) {
                throw new AgeException("first age big !!");
            }
        }catch (AgeException e){
            i = true;
            System.out.println(e.getMessage());
        }
        if (!i) return studentDao.sortTOAge(age1, age2);
        return null;
    }

    @Override
    public ArrayList<Student> nameSingleA() {
        return studentDao.nameSingleA();
    }
}
