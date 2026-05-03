public class Temperature{

    public static void main(String[] args){

        double temperature = celciusToFarenheit(100);
        System.out.print(temperature);
        

    }

    public static double celciusToFarenheit(double celcius){

        return celcius * 1.8 + 32;
         
    }

}
