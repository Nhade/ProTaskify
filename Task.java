import java.time.LocalDateTime;

enum Priority {
    URGENT, IMPORTANT, NORMAL
}

public class Task{
    Priority priority;
    LocalDateTime deadline;
    boolean isDone;
}