package processing.orders;

import java.sql.SQLException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadProcess {
	GeneratingProcess process=new GeneratingProcess();
	
	public void threads()
	{
		ScheduledThreadPoolExecutor exe=new ScheduledThreadPoolExecutor(5);
		exe.scheduleWithFixedDelay(()->{
			try {
				GeneratingProcess.pickOrders();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		},0,60,TimeUnit.SECONDS);
		
	}
}
