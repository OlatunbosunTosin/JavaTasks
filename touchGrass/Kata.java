public class Methods{
    public static void main(String[] args){
        int largestNumber = maximum(15,10);
        System.out.printf("Maximum number = %d%n", largestNumber);

        boolean evenNumber = isEven(11);
        System.out.println(evenNumber);

        int minus = subtract(3,7);
        System.out.printf("difference is %d%n" ,minus);

        float division = divide(5,2);
        System.out.printf("Quotient is %.2f%n", division);

        int factorOfInteger = factorOf(20);
        System.out.printf("number of factors is %d%n", factorOfInteger);

        boolean palindrome = isPalindrome(54145);
        System.out.println(palindrome);

        long factorial = factorialOf(5);
        System.out.printf("factorial is %d%n", factorial);
    
        long squares = squareOf(5);
        System.out.printf("square is %d%n", squares);      

    }

    public static int maximum(int numberOne, int numberTwo){
        int largest = numberOne;
        if (numberTwo > largest){
            largest = numberTwo;
        }
        return largest;
    }

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    
    }

    public static int subtract(int numberOne, int numberTwo){
        int difference = Math.abs(numberOne - numberTwo);
        return difference;
    }

    public static float divide(int numberOne, int numberTwo){
        if (numberTwo == 0){
            return 0;
        }
        else{
            int quotient = numberOne / numberTwo;
            return quotient;   
        }
    }

    public static int factorOf(int number){
        int count = 0;
        int factor = 1; 
        for (;factor <= number; factor++){
            if (number % factor == 0){
                count++;
            }  
        }return count;
  
    }

    public static boolean isPalindrome(int number){
            int firstDigit = number / 10;
            int firstDigitRem = number % 10;
            int secondDigit = firstDigit / 10;
            int secondDigitRem = firstDigit % 10;
            int thirdDigit = secondDigit / 10;
            int thirdDigitRem = secondDigit % 10;
            int fourthDigit = thirdDigit / 10;
            int fourthDigitRem = thirdDigit % 10;
            int lastDigit = fourthDigit / 10;
            int lastDigitRemainder = fourthDigit % 10;

            if (lastDigitRemainder == firstDigitRem && fourthDigitRem == secondDigitRem){
                return true;
            }
            else{
                return false;
            }
    }

    public static long factorialOf(int number){
        int product = 1;
        int integer = number; 
        for (;integer >= 1; integer--){
            product *= integer;
        }return product;
  
    }

    public static long squareOf(int number){
        int square = number * number;
        return square;
    }

}
