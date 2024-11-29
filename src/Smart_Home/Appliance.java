package Smart_Home;

public abstract class Appliance {
    int id;
    String name;

    public Appliance(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showDetails(){
        System.out.println("ID: "+id+"\nName: "+name);
    }
}
