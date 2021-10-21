package Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateTableRequest {

    private String name;
    private List<Column> columns;
    private List<Constraint> constraints;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }
}
