package assessment.Controller;

import java.sql.SQLException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class ThreadProcess {
	OrderProcessing process=new OrderProcessing();
	
	public void threads()
	{
		ScheduledThreadPoolExecutor exe=new ScheduledThreadPoolExecutor(2);
		exe.scheduleWithFixedDelay(()->{
			try {
				OrderProcessing.checkStatus();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		},10,20,TimeUnit.SECONDS);
		
	}
}

