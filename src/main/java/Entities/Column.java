package Entities;

public class Column {
    private ColumnType columnType;
    private String name;
    private Long length;

    public ColumnType getColumnType() {
        return columnType;
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

    @Override
    public String toString() {
        return "Column{" +
                "columnType=" + columnType +
                ", name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
