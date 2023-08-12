package tec.bd.weather;

public interface WeatherService {

    float getCityTemperature(String city);

    float  getByZipCodeTemperature(String zipCode);

}
