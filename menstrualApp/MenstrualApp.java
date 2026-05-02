public class MenstrualApp{

    public static int monthDays(String month ){
           int days = 0;
          
        switch(month){
            case "January", "March", "May", "July", "August", "September", "October", "December":
                days = 31;
                break;
            case "February":
                days = 28;
                break;
            case "April", "June", "November":
                days = 30;
                break;
        
 
        }return days;
    }

    public static int periodLength(int[] startDay, int[] endDay, String[] month){

        int lengthOfPeriod = 0;
        int sum = 0;
        int average = 0;

        for(int count = 0; count < startDay.length; count++){
            int numberOfDays = monthDays(month[count]);
            if (endDay[count] < startDay[count]){

                lengthOfPeriod = ((numberOfDays - startDay[count]) + 1) + endDay[count];

            }

            else{

                lengthOfPeriod = (endDay[count] - startDay[count]) + 1;

            }
            sum += lengthOfPeriod;
            average = sum / startDay.length;
            }
            
        return average;


    }

    public static int getCycleLength(int[] startDay, String[] month){

        int lengthOfCycle = 0;
        int sum = 0;
        int average = 0;
        for(int count = 0; count < startDay.length-1; count++){
            int numberOfDays = monthDays(month[count]);

            if (month[count] == month[count + 1]){

                lengthOfCycle = (startDay[count + 1] - startDay[count]);

            }

            else{

                lengthOfCycle = (numberOfDays - startDay[count]) + startDay[count + 1];

            }
            sum += lengthOfCycle;
            average = sum / (startDay.length-1);
        }
            
        return average;


    }

    public static int getNextPeriod(int[] startDay, String[] month){
            int nextPeriodDay = 0;
            int cycleLength = getCycleLength(startDay, month);
            int lastStartPeriod = startDay[startDay.length-1];
            int numberOfDays = monthDays(month[month.length-1]);
            
            nextPeriodDay = lastStartPeriod + cycleLength;
            if (numberOfDays < nextPeriodDay){

                nextPeriodDay = nextPeriodDay - numberOfDays;   

            }
        
            return nextPeriodDay;


    }


    public static int getOvulationDate(int[] startDay, String[] month){
            int ovulationDay = 0;
            int cycleLength = getCycleLength(startDay, month);
            int lastStartPeriod = startDay[startDay.length-1];
            int numberOfDays = monthDays(month[month.length-1]);
            
            ovulationDay = (cycleLength - 14) + lastStartPeriod;
            if (numberOfDays < ovulationDay){

                ovulationDay = ovulationDay - numberOfDays;   

            }
        
            return ovulationDay;


    }


    public static String getFertileWindow(int[] startDay, String[] month){
            int fertile = 0;
            int dayOfOvulation = getOvulationDate(startDay, month);
            int numberOfDays = monthDays(month[month.length-1]);
            
            fertile = dayOfOvulation - 5;
            if (dayOfOvulation <= 5){

                fertile = dayOfOvulation + (numberOfDays - (5-dayOfOvulation));   

            }
        
            return fertile + "-" + dayOfOvulation;

    }

    public static String getSafePeriod(int[] startDay, int[] endDay, String[] month){
            int firstDay = startDay[startDay.length-1];
            int lastDay = endDay[startDay.length-1];
            int fertile = 0;
            int dayOfOvulation = getOvulationDate(startDay, month);
            int numberOfDays = monthDays(month[month.length-1]);
            int expectedNextPeriod = getNextPeriod(startDay, month);
            fertile = dayOfOvulation - 5;
            if (dayOfOvulation <= 5){

                fertile = dayOfOvulation + (numberOfDays - (5-dayOfOvulation));   

            }
            
            return firstDay + "-" + lastDay + " and " + (dayOfOvulation +1) + "-" + (expectedNextPeriod-1);

    }


}






