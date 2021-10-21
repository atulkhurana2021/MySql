package Models;

public class DeleteTableRequest {
    private String name;

    public String getName() {
        return name;
    }

    public DeleteTableRequest(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
