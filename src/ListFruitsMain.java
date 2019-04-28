import java.lang.*;
import java.util.*;

import utility.EnumCodeValueResolver;
import enums.FruitsEnum;

public class ListFruitsMain {
  
  public ListFruitsMain() {}
  
  public static void main(String[] args) {
    
    Integer code = FruitsEnum.RASPBERRY.getCode();
    FruitsEnum fruits = EnumCodeValueResolver.resolve(FruitsEnum.class, code);
    System.out.println(fruits);
    
  }
}
