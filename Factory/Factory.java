 class Factory {


    public static void main(String[] args) {
        
        System.out.println(CarFactory.buildCar(CarType.Small));
        System.out.println(CarFactory.buildCar(CarType.Sedan));
        System.out.println(CarFactory.buildCar(CarType.Luxury));
    }
    
}