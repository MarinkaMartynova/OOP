import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager implements StudentInterface {
    @Override
    public void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите студенческий билет:");
        int id = sc.nextInt();

        System.out.println("Пожалуйста, введите свое ФИО:");
        String name = sc.next();

        System.out.println("Пожалуйста, введите пол:");
        String sex = sc.next();

        System.out.println("Пожалуйста, введите возраст:");
        int age = sc.nextInt();

        list.add(new Student(id, name, sex, age));

        System.out.println("Добавить завершено");
    }

    @Override
    public void changeStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);

        if (list.size()==0){
            System.out.println("В настоящее время информации о студентах нет");
            return;// Это приведет к непосредственному завершению текущего оператора и не выполнит следующий оператор
        }
        System.out.println("Введите номер студента, которого нужно изменить:");
        int id=sc.nextInt();

        // Определяем, есть ли id в списке, если есть, изменяем его
        boolean flag=false;// Если логическое значение ложно, то человека нет
        for (int i=0;i<list.size();i++){
            if (list.get(i).getId()==id){
                // Если он существует, введите новый идентификатор студента, имя, возраст, адрес
                System.out.println("Введите новый студенческий билет:");
                int idNew=sc.nextInt();

                System.out.println("Введите новое имя:");
                String nameNew=sc.next();

                System.out.println("Введите новую возраст:");
                int ageNew=sc.nextInt();

                System.out.println("Введите новый пол:");
                String sexNew=sc.next();

                list.set(i,new Student(idNew,nameNew,sexNew, ageNew));

                System.out.println("Успешно изменено");
                return;
            }
        }
        if (!flag){
            System.out.println("Студент не найден, дорогой");
        }

    }

    @Override
    public void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        if (list.size() == 0) {
            System.out.println("Нет информации о студентах");
            return;
        }
        findStudents(list);
        System.out.println("Введите идентификатор студента, который нужно удалить:");
        int id = sc.nextInt();

        // Определяем, есть ли идентификатор, который нужно удалить, в списке
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                Object string = list.remove(i);
                System.out.println("Удаление выполнено успешно, вы удалили:" + string);
            }
        }

    }

    @Override
    public void findStudents(ArrayList<Student> list) {
        if (list.size()==0){
            System.out.println("Нет информации о студентах");
        }
        // Запрашиваем всю информацию о студентах
        for (Student student:list){
            System.out.println(student.toString());
            System.out.println("Информация отображена");
        }
    }

    @Override
    public void findOneStudent(ArrayList<Student> list) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите идентификатор студента, которого хотите найти:");
        int id=sc.nextInt();

        for (Student stu:list){
            if (stu.getId()==id){
                System.out.println(stu);
            }else {
                System.out.println("Введенный вами идентификатор не существует");
                return;
            }
        }

    }
}
