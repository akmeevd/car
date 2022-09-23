public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        Car car1 = new Car();
//        Car car2 = new Car();
//        Car car3 = new Car();
//        Car car4 = new Car();
//        car.brand = "Lada";
//        car.model = "Grande";
//        car.engineVolume = 1.7;
//        car.colour = "желтый";
//        car.productionYear = 2015;
//        car.productionCountry = "Россия";
//        car1.brand = "Audi";
//        car1.model = "A8 50 L TDI quattro";
//        car1.engineVolume = 3.0;
//        car1.colour = "черный";
//        car1.productionYear = 2020;
//        car1.productionCountry = "Германия";
//        car2.brand = "BMW";
//        car2.model = "Z8";
//        car2.engineVolume = 3.0;
//        car2.colour = "черный";
//        car2.productionYear = 2021;
//        car2.productionCountry = "Германия";
//        car3.brand = "Kia";
//        car3.model = "Sportage 4";
//        car3.engineVolume = 2.4;
//        car3.colour = "красный";
//        car3.productionYear = 2018;
//        car3.productionCountry = "Южная Корея";
//        car4.brand = "Hyundai";
//        car4.model = "Avante";
//        car4.engineVolume = 1.6;
//        car4.colour = "оранжевый";
//        car4.productionYear = 2016;
//        car4.productionCountry = "Южная Корея";
//        System.out.println(car);
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(car4);



        Car car = new Car("Lada", "Grande", 1.7,
                "желтый", 2015, "Россия");
        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 3.0,
                "черный", 2020, "Германия");
        Car car2 = new Car("BMW", "Z8", 3.0,
                "черный", 2021, "Германия");
        Car car3 = new Car("Kia", "Sportage 4", 2.4,
                "красный", 2018, "Южная Корея");
        Car car4 = new Car("Hyundai", "Avante", 1.6,
                "оранжевый", 2016, "Южная Корея");
        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);




    }
}