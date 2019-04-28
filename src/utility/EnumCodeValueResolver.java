package utility;

import java.lang.*;
import java.util.*;

import utility.EnumCodeInterface;

public class EnumCodeValueResolver {
  public static <E extends Enum<E> & EnumCodeInterface> E resolve(Class<E> enumType, Integer code) {
    return Arrays.stream(enumType.getEnumConstants())
      .filter((current) -> { return current.getCode().equals(code); })
      .findFirst()
      .orElseThrow(() -> new IllegalArgumentException());
  }
}

