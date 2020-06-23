class SedanCar extends Car{

    SedanCar() {
        super(CarType.Sedan);
        construct();
    }

    protected void construct() {
        System.out.println("Carro tipo Sedan");
    }

}