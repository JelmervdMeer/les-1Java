package nl.jelmervdmeer;


import java.util.HashMap;


public class Main { //main Class

  public static void main(String[] args) { //main method
    int[] numbers = {42, 67, 35, 89, 24, 76, 58, 93, 7, 30, 83, 46, 13, 25, 98, 53, 17, 79, 57, 8};
    int even = 0;
    int odd = 0;

    HashMap<String, Integer> evenOrOdd = new HashMap<>();

    for (int i : numbers) {                  //for every number in numbers
      if (i % 2 == 0) {                    //if the number is even
        even++;
      } else {                             //if the number is odd
        odd++;
      }
    }
    System.out.println("There are " + even + " even numbers in the array");
    System.out.println("There are " + odd + " odd numbers in the array");

    evenOrOdd.put("even", even);
    evenOrOdd.put("odd", odd);

    System.out.println(evenOrOdd);
  }
}
