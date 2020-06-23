 class Main {

    public static void main(String[] args) {
        HeadHunter hehu = new HeadHunter();

        hehu.regisObserver(new JobSeeker("Emanuel"));
        hehu.regisObserver(new JobSeeker("Kiko"));
        hehu.regisObserver(new JobSeeker("Choco"));
        
        // Trabajos disponibles
        hehu.addJob("Desarrollador web");
        hehu.addJob("Administrador de proyectos");
    }
    
}