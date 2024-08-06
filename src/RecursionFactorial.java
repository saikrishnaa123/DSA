public class RecursionFactorial {


    public static void main(String[] args) {
        /*int result= factorial(3);
        System.out.println(result);*/
        //  reverse(1435);
        //  System.out.println(sum);
        //int result = reverse(1435);
        //   System.out.println((int)Math.log10(1342));

        //     System.out.println(reverse1(654654665));
        System.out.println(countZeros(98,0));
    }


    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    static int sumDigits(int n) {
        if (n == 0) {
            return 1;
        }

        return n % 10 * sumDigits(n / 10);
    }


    static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        fun(--n);
    }
    static int sum = 0;
    static void reverse(int n){
        if(n == 0){
            return ;
        }

        int rem = n%10;
        sum = sum * 10 + rem;
        reverse(n/10);
       // System.out.println(n);
        //return n%10 + reverse(n/10);
     //   return sum;
    }

    static int reverse1(int n){
        if(n/10 == 0){
            return n;
        }
        int digits = (int)Math.log10(n) + 1;
        int rem = n%10;
        return rem * (int)Math.pow(10,digits - 1)+ reverse1(n/10);


    }

    static int countZeros(int n, int count) {
        if(n == 0){
            return count;
        }
        if(n % 10 == 0){
            count = count + 1;
        }
        return countZeros(n/10, count);
    }
}
