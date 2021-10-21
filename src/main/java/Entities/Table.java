package Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {

    private String name;
    private Map<String, Column> columns = new HashMap<>();
    private List<Record> records;
    private List<Constraint> constraints;

    public Table(String name, Map<String, Column> columns, List<Constraint> constraints) {
        this.name = name;
        this.columns = columns;
        this.constraints = constraints;
        this.records = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Column> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, Column> columns) {
        this.columns = columns;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public List<Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", columns=" + columns +
                ", records=" + records +
                ", constraints=" + constraints +
                '}';
    }
}
