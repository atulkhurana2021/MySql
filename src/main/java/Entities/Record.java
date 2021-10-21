package Entities;

import java.util.HashMap;
import java.util.Map;

public class Record {
    private Map<String,Object> recordValueMap;


    public Record() {
        this.recordValueMap = new HashMap<>();
    }

    public Map<String, Object> getRecordValueMap() {
        return recordValueMap;
    }

    public void setRecordValueMap(Map<String, Object> recordValueMap) {
        this.recordValueMap = recordValueMap;
    }

    @Override
    public String toString() {
        return "Record{" +
                "recordValueMap=" + recordValueMap +
                '}';
    }
}
