package purple.scripts.example;

import org.tbot.internal.AbstractScript;
import org.tbot.internal.Manifest;
import org.tbot.internal.ScriptCategory;
import org.tbot.methods.walking.Walking;
import purple.scripts.example.framework.Task;
import purple.scripts.example.framework.TaskContainer;
import purple.scripts.example.tasks.Type;

/**
 * Created with IntelliJ IDEA.
 * User: Purple
 * Date: 1/19/15
 * Time: 1:27 AM
 * To change this template use File | Settings | File Templates.
 */
@Manifest(authors = "Purple",
        name = "Task Framework",
        version = 1.01,
        description = "...",
        category = ScriptCategory.OTHER)
public class Example extends AbstractScript {

    private static TaskContainer taskContainer;

    public Example() {
        taskContainer = new TaskContainer();
    }

    public static TaskContainer getTaskContainer() {
        return taskContainer;
    }

    @Override
    public boolean onStart() {
        return true;
    }

    @Override
    public int loop() {
        Task task = getTaskContainer().getValidTask();
        if(task != null) {
            task.execute();
        }
        return 50;
    }

}
