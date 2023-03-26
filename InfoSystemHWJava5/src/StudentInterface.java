import java.io.IOException;
import java.util.ArrayList;

public interface StudentInterface {
    void addStudent(ArrayList<Student> list);
    void changeStudent(ArrayList<Student> list);
    void deleteStudent(ArrayList<Student> list);
    void findStudents(ArrayList<Student> list);
    void findOneStudent(ArrayList<Student> list);
    void saveToFileStudents(ArrayList<Student> list) throws IOException;
    void openFileStudents(ArrayList<Student> list) throws IOException;
}
