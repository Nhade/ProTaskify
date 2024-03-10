import java.io.*;
import java.util.ArrayList;

public class FileManager {
    public void saveTasks(ArrayList<Task> tasks, String filename) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(tasks);
            objectOut.close();
            fileOut.close();
            System.out.println("Saved tasks to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked") //TODO: Check object type before cast, then remove this
    public ArrayList<Task> loadTasks(String filename) {
        ArrayList<Task> tasks = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            tasks = (ArrayList<Task>) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Loaded tasks from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}