package Utils;

import Entities.*;

import Models.Column;
import Models.CreateTableRequest;
import Repository.Repository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {


    private Repository repository;

    public Utils(Repository repository) {
        this.repository = repository;
    }

    public Table getTableObject(CreateTableRequest tableRequest) throws Exception {
        List<Column> columnList = tableRequest.getColumns();

        Map<String, Entities.Column> tableColumn = new HashMap<>();
        for (Column column : columnList) {
            ConstraintHelper.apply(repository.getDefaultConstraints(), column);
            Entities.Column column1 = new Entities.Column();
            column1.setName(column.getName());
            column1.setLength(column.getLength());
            column1.setColumnType(ColumnType.valueOf(column.getColumnType().name()));
            tableColumn.put(column1.getName(), column1);


            // CUSTOM CONSTRAINTS TBD
        }
        List<Constraint> constraints = new ArrayList<>();

        for (Models.Constraint constraint : tableRequest.getConstraints()) {
            Constraint constraint1 = new Constraint();
            constraint1.setHigherThreshold(constraint.getHigherThreshold());
            constraint1.setLowerThreshold(constraint.getLowerThreshold());
            constraint1.setConstraintType(ConstraintType.valueOf(constraint.getConstraintType().name()));
            constraints.add(constraint1);

        }
        return new Table(tableRequest.getName(), tableColumn, constraints);
    }

    public Record insertRecord(HashMap<String, Object> values, List<Constraint> customConstaints, Map<String, Entities.Column> columnMap) throws Exception {
        Entities.Record record = new Entities.Record();
        for (Map.Entry<String, Object> entry : values.entrySet()) {
            Long maxLength = columnMap.get(entry.getKey()).getLength();
            if (maxLength != null) {
                if (entry.getValue().toString().length() > maxLength)
                    throw new Exception(" Invalid length");
            }

            ConstraintHelper.apply(repository.getDefaultConstraints(), entry.getValue(), columnMap.get(entry.getKey()));

            ConstraintHelper.apply(customConstaints, entry.getValue(), columnMap.get(entry.getKey()));

            record.getRecordValueMap().put(entry.getKey(), entry.getValue());
        }
        return record;
    }
}
