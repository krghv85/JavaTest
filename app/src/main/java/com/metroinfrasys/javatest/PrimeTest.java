package com.metroinfrasys.javatest;

public class PrimeTest {
    public static void main(String s[]) {
      String primeNumbers = "";
        int counter=0;
        for (int i=1;i<=100;i++)
        {
            counter=0;
            for (int num=i;num>=1;num--)
            {
                if (i%num==0)
                {
                    counter=counter +1;
                }
            }
            if (counter==2)
            {
                primeNumbers=primeNumbers+i+" ";
            }

        }
        System.out.print("Prime Numbers :- \n"+primeNumbers);


     /*   int n = 15;
        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            temp = n % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.print("Numner " + n + " is Prime");
        } else {
            System.out.print("Numner " + n + " is not Prime");
        }
      */
    }
}
