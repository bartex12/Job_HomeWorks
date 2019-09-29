package Less2.Task1;

class MeteoStore{
	// сохранение данных в базу
	//чтобы не было одинаковых идентификаторов, пришлось ввести meteoSensor.getClass().getSimpleName()
	boolean save(MeteoSensor meteoSensor){
		System.out.format("Saving data from sensor %s [%d] at %s%n temperature - %f ;" +
				" humidity - %f ; pressure - %f \n\r",meteoSensor.getClass().getSimpleName(), meteoSensor.getId(),
				meteoSensor.getDateTime(), meteoSensor.getTemperature(),
				meteoSensor.getHumidity(), meteoSensor.getPressure());
		return true;
	}
}