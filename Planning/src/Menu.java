import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 */
public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void menu() throws IOException {

        TaskScheduler list = new TaskScheduler();
        while (true) {
            System.out.println("\nПЛАНИРОВЩИК ЗАДАЧ");
            System.out.println("1. Создать запись");
            System.out.println("2. Удалить запись");
            System.out.println("3. Сохранить запись в файл");
            System.out.println("4. Список заполненных только что задач");
            System.out.println("5. Поиск задачи");
            System.out.println("6. Выход");
            System.out.print("Выберите номер: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Внести описание задачи: ");
                    String description = scanner.nextLine();
                    System.out.print("Введите дату дедлайна (dd/MM/yyyy): ");
                    Date deadline = null;
                    try {
                        deadline = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
                    } catch (ParseException e) {
                        System.out.println("неверный формат даты: " + e.getMessage());
                        break;
                    }
                    System.out.print("Введите имя автора: ");
                    String author = scanner.nextLine();
                    System.out.println("выберите приоритет (LOW, MIDDLE, or HIGH): ");
                    Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());
                    Task task = new Task(list.tasks.size() + 1, new Date(), description, deadline, author, priority);
                    list.addTask(task);
                    break;
                case 2:
                    System.out.print("Введите ID: ");
                    int id = scanner.nextInt();
                    list.deleteTask(id);
                    break;
                case 3:
                    System.out.println("Введите формат для сохранения (csv, or xml): ");
                    String format = scanner.nextLine().toLowerCase();
                    list.saveTaskToFile(format);
                    break;
                case 4:
                    list.printTasks();
                    break;
                case 5:
                    list.searchTasks();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Недопустимый выбор");
                    break;
            }
        }
    }
}

