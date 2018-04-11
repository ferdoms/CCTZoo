package ultility;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public  class  Epoch {
	
	
	static Timestamp instant;
	static SimpleDateFormat formatter;
	static String time;
	
	public Epoch(){
		
	}
	
	public static String getTimestamp(){
		SimpleDateFormat formatter =
                new SimpleDateFormat("y-MM-dd HH:mm:ss");
		instant = new Timestamp(System.currentTimeMillis());		
		time = formatter.format(instant);
		
		return time;
	}

}
