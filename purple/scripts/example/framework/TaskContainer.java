package purple.scripts.example.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Purple
 * Date: 1/19/15
 * Time: 1:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class TaskContainer implements Comparator<Task> {

    private List<Task> taskList = new ArrayList<Task>();

    public void submit(final Task... tasks) {
        for (Task w : tasks) {
            if (!taskList.contains(w)) {
                taskList.add(w);
            }
        }
        Collections.sort(taskList, this);
    }

    public void remove(Task w) {
        if (taskList.contains(w)) {
            taskList.remove(w);
        }
    }

    public void clearTasks() {
        taskList.clear();
    }

    public int getTaskCount() {
        return taskList.size();
    }

    @Override
    public int compare(Task o1, Task o2) {
        return o2.priority() - o1.priority();
    }

    public Task getValidTask() {
        if(taskList.size() > 0) {
            for (Task w : taskList) {
                if (w.validate()) {
                    return w;
                }
            }
        }
        return null;
    }

}
