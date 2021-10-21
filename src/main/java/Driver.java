import Models.*;
import Repository.Repository;
import Service.DDLService;
import Service.DMLService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Driver {

    public static void main(String[] args) throws Exception {
         Repository repository = new Repository();
        DDLService ddlService = new DDLService(repository);
        DMLService dmlService = new DMLService(repository);
        CreateTableRequest createTableRequest = new CreateTableRequest();
        createTableRequest.setName("ABC");
        List<Column> columns = new ArrayList<>();
        Constraint constraint = new Constraint();
        constraint.setConstraintType(ConstraintType.VALUE);
        constraint.setLowerThreshold(-1024);
        constraint.setHigherThreshold(1233);
        List<Constraint> cons= new ArrayList<>();
        cons.add(constraint);
        columns.add(new Column(ColumnType.VARCHAR, "AWE", 20l));
        columns.add(new Column(ColumnType.INT, "AWB", null));
        createTableRequest.setColumns(columns);
        createTableRequest.setConstraints(cons);
        ddlService.createTable(createTableRequest);

       ddlService.deleteTable(new DeleteTableRequest("ABC"));


        ddlService.createTable(createTableRequest);
        //System.out.println(repository.getTable("ABC"));

        InsertRecordRequest insertRecordRequest = new InsertRecordRequest();
        insertRecordRequest.setTableName("ABC");
        HashMap<String,Object> values = new HashMap<>();
        values.put("AWE", "ddvfv");
        values.put("AWB", 122);
        values.put("AWB", 122343);
        insertRecordRequest.setValues(values);

        System.out.println(repository.getTable("ABC"));

       dmlService.insertRecord(insertRecordRequest);

        System.out.println(dmlService.fetchRecord(new FetchRecordRequest("ABC",new ArrayList<Filter>())));



    }
}
