package processing.orders;

import java.sql.SQLException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadProcess {
	GeneratingProcess process=new GeneratingProcess();
	
	public void threads()
	{
		ScheduledThreadPoolExecutor exe=new ScheduledThreadPoolExecutor(2);
		exe.scheduleWithFixedDelay(()->{
			try {
				GeneratingProcess.endProcess();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		},0,20,TimeUnit.SECONDS);
		exe.shutdown();
		
	}
}
