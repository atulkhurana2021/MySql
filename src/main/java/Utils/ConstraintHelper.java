package Utils;


import Entities.ColumnType;
import Entities.Constraint;
import Entities.ConstraintType;
import Models.Column;

import java.util.List;

public class ConstraintHelper {

    public static void apply(List<Constraint> constraints, Column recordValue) throws Exception {
        if(constraints!= null) {
            for (Constraint constraint : constraints ) {
                if( recordValue.getColumnType().equals(ColumnType.VARCHAR) && constraint.getConstraintType().equals(ConstraintType.LENGTH)) {
                    if((Long)constraint.getHigherThreshold() < recordValue.getLength())
                        throw new Exception("Invalid Column input");
                }
            }

        }

    }

    public static void apply(List<Constraint> constraints, Object recordValue, Entities.Column columnName) throws Exception {

        if(constraints!= null) {
            for (Constraint constraint : constraints ) {
                if( columnName.getColumnType().equals(ColumnType.INT) && constraint.getConstraintType().equals(ConstraintType.VALUE)) {
                    int recordval =(int)recordValue;
                    if(recordval < (int)constraint.getLowerThreshold() || recordval > (int)constraint.getHigherThreshold()) {
                        throw new Exception("Invalid Column value "+recordValue);
                    }
                }
            }

        }

    }
}
