package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Console console = System.console();

        List<String> todos = new ArrayList<>();

        String input = "";

        while (!input.equals("quit")) {
            input = console.readLine("Enter a string: ");
            if (!input.equals("quit")) {
                todos.add(input);
            }
        }

        for (String todo: todos) {
            System.out.println("To Do task: " + todo);
        }
    }
}
