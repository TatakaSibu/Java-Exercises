package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Medium {
    //1.Write a function that takes two arrays of integers and returns a new array that contains the elements that are common to both arrays.
    static int[] commonElements(int[]a, int[] b){
        int[] common = new int[a.length + b.length];
        int count = 0;
        for(int x : a){
            if(checkElements(b,x)){
                common[count] = x;
                count++;
            }
        }
        int[] commonint = new int[count];
        for (int i = 0; i < commonint.length; i++){
            commonint[i] = common[i];
        }
        return commonint;
    }
    static boolean checkElements(int[] b, int x){
        for(int a : b){
            if(x == a){
                return true;
            }
        }
        return false;
    }
    //2.Write a function that takes an array of strings and returns the average length of the strings in the array.
    static double AverageLength(String[] names){
        int len = 0;
        for(String n : names){
            len += n.length();
        }
       return (double)len/names.length;
    }
    //3.Write a function that takes a string as input and returns the number of words in the string.
    static int NumberOfWords(String words){
        return words.length();
    }
    //4.Write a function that takes an array of integers and returns the index of the first occurrence of the largest integer in the array.
    static int largestNum(int[] num){
        int large = num[0];
        for(int a : num){
          if(large <= a){
              large = a;
          }
        }
        return large;
    }
    //5.Write a function that takes an array of strings and returns a new array that contains only the strings that start with a vowel.
    static String[] names(String[] words){
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        List<String> listToStoreStrings = new ArrayList<>();

        for(String s: words)
        {
            for(int i = 0; i < vowels.length; i++)
                if(s.toLowerCase().charAt(0) == vowels[i])
                    listToStoreStrings.add(s);
        }

        String[] stringsThatStartWithVowel = new String[listToStoreStrings.size()];

        for(int i = 0; i < stringsThatStartWithVowel.length; i++)
            stringsThatStartWithVowel[i] = listToStoreStrings.get(i);


      return stringsThatStartWithVowel;
    }
    //6.Write a function that takes an array of integers and returns a new array that contains the integers in sorted order.
    static int[] Integers(int[] nums){
        int[] sorted = Arrays.copyOf(nums,nums.length);
        Arrays.sort(sorted);
        return sorted;
    }
    //7.Write a function that takes a string as input and returns the number of vowels in the string.
    static int vowels(String word){
        int count = 0;
        String input = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    //8.Write a function that takes an array of integers and returns the median of the integers in the array.
    static double Median(int[] num){
        Arrays.sort(num);
       int len = num.length;
       if(len != 2){
            return num[len / 2];
       }
       else{
           int part1 = num[(len / 2)-1];
           int part2 = num[len / 2];
           return (double) (part1 + part2)/2;
       }
    }
    //9.Write a function that takes an array of strings and returns a new array that contains the strings in reverse order.
    static String[] namesInReverse(String[] last){
        String [] a = new String[last.length];
        int reverse = 0;
        for (int x = last.length-1; x >= 0; x--){
            a[reverse] = last[x];
            reverse++;
        }
        String newString = "";
        for(String b : a){
            newString += b;
        }
        return a;
    }
    //10.Write a function that takes an array of integers and returns the product of all the integers in the array.
    static int productOfNumbers(int[] numbers){
        int product = 1;
        for(int t : numbers){
            product *= t;
        }
        return product;
    }

    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6,7,8,9,10};
        int [] y = {2,4,6,8,10};
        final int[] z = commonElements(x, y);

        System.out.println();
        System.out.println("Array that contains the elements that are common to both arrays : " + Arrays.toString(z));

        System.out.println();
        String[] words = {"Lolo","Tshepo","Alfred","Teboho","Xolile","Thabang","Dutchess"};
        System.out.println("The average length of the strings in the array : " + AverageLength(words));

        System.out.println();
        String sentence = "Today is a Beautiful friday";
        System.out.println("The number of words in the string : " + NumberOfWords(sentence));

        System.out.println();
        int[] c = {1,20,100,150,600,2,300,500};
        System.out.println("The index of the first occurrence of the largest integer in the array : " + largestNum(c));

        System.out.println();
        String[] s = {"Lolo","Tshepo","Alfred","Teboho","Xolile","Thabang","Dutchess", "Anna"};
        for(String t: names(s)) {
            System.out.println("Array that contains only the strings that start with a vowel : " + t + " ");
        }

        System.out.println();
        int[] w = {1,20,100,150,600,2,300,500};
        System.out.println("Array that contains the integers in sorted order : " + Arrays.toString(Integers(w)));

        System.out.println();
        String o = "Maleshoane";
        System.out.println("The Number of Vowels is : " + vowels(o));

        System.out.println();
        int[] r = {1,20,100,150,600,2,300,500};
        System.out.println("The Median is : " + Median(r));

        System.out.println();
        String[] q = {"Lolo","Tshepo","Alfred","Teboho","Xolile","Thabang","Dutchess", "Anna"};
       for (String az : namesInReverse(q)){
           System.out.print(az + " ");
       }

        System.out.println();
        int[] d = {1,20,10,15,60,2,3,5};
        System.out.println("The Product is : " + productOfNumbers(d));

    }
}
