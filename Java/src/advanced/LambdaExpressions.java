package advanced;

public class LambdaExpressions {

    PerformOperation is_odd() {
        return a -> !(a % 2 == 0);
    }

    PerformOperation is_prime() {
        return a -> {
            if (a % 2 == 0) return false;

            for (int i = 3; i * i <= a; i += 2) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }

    PerformOperation is_palindrome() {
        return a -> {
            String num = String.valueOf(a);
            String firstHalf;
            String secondHalf;

            if (num.length() % 2 == 0) {
                firstHalf = num.substring(0, num.length() / 2);
                secondHalf = num.substring(num.length() / 2);
            } else {
                firstHalf = num.substring(0, num.length() / 2);
                secondHalf = num.substring((num.length() / 2) + 1);
            }

            char[] first = firstHalf.toCharArray();
            char[] second = secondHalf.toCharArray();

            for (char aFirst : first) {
                for (int i1 = second.length - 1; i1 >= 0; i1--) {
                    if (aFirst != second[i1]) {
                        return false;
                    }
                }
            }

            return true;
        };
    }
}

interface PerformOperation {
    boolean check(int a);
}
