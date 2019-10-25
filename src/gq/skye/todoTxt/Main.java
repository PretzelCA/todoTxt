package gq.skye.todoTxt;

import java.util.ArrayList;

/**
 * Main class.
 */

public class Main {

    /**
     * Default location of the todo.txt file.
     */

    static String todoLocation;

    /**
     * Main Class
     * @param args (Optional) Location of todo.txt file.
     */

    public static void main(String[] args) {
        if (!(args[0].isEmpty())) {
            todoLocation = args[0];
        }
        loadTodo();
    }

    /**
     * Load the todo object from a file.
     * @return Todo object.
     */

    static ArrayList loadTodo() {

    }

    /**
     * Save the todo object.
     * @return Status of save.
     */

    static int saveTodo() {

    }

    /**
     * Display todo file
     */

    static void displayTodo() {

    }
}
