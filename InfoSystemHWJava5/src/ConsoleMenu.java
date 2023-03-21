import java.util.ArrayList;

public class ConsoleMenu implements Printable{
    ArrayList<Student> list = new ArrayList<>();
    StudentManager stu = new StudentManager();
    @Override
    public void print() {

        System.out.println("Добро пожаловать в систему управления информацией о студентах");
        System.out.println("1. Просмотр всей информации о студентах");
        System.out.println("2. Просмотр индивидуальной информации о студенте");
        System.out.println("3. Добавить студента");
        System.out.println("4. Изменить индивидуальную информацию студента");
        System.out.println("5. Удалить учащегося");
        System.out.println("6. Выход");

        System.out.print("Выберите пункт меню для продолжения: ");
    }

}
