import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenstrualAppTest{

    @Test
    public void testForCorrectPeriodLength(){

        int[] periodFirstDay = {26,23,20};
        int[] periodLastDay = {30,27,24};
        String[] daysInMonth = {"November", "December", "January"};

        int expectedAveragePeriodLength = MenstrualApp.periodLength(periodFirstDay, periodLastDay, daysInMonth);
        int actualAveragePeriodLength = 5;
        assertEquals(expectedAveragePeriodLength, actualAveragePeriodLength);


    }

    @Test
    public void testForCorectCycleLength(){

        int[] periodFirstDays = {26,23,20,14,9};
        String[] daysInMonth = {"November", "December", "January","February","March"};

        int expectedAverageCycleLength = MenstrualApp.getCycleLength(periodFirstDays, daysInMonth);
        int actualAverageCycleLength = 25;
        assertEquals(expectedAverageCycleLength, actualAverageCycleLength);


    }

    @Test
    public void testForNextPeriod(){

        int[] lastFirstDay = {26,23,20,14,9};
        String[] daysInMonth = {"November", "December", "January","February","March"};

        int expectedNextPeriod = MenstrualApp.getNextPeriod(lastFirstDay, daysInMonth);
        int actualNextPeriod = 3;
        assertEquals(expectedNextPeriod, actualNextPeriod);

    }

    @Test
    public void testForOvulationDate(){

        int[] periodFirstDays = {26,23,20,14,9,4};
        String[] daysInMonth = {"November", "December", "January","February","March","April"};

        int expectedOvulationDate = MenstrualApp.getOvulationDate(periodFirstDays, daysInMonth);
        int actualOvulationDate = 15;
        assertEquals(expectedOvulationDate, actualOvulationDate);

    }

    @Test
    public void testForfertileWindow(){

        int[] periodFirstDays = {26,23,20,14,9,4};
        String[] daysInMonth = {"November", "December", "January","February","March","April"};

        String expectedFertilePeriod = MenstrualApp.getFertileWindow(periodFirstDays, daysInMonth);
        String actualFertilePeriod = "10-15";
        assertEquals(expectedFertilePeriod, actualFertilePeriod);

    }

    @Test
    public void testForSafePeriod(){

        int[] periodFirstDays = {26,23,20,14,9,4};
        int[] periodLastDay = {30,27,24,18,13,8};
        String[] daysInMonth = {"November", "December", "January","February","March","April"};

        String expectedSafePeriod = MenstrualApp.getSafePeriod(periodFirstDays, periodLastDay, daysInMonth);
        String actualSafePeriod = "4-8 and 16-28";
        assertEquals(expectedSafePeriod, actualSafePeriod);

    }


}


