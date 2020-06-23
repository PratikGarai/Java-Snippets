package Self_Driven;

import java.util.Calendar;

public class Calendar_Demo
{
    public static void main(String[] args)
    {
        Calendar ab = Calendar.getInstance();
        System.out.println("-----PRINTING  FIELDS-----");
        System.out.println();
        System.out.println("Date :---");
        System.out.println("Year        : "+ab.get(ab.YEAR));
        System.out.println("Month       : "+(ab.get(ab.MONTH)+1));
        System.out.println("Date        : "+ab.get(ab.DAY_OF_MONTH));
        System.out.println("Day of week : "+ab.get(ab.DAY_OF_WEEK));
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Time :---");
        System.out.println("Hour        : "+ab.get(ab.HOUR_OF_DAY));
        System.out.println("Minute      : "+ab.get(ab.MINUTE));
        System.out.println("Second      : "+ab.get(ab.SECOND));
        System.out.println("Millisecond : "+ab.get(ab.MILLISECOND));
        System.out.println("--------------------------");
        System.out.println();
        Calendar cd = Calendar.getInstance();
        cd.set(Calendar.YEAR,5000);
        System.out.println("Year set to 5000");
        cd.set(Calendar.MONTH,11);
        System.out.println("Month set to DECEMBER");
        System.out.println();
        System.out.println("Reading values now:");
        System.out.println("Year       : "+cd.get(cd.YEAR));
        System.out.println("Month      : "+(cd.get(cd.MONTH)+1));
        System.out.println();
        System.out.println("Trying to read undefined field");
        try
        {
            System.out.println("Date      :"+(cd.get(cd.DAY_OF_MONTH)));
        }catch(Exception e)
        {
            System.out.println("Oops! Error");
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Completed");
        }
    }
}
