package ultility;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public  class  Epoch {
	
	
	static Timestamp instant;
	static SimpleDateFormat formatter =
                new SimpleDateFormat("dd/MM/y");;
	static String time;
        
	
	public Epoch(){
		
	}
	
	public static String getTimestamp(){
		instant = new Timestamp(System.currentTimeMillis());		
		time = formatter.format(instant);
		
		return time;
	}
        
        public String date(String day, String month, String year){
            int d = Integer.parseInt(day);
            int m = Integer.parseInt(month);
            int y = Integer.parseInt(year);
            System.out.println(y);
            return formatter.format(new Date(y,m,d));
        }
        
        

}
