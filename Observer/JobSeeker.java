 class JobSeeker implements Observer{

    private String name;
    
    public JobSeeker(String name){
		this.name = name;
	}
    
    @Override
    public void update(Subject s) {
        System.out.println("Usuario: "+this.name);
		System.out.println(s);
    }
    
}