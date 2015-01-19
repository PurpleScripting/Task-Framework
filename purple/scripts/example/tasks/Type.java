package purple.scripts.example.tasks;

import org.tbot.methods.Keyboard;
import purple.scripts.example.framework.AbstractTask;

/**
 * Created with IntelliJ IDEA.
 * User: Purple
 * Date: 1/19/15
 * Time: 1:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Type extends AbstractTask {

    @Override
    public int priority() {
        return 0;
    }

    @Override
    public boolean validate() {
        return true; //Whatever condition
    }

    @Override
    public void execute() {
        Keyboard.sendText("Activated task!", true);
    }
}
