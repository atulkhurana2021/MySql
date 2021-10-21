package Repository;

import Entities.Constraint;
import Entities.ConstraintType;
import Entities.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Repository {

    private List<Constraint> defaultConstraint = new ArrayList<>();
    private ConcurrentHashMap<String, Table> tables = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Map<String, String>> indexes = new ConcurrentHashMap<>();//TBD


    public Table getTable(String tableName) {
        return tables.get(tableName);
    }

    public void addTable(Table table) {
        tables.put(table.getName(), table);
    }

    public void deleteTable(String table) {
        tables.remove(table);
    }

    public List<Constraint> getDefaultConstraints() {

        return defaultConstraint;
    }


}
