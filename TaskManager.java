import java.time.LocalDateTime;
import java.util.ArrayList;

public class TaskManager {
    public TaskManager() {
        FileManager FileIO = new FileManager();
        ArrayList<Task> taskList = FileIO.loadTasks("testSave.ser");
    }

    public static void addTask(ArrayList<Task> taskList, String name, Priority priority, LocalDateTime time) {
        Task addedTask = new Task(name, priority, time);
        taskList.add(addedTask);
    }

    public static void deleteTask(ArrayList<Task> taskList, String deletedName) {
        for (Task task : taskList) {
            if (task.taskName.equals(deletedName)) {
                taskList.remove(task);
            }
        }
    }

    public static void updateTask(ArrayList<Task> taskList, String targetName, Priority priority, LocalDateTime time) {
        for (Task task : taskList) {
            if (task.taskName.equals(targetName)) {
                task.priority = priority;
                task.deadline = time;
            }
        }
    }

    public static void filterTask() {

    }

    public static void remindTask() {

    }

    public static void markTask(ArrayList<Task> taskList,String targetName) {
        for (Task task : taskList) {
            if (task.taskName.equals(targetName)) {
                task.isDone = true;
            }
        }
    }

}
