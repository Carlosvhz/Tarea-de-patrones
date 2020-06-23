class EagerSingleton {

    private static EagerSingleton instance;

    private EagerSingleton(){

    }
    
    public static EagerSingleton getInstance(){
        if(instance == null){
            instance = new.EagerSingleton();
            System.out.println("Instancia construida");
        }else{
            System.out.println("La instancia ya ha sido construida con anticipación");
        }
        return instance;
    }
}