package domain.dao;

import domain.TaskList;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TaskListMapDAO implements ITaskListDAO{

    private Map<Long, TaskList> list;

    public TaskListMapDAO () {
        this.list = new HashMap<>();
    }

    @Override
    public boolean addTask (TaskList taskList) {
        if (list.containsKey(taskList.getID())){
            return false;
        } else {
            taskList.setStatus("pendente");
            list.put(taskList.getID(), taskList);
        }

        return true;
    }

    @Override
    public void changeTask(TaskList taskList) {
        TaskList registeredList = this.list.get(taskList.getID());

        if (registeredList != null) {
            registeredList.setDescription(taskList.getDescription());
            registeredList.setStatus(taskList.getStatus());
        }
    }

    @Override
    public void consultTask(Long ID) {

    }

    @Override
    public void removeTask(Long ID) {
        TaskList registeredList = this.list.get(ID);

        if (registeredList != null) {
            this.list.remove(registeredList.getID(), registeredList);
        }
    }

    @Override
    public void changeStatus (Long ID, String status){

        TaskList registeredList = this.list.get(ID);

        if (registeredList != null ){
            registeredList.setStatus(status);
        }
    }

    @Override
    public Collection<TaskList> listTasks() {
        return this.list.values();
    }

}
