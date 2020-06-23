 class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
        case Small:
            car = new SmallCar();
            break;
 
        case Sedan:
            car = new SedanCar();
            break;
 
        case Luxury:
            car = new LuxuryCar();
            break;
 
        default:
            break;
        }
        return car;
    }
    
}