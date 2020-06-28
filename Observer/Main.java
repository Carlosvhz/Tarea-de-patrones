public class Main {

    public static void main(String[] args) {
        HeadHunter headHunter = new HeadHunter();

        headHunter.regisObserver(new JobSeeker("Emanuel"));
        headHunter.regisObserver(new JobSeeker("Kiko"));
        headHunter.regisObserver(new JobSeeker("Choco"));
        
        // Trabajos disponibles
        headHunter.addJob("Desarrollador web");
        headHunter.addJob("Administrador de proyectos");
    }
    
}