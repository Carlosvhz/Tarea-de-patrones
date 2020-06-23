import java.util.ArrayList;

 class HeadHunter implements Subject{

    private ArrayList<String> jobs;
    private ArrayList<Observer> userList;
    
    public HeadHunter(){
        jobs = new ArrayList<String>();
	    userList = new ArrayList<Observer>();
    }
  
    @Override
    public void notifyAllObservers() {
        for(Observer observer: userList){
            observer.update(this);
        }
    }
 
    public void addJob(String job) {
        this.jobs.add(job);
        notifyAllObservers();
    }
 
    public ArrayList<String> getJobs() {
	    return jobs;
    }
 
    public String toString(){
        return jobs.toString();
    }

   
    @Override
    public void registerObserver(Observer o) {
         userList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    }
    
}