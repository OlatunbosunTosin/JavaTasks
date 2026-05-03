public class DistanceConverter{

    public static void main(String[] args){
        System.out.printf("mile\tkilometer%n"); 

        mileToKilometer(2);


        System.out.printf("kilometer\tmile%n");  

        kilometerToMile(2);
       

    }

    
    public static double mileToKilometer(double mile){
        double kilometer = 0.0;
        for (mile = 1; mile <= 10; mile++){

            kilometer = mile * 1.609;

            System.out.printf("%.2f\t%.2f%n",mile, kilometer);  
        

        }return kilometer;
    }

    
    public static double kilometerToMile(double kilometer){
        double mile = 0.0;
        for (kilometer = 1; kilometer <= 10; kilometer++){

            mile = kilometer / 1.609; 
            System.out.printf("%-10.2f\t%.2f%n", kilometer, mile); 

        }return mile; 

    }


}
