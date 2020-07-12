package com.workbook;

import java.util.ArrayList;

public class LowerBoundedWildcard_22_1_7 {

   static Double add(ArrayList <? extends Number> num ) {
      double sum = 1.1;
      for(Number n:num) {//n이 위에 num조건에 맞는 경우 for구문 실행??
         sum += n.doubleValue();
      }
      return sum;
   }
   public static void main(String[] args) {
      ArrayList<Double> a1 = new ArrayList<Double>();
      a1.add(10.0);
      a1.add(20.0);
      System.out.println(add(a1));

   }

}