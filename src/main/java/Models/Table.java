package Models;

import Entities.Column;
import Entities.Constraint;
import Entities.Record;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {

    private String name;
    private Map<String, Entities.Column> columns = new HashMap<>();
    private List<Record> records;
    private List<Entities.Constraint> constraints;

    public Table(String name, Map<String, Entities.Column> columns, List<Entities.Constraint> constraints) {
        this.name = name;
        this.columns = columns;
        this.constraints = constraints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Entities.Column> getColumns() {
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

    public List<Entities.Constraint> getConstraints() {
        return constraints;
    }

    public void setConstraints(List<Constraint> constraints) {
        this.constraints = constraints;
    }
}
