package advanced;

import static java.lang.System.in;

class Prime {

    public void checkPrime(int... n){
        String output = "";

        for(int i: n){
            if(isPrime(i)){
                output += i + " ";
            }
        }

        System.out.println(output);
    }

    private boolean isPrime(int n){
        if(n <= 0) return false;

        if(n == 2) return true;

        if(n == 1) return false;

        if (n%2==0 ) return false;

        for(int i=3; i*i <= n; i += 2) {
            if( n % i == 0) return false;
        }

        return true;
    }
}