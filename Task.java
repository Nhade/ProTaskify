import java.time.LocalDateTime;

enum Priority {
    URGENT, IMPORTANT, NORMAL
}

public class Task{
    String taskName;
    Priority priority;
    LocalDateTime deadline;
    boolean isDone = false;
}