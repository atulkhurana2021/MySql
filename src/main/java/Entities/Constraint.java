package Entities;

public class Constraint {
  private ConstraintType constraintType;
  private Object higherThreshold;
  private Object lowerThreshold;

  public ConstraintType getConstraintType() {
    return constraintType;
  }

  public void setConstraintType(ConstraintType constraintType) {
    this.constraintType = constraintType;
  }

  public Object getHigherThreshold() {
    return higherThreshold;
  }

  public void setHigherThreshold(Object higherThreshold) {
    this.higherThreshold = higherThreshold;
  }

  public Object getLowerThreshold() {
    return lowerThreshold;
  }

  public void setLowerThreshold(Object lowerThreshold) {
    this.lowerThreshold = lowerThreshold;
  }
}
