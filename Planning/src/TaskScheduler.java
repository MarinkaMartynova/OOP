import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 *
 *
 */
public class TaskScheduler {
    ArrayList<Task> tasks;

    public TaskScheduler(){
        tasks = new ArrayList<Task>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public  void deleteTask(int id){
        tasks.removeIf(task -> task.getId() == id);
    }

    public void saveTaskToFile(String format) throws IOException {
        try {
            FileWriter writer = new FileWriter("tasks." + format);
            switch (format) {
                case "csv":
                    writer.write("ID, Data, Description, Deadline, Name, Priority\n");
                    for (Task task : tasks) {
                        writer.write(task.getId() + ",");
                        writer.write(task.getDate() + ",");
                        writer.write(task.getDescription() + ",");
                        writer.write(task.getDeadline() + ",");
                        writer.write(task.getName() + ",");
                        writer.write(task.getPriority() + "\n");

                    }
                    break;
                case "xml":
                    writer.write("<?xml version=\"1.0\" encoding=\\\"UTF-8\\\"?>\n");
                    writer.write("<tasks>\n");
                    for (Task task : tasks) {
                        writer.write("<task>\n");
                        writer.write("<id>" + task.getId() + "</id>\n");
                        writer.write("<create>" + task.getDate() + "</create>\n");
                        writer.write("<description>" + task.getDescription() + "</description>\n");
                        writer.write("<deadline>" + task.getDeadline() + "</deadline>\n");
                        writer.write("<name>" + task.getName() + "</name>\n");
                        writer.write("<priority>" + task.getPriority() + "</priority>\n");
                        writer.write("</task>\n");
                    }
                    writer.write("</tasks>\n");
                    break;
                default:
                    System.out.println("Недопустимый формат");
                    break;
            }
            writer.close();
        }
        catch (IOException e){
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    public void printTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Еще нет заполненных задач");
            return;
        }
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task task1, Task task2) {
                return task1.getDate().compareTo(task2.getDate());
            }
        });
        System.out.println("ID   | Date     | Description             | Deadline         | Name             | Priority");
        System.out.println("---- | ----------- | ----------------------- | ----------- | ------------------ | --------");
        for (Task task : tasks) {
            System.out.printf("%-4d | %-11s | %-23s | %-11s | %-18s | %s\n",
                    task.getId(),
                    new SimpleDateFormat("dd/MM/yyyy").format(task.getDate()),
                    task.getDescription(),
                    new SimpleDateFormat("dd/MM/yyyy").format(task.getDeadline()),
                    task.getName(),
                    task.getPriority());
        }
    }
    public void searchTasks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ключевое слово поиска:");
        String keyword = scanner.nextLine();
        System.out.println("ID   | Date     | Description             | Deadline         | Name             | Priority");
        System.out.println("---- | ----------- | ----------------------- | ----------- | ------------------ | --------");
        for (Task task : tasks) {
            if (task.getDescription().contains(keyword) || task.getName().contains(keyword)) {
                System.out.printf("%-4d | %-11s | %-23s | %-11s | %-18s | %s\n",
                        task.getId(),
                        new SimpleDateFormat("dd/MM/yyyy").format(task.getDate()),
                        task.getDescription(),
                        new SimpleDateFormat("dd/MM/yyyy").format(task.getDeadline()),
                        task.getName(),
                        task.getPriority());
            }

        }

    }
}
