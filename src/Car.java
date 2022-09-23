public class Car {
    String brand;
    String model;
    double engineVolume;
    String colour;
    Integer productionYear;
    String productionCountry;

    Car() {

    }

//    Car(String brand, String model, double engineVolume, String colour,
//        Integer productionYear, String productionCountry) {
//        this.brand = brand;
//        this.model = model;
//        this.engineVolume = engineVolume;
//        this.colour = colour;
//        this.productionYear = productionYear;
//        this.productionCountry = productionCountry;
//    }

    @Override
    public String toString() {
        return "Марка - " + brand + ". Модель - " + model + ". Объем двигателя - " + engineVolume +
                ". Цвет - " + colour + ". Год выпуска - " + productionYear + ". Страна производства - " +
                productionCountry;
    }


//    public void printCars() {
//        System.out.println("Марка - " + brand + ". Модель - " + model + ". Объем двигателя - " + engineVolume +
//                ". Цвет - " + colour + ". Год выпуска - " + productionYear + ". Страна производства - " +
//                productionCountry);
//    }
}
