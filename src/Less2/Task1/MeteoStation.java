package Less2.Task1;

public class MeteoStation{
	public static void main(String[] args){

		MeteoStore meteoDb = new MeteoStore();
		MeteoSensor ms200_1 = new MS200(1);
		meteoDb.save(ms200_1);

		System.out.println("******************************************");

		SensorTemperature sensorTemperature = (new ST500Info()).getData();
		MeteoSensor st500 = new Sensor_ST500_Adapter(sensorTemperature);
		meteoDb.save(st500);

	}
}