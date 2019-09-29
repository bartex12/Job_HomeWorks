package Less2.Task1;

import java.time.LocalDateTime;

public class Sensor_ST500_Adapter implements MeteoSensor {

    SensorTemperature sensorTemperature;

    public Sensor_ST500_Adapter(SensorTemperature sensorTemperature){
        this.sensorTemperature =sensorTemperature;
    }

    @Override
    public int getId() {
        return sensorTemperature.identifier();
    }

    @Override
    public Float getTemperature() {
        return Float.parseFloat (String.valueOf(sensorTemperature.temperature()));
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
