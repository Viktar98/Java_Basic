public class Converter {
    private float temperature_in_celsius, temperature_in_fahrenheit, temperature_in_kelvin;
    public float getTemperature_in_celsius() {
        return temperature_in_celsius;
    }
    public float getTemperature_in_fahrenheit() {
        return temperature_in_fahrenheit;
    }
    public float getTemperature_in_kelvin() {
        return temperature_in_kelvin;
    }
    public void setTemperature_in_celsius(float _temperature_in_celsius) {
        this.temperature_in_fahrenheit = (float) ((_temperature_in_celsius * 1.8) + 32);
        this.temperature_in_kelvin = (float) (_temperature_in_celsius + 273.15);
        this.temperature_in_celsius = _temperature_in_celsius;
    }
    public void setTemperature_in_fahrenheit(float _temperature_in_fahrenheit) {
        this.temperature_in_fahrenheit = _temperature_in_fahrenheit;
        this.temperature_in_celsius = (_temperature_in_fahrenheit-32)*5/9;
        this.temperature_in_kelvin = (float) ((_temperature_in_fahrenheit-32)*5/9 + 273.15);
    }
    public void setTemperature_in_kelvin(float _temperature_in_kelvin) {
        this.temperature_in_kelvin = _temperature_in_kelvin;
        this.temperature_in_celsius = (float) (_temperature_in_kelvin - 273.15);
        this.temperature_in_fahrenheit = (float) ((_temperature_in_kelvin - 273.15) * 1.8 + 32);
    }
    public void outputTemperature(){
        System.out.println(getTemperature_in_celsius() + "°С");
        System.out.println(getTemperature_in_fahrenheit() + "°F");
        System.out.println(getTemperature_in_kelvin() + "K");
    }
}
