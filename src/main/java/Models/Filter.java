package Models;

public class Filter {
    private FilterType filterType;
    private Object filterValue;
    private String columnName;

    public FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(FilterType filterType) {
        this.filterType = filterType;
    }

    public Object getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(Object filterValue) {
        this.filterValue = filterValue;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }
}
