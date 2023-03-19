import java.util.Date;

/**
 * body task
 */
public class Task {
    private int id;
    private Date date;
    public String description;
    private Date deadline;
    private String name;
    private Priority priority;

    public Task(int id, Date date, String description, Date deadline, String name, Priority priority) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.deadline = deadline;
        this.name = name;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
