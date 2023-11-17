package TatakaSibu;

public class Easy {
    //1.Write a function that takes an array of integers and returns the sum of all the integers.
    static int SumArray(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++ ){
            sum += a[i];
        }
        return sum;
    }
    //2.Write a function that takes an array of strings and returns the length of the shortest string in the array.
    static String shortestLength(String[] b){
        int shortest = 0;
        int z = b[0].length();
        for (int x = 0; x < b.length; x++){
            if (b[x].length() < z){
                z = x;
                shortest = z;
            }
        }
        return b[shortest];
    }
    //3.Write a function that takes a string as input and returns the string in reverse order.
    static String reverseOrder(String input){
        char[] x = new char[input.length()];
        int  reverse = 0;
        for(int i = input.length()-1; i >= 0; i--){
            x[reverse] = input.charAt(i);
            reverse++;
        }
        String newString = "";
        for (char z : x){
            newString += z;
        }
        return newString;
    }
    //4.Write a function that takes two arrays of integers and returns a new array that contains the elements of both arrays.
    static int[] twoIntegerArrays(int[] a, int[] b){
        int[] IntegerArrays = new int[a.length + b.length];
        int position = 0;
        for(int x : a){
            IntegerArrays[position] = x;
            position++;
        }
        for(int x : b){
            IntegerArrays[position] = x;
            position++;
        }
        return IntegerArrays;
    }
    //5.Write a function that takes an array of integers and returns the largest integer in the array.
    static int largestInteger(int[] numbers){
        int large = numbers[0];
        for (int y : numbers){
            if (y > large){
                large = y;
            }
        }
        return large;
    }
    //6.Write a function that takes an array of strings and a string as input, and returns true if the string is present in the array, and false otherwise.
    static boolean presentInAnArray(String[] x, String y){
        for(String z : x ){
            if(y == z){

                return true;
            }
        }
        return false;
    }
    //7.Write a function that takes a string as input and returns true if the string is a palindrome, and false otherwise.
    static boolean Palindrome(String x){
        char[] chars = new char[x.length()];
        int  reverse = 0;
        for(int i = x.length()-1; i >= 0; i--){
            chars[reverse] = x.charAt(i);
            reverse++;
        }
        String newString = "";
        for (char z : chars){
            newString += z;
        }
        if (x.toLowerCase().equals(newString.toLowerCase())){
            return true;
        }
        return false;
    }
    //8.Write a function that takes an array of integers and returns the index of the first occurrence of the smallest integer in the array.
    static int SmallestInt(int[] ints){
        int small = ints[0];
        for (int y : ints){
            if (y < small){
                small = y;
            }
        }
        return small;
    }
    //9.Write a function that takes an array of strings and returns the string with the most characters.
    static String mostCharacters(String[] args){
        int most = 0;
        int a = args[0].length();
        for (int x = 0; x < args.length; x++){
            if (args[x].length() > a){
                a = x;
                most = a;
            }
        }
        return args[most];
    }
    //10.Write a function that takes an array of integers and returns a new array that contains only the even integers in the original array.
    static int[] evenIntegers(int[] numbers){
        int evenCount = 0;
        for(int x : numbers){
            if(x % 2 == 0){
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int idx = 0;
        for(int y : numbers){
            if(y % 2 == 0){
                evenArray[idx] = y;
                idx++;
            }
        }
        return evenArray;
    }



    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        String[] b = { "Teboho", "Shoiab", "Xolile", "Alfred", "Thabang", "Lelo", "Tshiamo", "Maleshoane"};
        int[] d = {38,56,55};
        int[] e = {75,82,90};
        int[] f = {38,56,55,75,82,90};

        System.out.print("The total sum of Arrays is : ");
        System.out.println(SumArray(a));
        System.out.print("The Shortest string is : ");
        System.out.println(shortestLength(b));
        System.out.print("String in Reverse Order : ");
        System.out.println(reverseOrder("Alfred"));
        System.out.print("The combined Array is : ");
        for (int t : twoIntegerArrays(d,e)){
            System.out.print(t + " ");
        }
        System.out.println();
        System.out.print("The largest Value in a Array is : ");
        System.out.print(largestInteger(a));
        System.out.println();
        System.out.println("True or False!");
        System.out.println("Is String Available ? : " + " " + presentInAnArray(b,"Maleshoane"));
        System.out.println("True or False!");
        System.out.println("Is String Palindrome ? : " + " " + Palindrome("Mom"));
        System.out.print("The Smallest Value in a Array is : ");
        System.out.println(SmallestInt(a));
        System.out.print("The Most Characters in a string is : ");
        System.out.println(mostCharacters(b));
        System.out.print("The New Array that contains Even Integers only : ");
        for(int z : evenIntegers(f)){
            System.out.print(z + " ");
        }
    }
}
