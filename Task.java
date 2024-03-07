import java.time.LocalDateTime;

enum Priority {
    URGENT, IMPORTANT, NORMAL
}

public class Task{
    String taskName;
    Priority priority;
    LocalDateTime deadline;
    boolean isDone;

    public Task(String name, Priority priority, LocalDateTime time){
        this.taskName = name;
        this.priority = priority;
        this.deadline = time;
        this.isDone = false;
    }
}