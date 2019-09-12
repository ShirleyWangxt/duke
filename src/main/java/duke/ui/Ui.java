package duke.ui;

import duke.task.Task;
import duke.task.TaskList;
import static duke.ui.Message.WELCOME_MESSAGE;
import static duke.ui.Message.LOGO;
import static duke.ui.Message.taskCountMsg;

import java.util.Scanner;

/**
 * Encapsulates a Ui object to handle user interaction.
 */
public class Ui {

    private Scanner sc;

    public Ui() {
        sc = new Scanner(System.in);
    }

    public String showWelcome() {
        StringBuilder sb = new StringBuilder();
        sb.append(LOGO);
        sb.append(WELCOME_MESSAGE);
        return sb.toString();
    }

    public String showLoadingError() {
        return "File cannot be loaded. A new task list is created.\n";
    }

    public String showTask(Task task, TaskList tasks, String message) {
        StringBuilder sb = new StringBuilder(message);
        sb.append(task);
        sb.append(taskCountMsg(tasks));
        return sb.toString();
    }

    public String readCommand() {
        return sc.nextLine();
    }
}
