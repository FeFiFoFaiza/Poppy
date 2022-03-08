/**
im tired | Faiza, John, Josh
apcs pd8
hw71- Whut Dis
time spent: .3 hr

DISCOS

QCC
 - is it apart of divide and conquer method like mergesort
 - q u i c k s o r t ?

What it do
 - It puts all the stuff less than specified input to the left and those 
   values greater than it to the right
Big 0
 - O(n)

**/

import java.util.Arrays;

public class Mysterion{

  public static void painSplit(int[] arr, int a, int b, int c){
    int v = arr[c];
    swap(arr, c, b);
    int s = a;
    for(int i = a; i<b; i++){
      if (arr[i] < v){
        swap(arr, s, i);
        s++;
      }
    }
    swap(arr, b, s);
  }

  public static void swap (int[] arr, int a, int b){
    int old = arr[a];
    arr[a] = arr[b];
    arr[b] = old;
  }

  public static void main(String[] args){
    int[] handout = {7, 1, 5, 12, 3};
    painSplit(handout, 0, 4, 2);
    System.out.println(Arrays.toString(handout));

    int[] poo = {7, 1, 5, 1, 12, 3, 8};
    painSplit(poo, 0, 4, 2);
    System.out.println(Arrays.toString(poo));
 }
}
