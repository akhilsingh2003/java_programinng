/*1.You are given an interface AdvancedArithmetic which contains a method signature int divi_sum(int n).
You need to write a class called MyCalculator which implements the interface.
diviSum function just takes an integer as input and return the sum of all its divisors.
 For example: divisors of 6 are 1, 2, 3 and 6, so divi_sum should return 12.
 The value of n will be at most 1000.
*/

import java.util.*;
interface AdvancedArithmetic
{
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum=1;
        for(int i=2;i<=(n/2);i++){
            if(n%i==0)sum+=i;
        }
        if(n!=1)return sum+n;
        else return sum;
    }
}

public class interface_practice{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        AdvancedArithmetic myCalculator=new Calculator();
        int sum=myCalculator.divisorSum(n);
        System.out.println(sum);

    }
}