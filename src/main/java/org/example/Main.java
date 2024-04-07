package org.example;
import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    }

}
class problem1{ //O(n)
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Minimum is " + minimum(n, arr, Integer.MAX_VALUE)); //with array
    }
    private static int minimum(int n, int[] arr, int min) {
        if(n==0){
            return min;
        }
        if(arr[n-1]>min){
            return minimum(n-1, arr, min);
        }
        return minimum(n-1, arr, arr[n-1]);
    }
}

class problem1_alternative{ //O(n)
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        System.out.println("Minimum is " + minimum(n, Integer.MAX_VALUE)); //without array
    }
    private static int minimum(int n, int num) {
        if(n==0){
            return num;
        }
        int a = sc.nextInt();
        if(num>a){
            return minimum(n-1, a);
        }
        return minimum(n-1, num);
    }
}
class problem2{ //O(n)
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Average is " + average(n, arr)/ (double)n);  //with array
    }
    private static int average(int n, int[] arr) {
        if(n==0){
            return 0;
        }

        return arr[n-1]+average(n-1, arr);

    }
}
class problem2_alternative{ //O(n)
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        System.out.println("Average is " + average(n)/ (double)n); //without array
    }
    private static int average(int n) {
        if(n==0){
            return 0;
        }
        int a = sc.nextInt();
        return a+average(n-1);

    }
}
class problem3{ //O(sqrt(n))
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        System.out.println(prime(n, 2));
    }

    private static String prime(int n, int num) {
        if(n==num){
            return "Prime";
        }
        if(n<2){
            return "Composite";
        }
        if(n%num==0){
            return "Composite";
        }
        return prime(n, num+1);

    }
}
class problem4{ //O(n)
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial(int n) {
        if(n==2){
            return n;
        }
        return n*factorial(n-1);
    }

}
class problem5{ //O(n)
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        System.out.println(fibonacci(n+1, 0, 1));
    }

    private static int fibonacci(int n, int num1, int num2) {
        if(n==1){
            return num1;
        }
        return fibonacci(n-1, num2, num1+num2);
    }

}
class problem6{ //O(n)
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(a, n));
    }

    private static int power(int a, int n) {
        if(n==1){
            return a;
        }
        return a*power(a, n-1);
    }

}

class problem7 { //O(n!)
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s = sc.nextLine();
        permutation(s, "");
    }

    private static void permutation(String str, String s) {
        if (str.length() == 0) {
            System.out.println(s);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String remainingChars = str.substring(0, i) + str.substring(i + 1);
            permutation(remainingChars, s + currentChar);

        }
    }
}

class problem8{ //O(n)
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String s = sc.nextLine();
        System.out.println(digits(s, s.length()-1));
    }

    private static String digits(String s, int ind) {
        if(ind<0){
            return "YES";
        }
        if(!Character.isDigit(s.charAt(ind))){
            return "NO";
        }
        return digits(s, ind-1);
    }
}
class problem9{ //O(2^n)
    public static Scanner sc = new Scanner(System.in);
    public static int binomialcoef(int k, int n) {
        if (k ==n || k==0 ) {
            return 1;
        }
        return binomialcoef(k-1, n-1) + binomialcoef( k, n-1);
    }
    public static void main(String[] args) {

        int n = sc.nextInt();
        int k = sc.nextInt();
        if(n<k){
            System.out.println("K is bigger");
        }
        System.out.println(binomialcoef(k, n));
    }
}
class problem10{ // O(log min(a, b))
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(gcd(a, b));
        }
        else{
            System.out.println(gcd(b, a));
        }

    }

    private static int gcd(int a, int rem) {
        if(rem==0){
            return a;
        }
        return gcd(rem, a%rem);

    }

}