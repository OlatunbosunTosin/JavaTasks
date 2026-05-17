public class Arrays{

    public static int LargestNumberOf(int[] number){
        int largest = number[0];
        for (int count = 1; count < number.length; count++){          
            if (number[count] > largest){
                largest = number[count];
            }
        }return largest;      

    }

    public static int[] ReverseNumberOf(int[] number){
     
        int index =  number.length - 1;
        int count = 0;
        int[] reversedArray = new int[number.length];
        for (;index >= 0; index--){
            reversedArray[count] = number[index];
            count++;
        }return reversedArray;   

    }

    public static boolean elementPresentIn(int[] number, int element){
     
        boolean isPresent = false;
        int count = 0;
        for (;count <= number.length; count++){
            if (element == number[count]){
                isPresent = true;
                break;
            }
        }return isPresent;  

    }

    public static int[] OddPositionElements(int[] number){
        int counter = 0;
        int count = 0;
        int[] oddPosition = new int[(number.length + 1) / 2];
        for (;count <= number.length; count++){
            if (count % 2 == 0){
                oddPosition[counter] = number[count];
                counter++;
            }
        }return oddPosition;

    }




}
