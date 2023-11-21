package Hard;

import java.util.*;

public class Hard {
    //1.Write a function that takes two arrays of integers and returns a new array that contains the elements that are unique to both arrays.

        public static int[] uniqueElements(int[] x, int[] y) {
            Set<Integer> setX = new HashSet<>();
            Set<Integer> setY = new HashSet<>();
            List<Integer> result = new ArrayList<>();

            for (int value : x) {
                setX.add(value);
            }

            for (int value : y) {
                setY.add(value);
            }

            for (int value : setX) {
                if (!setY.contains(value)) {
                    result.add(value);
                }
            }

            for (int value : setY) {
                if (!setX.contains(value) && !result.contains(value)) {
                    result.add(value);
                }
            }

            int[] resultArray = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
            }

            return resultArray;
        }


    //2.Write a function that takes an array of strings and returns a new array that contains the strings in alphabetical order.
    static String[] names(String[] words){
        String[] sorted = Arrays.copyOf(words, words.length);
        Arrays.sort(sorted);
        return sorted;
    }
    //3.Write a function that takes a string as input and returns the longest palindrome that can be formed from the characters in the string.
     static String LargestPalidrome(String word ){
    StringBuilder c = StringBuilder;
    
     return null;

     }


    //4.Write a function that takes an array of integers and a target integer as input, and returns true if there are two integers in the array that add up to the target integer, and false otherwise.
    //5.Write a function that takes an array of strings and a character as input, and returns a new array that contains only the strings that contain the character.
    // 6.Write a function that takes an array of integers and returns the mode (most frequently occurring integer) of the integers in the array.
    //7.Write a function that takes a string as input and returns the number of palindromic substrings in the string.
    // 8.Write a function that takes an array of integers and returns the kth smallest integer in the array.
    // 9.Write a function that takes an array of strings and returns a new array that contains the strings sorted by length (shortest to longest).
    // 10.Write a function that takes two arrays of integers and returns a new array that contains the elements that appear in both arrays in the order that they appear in the first array. If there are duplicates, they should only appear once in the output.

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        int[] resultArray = uniqueElements(array1, array2);

        System.out.print("Unique elements: ");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        String[] word = {"Phindiwe","Winnie","Zizo","Mama","Xolile","Shoiab","Alfred","Thabang"};
        System.out.println("Sorted Array : " + Arrays.toString(names(word)));

        System.out.println();

    }
}
