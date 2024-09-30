//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Megan Lubbers: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    int[] nums = {5, 9, 3, 12, 7, 3, 11, 5};

    System.out.println("Array In Order");
    int count=0;
  while (count < nums.length) {
  int x = nums[count];
  count++;
      System.out.println(x);
    }
    System.out.println("Array In Reverse");
    for (int i=nums.length-1; i>=0; i--) {
      int x = nums[i];
          System.out.println(x);
        }
        System.out.println("Increment Test = " + lab.increment(1));
          System.out.println("First Array Value = " + nums[0]);
      System.out.println("Last Array Value = " +nums[nums.length-1]);
      System.out.println("Max = " + lab.max(1,6));
      System.out.println("Min = " + lab.min(2,9));
      System.out.println("Array Sum = " + lab.sum(nums));
      System.out.println("Array Average = " + lab.average(nums));
      System.out.println("Array Max = " + lab.arrayMax(nums));
      System.out.println("Array Min = " + lab.arrayMin(nums));


  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
public int max(int a, int b){
  if (a>b)
  return a;
  else return b;
}
public int min(int a, int b){
  if (a>b)
  return b;
  else return a;
}
public int sum(int[] nums){
    int sum = 0; 
    for (int num : nums) {
        sum += num;
    }

    return sum; 
}
public double average(int[] nums){
  int sumTotal = sum(nums);
    double average = (double)sumTotal/nums.length;

    return average;
  }
  public int arrayMax(int[] nums){
    int arrayMax = nums[0];
    for (int i=1; i < nums.length; i++){
      arrayMax = max(arrayMax, nums[i]);
    }
    return arrayMax;
  }
  public int arrayMin(int[] nums){
    int arrayMin = nums[0];
    for (int i=1; i < nums.length; i++){
      arrayMin = min(arrayMin, nums[i]);
    }
    return arrayMin;
  }
}
