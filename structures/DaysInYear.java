public class DaysInYear{

    public static void main(String[] args){
        
        System.out.printf("year\tdaysInYear%n");
        numberOfDaysInAYear(2014);

    }

    public static int numberOfDaysInAYear(int year){
        int daysInYear = 0;
        for (year = 2014; year <= 2034; year++){

            if(year % 4 == 0){

                daysInYear = 366;

            }
            else{

                daysInYear = 365;

            }System.out.printf("%d\t%d%n", year, daysInYear);

        }

        return daysInYear;

    }

}
