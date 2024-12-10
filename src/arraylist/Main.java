package arraylist;
import arraylist.dao.impl.StudentDaoImpl;
import arraylist.models.Student;
import arraylist.service.impl.StudentServiceImpl;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentDaoImpl studentDao = new StudentDaoImpl();

        StudentServiceImpl service = new StudentServiceImpl(studentDao);

        ArrayList<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student("Baiel",19,"java"),
                        new Student("Aibek",23,"java"),
                        new Student("Amir",31,"js"),
                        new Student("Kanchoro",49,"java"),
                        new Student("Ainura",29,"js"),
                        new Student("Muhammedally",14,"js"),
                        new Student("Nursiltan",12,"java"),
                        new Student("Alymbek",15,"java"),
                        new Student("Tilek",22,"js"),
                        new Student("Sanjar",22,"js")
                ));

        // add
        System.out.println(service.addStudent(students));

        //get all
//        System.out.println(service.getAll());

        //sort group name
//        System.out.println(service.getAllGroupName("java"));
//        System.out.println(service.getAllGroupName("js"));

        //sort age
//        System.out.println(service.sortTOAge(19,23));

        //get name first char A
//        System.out.println(service.nameSingleA());

    }
}