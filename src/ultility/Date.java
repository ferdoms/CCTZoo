package ultility;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public  class  Date {
    /**
     * private attribute for holding day
     */
    private int day;
    
    /**
     * private attribute for holding month
     */
    private int month;
    
    /**
     * private attribute for holding year
     */
    private int year;
    
    
	
    /**
     * Constructor that takes a ISO8601 date string
     * @param dateISO8601 
     * @throws IllegalArgumentException if invalid
     */
    public Date(String dateISO8601) throws IllegalArgumentException {
        String[] s = dateISO8601.split("-");
        if (s.length != 3) throw new IllegalArgumentException();
        int yy = Integer.parseInt(s[0]);
        int mm = Integer.parseInt(s[1]);
        int dd = Integer.parseInt(s[2]);
        if (!isValid(yy, mm, dd)) throw new IllegalArgumentException();
        this.year = yy;
        this.month = mm;
        this.day = dd;
    } 
        
        /**
        * default constructor that uses today's Date()
        */
       public Date() {
           Calendar currentDate = Calendar.getInstance(); //Get the current date
           java.util.Date x = currentDate.getTime();
           SimpleDateFormat formatyear = new SimpleDateFormat("yyyy");
           this.year = Integer.parseInt(formatyear.format(x));
           SimpleDateFormat formatmonth = new SimpleDateFormat("MM");
           this.month = Integer.parseInt(formatmonth.format(x));     
           SimpleDateFormat formatdd = new SimpleDateFormat("dd");
           this.day = Integer.parseInt(formatdd.format(x));       
       }

       
            /**
          * Getter for day
          * @return day
          */
         public int Date() {
             return this.day;
         }

         /**
          * Getter for month
          * @return month
          */
         public int getMonth() {
             return this.month;
         }

         /**
          * Getter for year
          * @return year
          */
         public int getYear() {
             return this.year;
             } 
	
        /**
        * Getter for day
        * @return day
        */
       public int getDay() {
           return this.day;
       }
         
            public static boolean isValid(int year, int month, int day) {
        if (year < 0) return false;
        if ((month < 1) || (month > 12)) return false;
        if ((day < 1) || (day > 31)) return false;
        switch (month) {
            case 1: return true;
            case 2: return (isLeap(year) ? day <= 29 : day <= 28);
            case 3: return true;
            case 4: return day < 31;
            case 5: return true;
            case 6: return day < 31;
            case 7: return true;
            case 8: return true;
            case 9: return day < 31;
            case 10: return true;
            case 11: return day < 31;
            default: return true;
        }
    }
            
             public static boolean isLeap (int year) {
            if (year % 4 != 0) {
              return false;
            } else if (year % 400 == 0) {
              return true;
            } else if (year % 100 == 0) {
              return false;
            } else {
              return true;
            }        
    }
    /**
     * Compare two dates
     * @param d Date
     * @return true if it is earlier than d
     */        
             
        public boolean compareTo(Date d) {
        int day1 = d.getDay();
        int month1 = d.getMonth();
        int year1 = d.getYear();
        return (this.year <= year1) && (this.month <= month1) && (this.day <= day1);
        
        
        
    }
        /*
        * @return 
        */
        public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.valueOf(this.year));
        s.append("-");
        if (this.month < 10) s.append("0");
        s.append(String.valueOf(this.month));
        s.append("-");
        if (this.day < 10) s.append("0");
        s.append(String.valueOf(this.day));
        return s.toString();
    }
}
