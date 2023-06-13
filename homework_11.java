package zadachkiJava;

// К сожалению плохо ещё разобрался с интерфейсами, а так включил бы интерфейс для всех классов с методом "gprPerCapita"

public class Homework_11 {
    public static void main(String[] args) {

        Country Poland;
        Poland = new Country("Rzeczpospolita Polska","PL","+48","Warszawa","województwo",37750000,16,679.4F);

        Region Dolnoslaskie;
        Dolnoslaskie = new Region("Dolnoslaskie","D","dw","Wroclaw","gmina",2909997,169,55.71F,19946.74F);

        District Wroclaw;
        Wroclaw = new District("Wroclaw","Wroclaw",641607,11.3F,292.82F,"50-***");
    }
}
class Country {
    private String
    name, abbreviated_name, phone_code, capital_name, region_naming;
    private int
    population, number_of_regions;
    private float gdp;

    public Country(String name, String abbreviated_name, String phone_code, String capital_name, String region_naming, int population, int number_of_regions, float gdp) {
        this.name = name;
        this.abbreviated_name = abbreviated_name;
        this.phone_code = phone_code;
        this.capital_name = capital_name;
        this.region_naming = region_naming;
        this.population = population;
        this.number_of_regions = number_of_regions;
        this.gdp = gdp;
    }
}

class Region extends Country {
    private String car_plates_code, district_naming;
    private int number_of_districts;
    private float square;
    public Region(String name,String car_plates_code, String abbreviated_name, String capital_name,String district_naming, int population, int number_of_districts, float gdp, float square) {
        super(name, abbreviated_name, capital_name, population, gdp);
        this.car_plates_code = car_plates_code;
        this.number_of_districts = number_of_districts;
        this.district_naming = district_naming;
        this.square = square;
    }
}

class District extends Region {
    private String post_code;

    public District(String name, String capital_name, int population, float gdp, float square, String post_code) {
        super(name, capital_name, population, gdp, square);
        this.post_code = post_code;
    }
}
