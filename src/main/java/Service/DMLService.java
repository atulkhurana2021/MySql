package Service;

import Entities.Record;
import Entities.Table;
import Models.FetchRecordRequest;
import Models.Filter;
import Models.InsertRecordRequest;
import Repository.Repository;
import Utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DMLService {

    private Repository repository;
    private Utils utils;

    public DMLService(Repository repository) {

        this.repository = repository;
        this.utils = new Utils(repository);
    }

    public void insertRecord(InsertRecordRequest insertRecordRequest) throws Exception {
        if (repository.getTable(insertRecordRequest.getTableName()) == null)
            throw new Exception("table does not exists");
        Table table = repository.getTable(insertRecordRequest.getTableName());
        HashMap<String, Object> values = insertRecordRequest.getValues();
        List<Entities.Record> records = table.getRecords();

        records.add(utils.insertRecord(values, table.getConstraints(), table.getColumns()));
       // System.out.println(table);
        repository.addTable(table);


    }

    public List<Map<String, Object>> fetchRecord(FetchRecordRequest fetchRecordRequest) throws Exception {
        if (repository.getTable(fetchRecordRequest.getName()) == null)
            throw new Exception("table does not exists");
        Table table = repository.getTable(fetchRecordRequest.getName());
        List<Record> records = table.getRecords();
        List<Map<String, Object>> output = new ArrayList<>();
        for (Record record : records) {
            boolean filterFlag = true;

            for (Filter filter : fetchRecordRequest.getFilters()) {
                String col = filter.getColumnName();
                if (record.getRecordValueMap().get(col) != filter.getFilterValue())
                    filterFlag = false;
            }
            if (filterFlag)
                output.add(record.getRecordValueMap());
        }
        return output;
    }
}
