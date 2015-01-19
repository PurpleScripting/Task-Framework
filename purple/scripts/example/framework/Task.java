package purple.scripts.example.framework;

/**
 * Created with IntelliJ IDEA.
 * User: Purple
 * Date: 1/19/15
 * Time: 1:28 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Task {

    abstract int priority();

    abstract boolean validate();

    abstract void execute();

}
