package Less2.Task1;

import java.time.LocalDateTime;

class ST500Info implements SensorTemperature{

	public SensorTemperature getData(){
		return new SensorTemperature(){
				public int identifier(){
					return 1;
				}
				public double temperature(){
					return 22.0;
				}
				public int year(){
					return LocalDateTime.now().getYear();
				}
				public int day(){
					return LocalDateTime.now().getDayOfYear();
				}
				public int second(){
					LocalDateTime now = LocalDateTime.now();
					return now.getHour()*3600 + now.getMinute()*60 + now.getSecond();
				}
		};
	}

	@Override
	public int identifier() {
		return 1;
	}

	@Override
	public double temperature() {
		return 22.0;
	}

	@Override
	public int year() {
		return LocalDateTime.now().getYear();
	}

	@Override
	public int day() {
		return LocalDateTime.now().getDayOfYear();
	}

	@Override
	public int second() {
		LocalDateTime now = LocalDateTime.now();
		return now.getHour()*3600 + now.getMinute()*60 + now.getSecond();
	}

}