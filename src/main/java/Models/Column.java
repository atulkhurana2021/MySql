package Models;

public class Column {
    private ColumnType columnType;
    private String name;
    private Long length;

    public ColumnType getColumnType() {
        return columnType;
    }

    public Column(ColumnType columnType, String name, Long length) {
        this.columnType = columnType;
        this.name = name;
        this.length = length;
    }

    public void setColumnType(ColumnType columnType) {
        this.columnType = columnType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }
}
