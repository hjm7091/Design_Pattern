package use_factoryMethod;

import java.util.Calendar;

public class SchedulerFactory {

	private static ElevatorScheduler scheduler = null;
	
	public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID) {
		switch (strategyID) {
			case RESPONSE_TIME:
				scheduler = new ResponseTimeScheduler();
				break;
			case THROUGHPUT:
				scheduler = new ThroughputScheduler();
				break;
			case DYNAMIC:
				int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
				if(hour < 12)
					scheduler = new ResponseTimeScheduler();
				else
					scheduler = new ThroughputScheduler();
				break;
		}
		return scheduler;
	}
	
}
