public class Car {
    String brand;
    String model;
    double engineVolume;
    String colour;
    Integer productionYear;
    String productionCountry;

    
    Car(String brand, String model, double engineVolume, String colour,
        Integer productionYear, String productionCountry) {
        if (brand == null) {
            brand = "default";
        }if (model == null) {
            model = "default";
        }if (productionCountry == null) {
            productionCountry = "default";
        }
        if (engineVolume == 0) {
            engineVolume = 1.5;
        }
        if (colour == null) {
            colour = "белый";
        }
        if (productionYear == null) {
            productionYear = 2000;
        }
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.colour = colour;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

    }

    @Override
    public String toString() {
        return "Марка - " + brand + ". Модель - " + model + ". Объем двигателя - " + engineVolume +
                ". Цвет - " + colour + ". Год выпуска - " + productionYear + ". Страна производства - " +
                productionCountry;
    }

}
