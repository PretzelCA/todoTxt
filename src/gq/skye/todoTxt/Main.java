package gq.skye.todoTxt;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * Main class.
 */

public class Main {

    /**
     * Default location of the todo.txt file.
     */

    static String todoLocation = System.getProperty("user.home") + "/todo.txt";

    /**
     * Storage for todo objects
     */

    static ArrayList<String> todoObjects = new ArrayList<>();

    /**
     * Main Class
     * @param args (Optional) Location of todo.txt file. Must be exact filepath
     */

    public static void main(String[] args) throws IOException {
        if (!(args.length == 0)) {
            todoLocation = args[0];
        }
        loadTodo();
        displayTodo();
    }

    /**
     * Load the todo object from a file.
     */

    static void loadTodo() throws IOException {
        try {
            BufferedReader inFile = new BufferedReader(new FileReader(todoLocation));
            String str;
            while ((str = inFile.readLine()) != null) {
                todoObjects.add(str);
            }
        } catch (FileNotFoundException e) {
            PrintWriter writer = new PrintWriter(todoLocation, StandardCharsets.UTF_8);
            writer.close();
            loadTodo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Save the todo object.
     * @return Status of save.
     */

    static int saveTodo() {
        return 1;
    }

    /**
     * Display todo file
     */

    static void displayTodo() {
        for (int i = 0; i < todoObjects.size(); i++) {
            System.out.println((i + 1) + " - " + todoObjects.get(i));
        }
    }
}
