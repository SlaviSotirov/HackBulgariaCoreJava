package com.hackbulgaria.corejava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problems2Impl implements Problems2 {
    
    public int factorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }
    
    public boolean isIntPalindrome(long i){
        String temp1 = Long.toString(i);
        String temp2 = new StringBuilder(temp1).reverse().toString();
        return temp1.equals(temp2);
    }

    @Override
    public boolean isOdd(int number) {
        return (number % 2 != 0);
    }

    @Override
    public boolean isPrime(int number) {
        for(int i = 2; i < number; i++ ){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public int min(int... array) {
        int minimumElement = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                minimumElement = array[i];
            }else if(minimumElement > array[i]){
                minimumElement = array[i];
            }
        }
        return minimumElement;
    }

    @Override
    public int kthMin(int k, int[] array) {
        //bubble sort
        for(int i = 0; i < array.length; i++){
            for(int n = 0; n < array.length - 1; n++){
                if(array[n] > array[n+1]){
                    int swapHelper = array[n];
                    array[n] = array[n+1];
                    array[n+1] = swapHelper;                    
                }
            }
        }
        return array[k-1];
    }

    @Override
    public float getAverage(int[] array) {
        float sum = 0;
        for(int i: array){
            sum += i;
        }
        return (sum/array.length);
    }
    
    public static long gcd(long a, long b){
        while (b > 0)
        {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static long lcm(long a, long b){
        return a * (b / gcd(a, b));
    }
    
    @Override
    public long getSmallestMultiple(int upperBound) {
        long result = 1;
        for(int i = 1; i < upperBound; i++){
            result = lcm(i, result);
        }
        return result;
    }

    @Override
    public long getLargestPalindrome(long N) {
        for(long i = N; i > 0; i--){
            if(isIntPalindrome(i)){
               return i; 
            }
        }
        return 1;
    }

    @Override
    public int[] histogram(short[][] image) {
        int[] imageHistogram = new int[256];
        for(short i = 0; i < image.length; i++){
            for(short k = 0; k < image[0].length; k++){
                imageHistogram[image[i][k]]++;
            }
        }
        return imageHistogram;
    }

    @Override
    public long doubleFac(int n) {
        int firstFac = 1;
        firstFac = factorial(n);
        int secondFac = 1;
        secondFac = factorial(firstFac);
        return secondFac;
    }

    @Override
    public long kthFac(int k, int n) {
        int limit;
        int factorial = 1;
        for(int i = 0; i < k; i++){
            if(i == 0){
                limit = n;
                factorial = 1;
            }else{
                limit = factorial;
                factorial = 1;
            }
            factorial = factorial(limit);
        }
        return factorial;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int element: array){
            if(myMap.containsKey(element)){
                myMap.put(element, myMap.get(element) + 1);
            }else{
                myMap.put(element, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            Integer value = entry.getValue();
            if(value % 2 == 1){
                return entry.getKey();
            }
        }
        
        return 0;
    }

    @Override
    public long pow(int a, int b) { //Write a O(log(b)) solution.?????????/
        int result = 1;
        for(int i = 0; i < b; i++){
            result *= a;
        }
        return result;
        
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int[] scalarProduct = new int[a.length];
        for(int i = 0; i < a.length; i++){
            scalarProduct[i] = a[i] * b[i];
        }
        int sum = 0;
        for(int i = 0; i < scalarProduct.length; i++){
            sum += scalarProduct[i];
        }
        return sum;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        String result = new StringBuilder(argument).reverse().toString();
        return result;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPalindrome(String argument) {
        String reverseInput = new StringBuilder(argument).reverse().toString();
        return argument.equals(reverseInput);
    }

    @Override
    public boolean isPalindrome(int number) {
        return isIntPalindrome(number);
    }

    @Override
    public int getPalindromeLength(String input) {
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
