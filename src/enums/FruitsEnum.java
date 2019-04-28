package enums;

import java.lang.*;
import java.util.*;

import utility.EnumCodeInterface;

public enum FruitsEnum implements EnumCodeInterface {
  APPLE(1, "APPLE"),
  ORANGE(2, "ORANGE"),
  AVOCADO(3, "AVOCADO"),
  RASPBERRY(4, "RASPBERRY");

  private FruitsEnum(Integer code, String value) {
    this.code = code;
    this.value = value;
  }

  public Integer getCode() {
    return code;
  }

  @Override
  public String toString() {
    return value;
  }

  private Integer code;
  private String value;
}

