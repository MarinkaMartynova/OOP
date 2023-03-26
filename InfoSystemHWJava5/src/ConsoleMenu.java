import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleMenu{
    public static void menu() {
        // Массив сохраняет информацию о студенте, а тип использует тип Student
        ArrayList<Student> list = new ArrayList<>();
        StudentManager stu = new StudentManager();
        boolean flag = true;
        while (flag) {
            System.out.println("Добро пожаловать в систему управления информацией о студентах ");
            System.out.println(" 1. Запросить всех учащихся  ");
            System.out.println(" 2. Запросить одного ученика ");
            System.out.println(" 3. Добавьте студентов ");
            System.out.println(" 4. Изменить данные студента ");
            System.out.println(" 5. Удалить учащегося ");
            System.out.println(" 6. Сохранить учащегося ");
            System.out.println(" 7. Импорт списка студентов ");
            System.out.println(" 8. Выход ");
            System.out.println("**********************************");
            System.out.println("Введите пункт, с которым хотите работать:");
            // Выбор серийного номера
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    // Запрашиваем студентов
                        stu.findStudents(list);
                case 2 ->
                    // Запрос одного студента
                        stu.findOneStudent(list);
                case 3 ->
                    // Добавить студентов
                        stu.addStudent(list);
                case 4 ->
                    // изменить ученика
                        stu.changeStudent(list);
                case 5 ->
                    // удалить студента
                        stu.deleteStudent(list);
                case 6 ->
                    // сохранить студента в  файл
                        stu.saveToFileStudents(list);
                case 7 ->
                    // сохранить студента в  файл
                        stu.openFileStudents(list);
                case 8 -> {
                    // выходим из программы
                    flag = false;
                    System.out.println("Программа успешно завершилась, добро пожаловать в следующий раз");

                }
            }
        }
    }
}