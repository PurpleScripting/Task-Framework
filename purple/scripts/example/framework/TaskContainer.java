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
public class TaskContainer implements Comparator<AbstractTask> {

    private List<AbstractTask> taskList = new ArrayList<AbstractTask>();


    public void submit(final AbstractTask... tasks) {
        for (AbstractTask abstractTask : tasks) {
            if (!taskList.contains(abstractTask)) {
                taskList.add(abstractTask);
            }
        }
        Collections.sort(taskList, this);
    }

    public void remove(Class<AbstractTask> w) {
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
    public int compare(AbstractTask o1, AbstractTask o2) {
        return o2.priority() - o1.priority();
    }

    public AbstractTask getValidTask() {
        for (AbstractTask task : taskList) {
            if (task.validate()) {
                return task;
            }
        }
        return null;
    }

}
