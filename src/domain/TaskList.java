package domain;

public class TaskList {

    private Long ID;
    private String description;
    private String status = "pendent";

    public TaskList(Long ID, String description, String status) {
        this.ID = ID;
        this.description = description;
        this.status = status;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "ID=" + ID +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
