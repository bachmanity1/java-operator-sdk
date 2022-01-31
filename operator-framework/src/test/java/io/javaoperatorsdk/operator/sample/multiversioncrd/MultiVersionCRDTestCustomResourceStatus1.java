package io.javaoperatorsdk.operator.sample.multiversioncrd;

import java.util.ArrayList;
import java.util.List;

public class MultiVersionCRDTestCustomResourceStatus1 {

  private int value1;

  private int value2;

  private List<String> reconciledBy = new ArrayList<>();

  public int getValue1() {
    return value1;
  }

  public MultiVersionCRDTestCustomResourceStatus1 setValue1(int value1) {
    this.value1 = value1;
    return this;
  }

  public int getValue2() {
    return value2;
  }

  public MultiVersionCRDTestCustomResourceStatus1 setValue2(int value2) {
    this.value2 = value2;
    return this;
  }

  public List<String> getReconciledBy() {
    return reconciledBy;
  }

  public MultiVersionCRDTestCustomResourceStatus1 setReconciledBy(List<String> reconciledBy) {
    this.reconciledBy = reconciledBy;
    return this;
  }
}
