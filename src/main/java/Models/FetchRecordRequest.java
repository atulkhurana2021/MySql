package Models;

import java.util.List;

public class FetchRecordRequest {

    private String name;
    private List<Filter> filters;

    public FetchRecordRequest(String name, List<Filter> filters) {
        this.name = name;
        this.filters = filters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}
