 class LuxuryCar extends Car{

    LuxuryCar() {
        super(CarType.Luxury);
        construct();
    }

    protected void construct() {
         System.out.println("Carro tipo Luxury");
    }
    
}