import domain.TaskList;
import domain.dao.TaskListMapDAO;

public class Main {
    public static void main(String[] args) {

        TaskList taskList = new TaskList(1L, "Terminar o curso de java", "qualquer coisa");
        TaskList taskList2 = new TaskList(2L, "Terminar o curso de java", "qualquer coisa");
        TaskList taskListModifi = new TaskList(1L, "O curso está em desenvolvimento", "progresso");

        TaskListMapDAO taskListMapDAO = new TaskListMapDAO();
        taskListMapDAO.addTask(taskList);
        taskListMapDAO.addTask(taskList2);
        taskListMapDAO.changeStatus(1L, "concluindo");
        taskListMapDAO.changeTask(taskListModifi);
        taskListMapDAO.removeTask(2L);
        System.out.println(taskListMapDAO.listTasks());

    }
}