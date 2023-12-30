package domain.dao;

import domain.TaskList;

import java.util.Collection;


public interface ITaskListDAO {

    public boolean addTask (TaskList taskList);

    public void removeTask (Long ID);

    public void changeTask (TaskList taskList);

    public void consultTask (Long ID);

    public void changeStatus (Long ID, String status);

    public Collection<TaskList> listTasks ();

}
