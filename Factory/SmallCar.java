 class SmallCar extends Car{

     SmallCar() {
        super(CarType.Small);
        construct();
    }

    protected void construct() {
        System.out.println("Carro tipo Small");
    }
    
}