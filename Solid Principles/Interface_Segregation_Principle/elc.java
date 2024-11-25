package SOLID_Principles.Interface_Segregation_Principle;

        // Interface Segregation Principle

//    Each method or class only implements the interfaces relevant to that method, Interface Segregation Principle states that, No class should be forced to Implement unnecessary methods

interface ICE{
    void combustionType();
}
interface Ev{
    void battery();
}
interface Cng{
    void gas();
}
class Petrol implements ICE {
    private final String fuelType, Name;
    public Petrol(String Name, String fuelType){
        this.Name = Name;
        this.fuelType = fuelType;
    }

    @Override
    public void combustionType() {
        System.out.println(Name + " runs on " + fuelType);
    }
}
class Diesel implements ICE {
    private final String fuelType, Name;

    public Diesel(String Name, String fuelType){
        this.Name = Name;
        this.fuelType = fuelType;
    }

    @Override
    public void combustionType() {
        System.out.println(Name + " runs on " + fuelType);
    }
}

class Hybrid implements ICE{
    private final String fuelType, Name;

    public Hybrid(String Name, String fuelType){
        this.Name = Name;
        this.fuelType = fuelType;
    }

    @Override
    public void combustionType(){
        System.out.println(Name + " runs on " + fuelType);
    }
}

class Electric implements Ev{
    private final String batteryType, Name;

    public Electric(String Name, String batteryType){
        this.Name = Name;
        this.batteryType = batteryType;
    }
    @Override
    public void battery() {
        System.out.println(Name + " runs on " + batteryType);
    }
}

class CNG implements Cng{
    private final String Name, fuelType;
    public CNG(String Name, String fuelType){
        this.Name = Name;
        this.fuelType = fuelType;
    }
    @Override
    public void gas() {
        System.out.println(Name + " runs on " + fuelType);
    }
}

class elc {
    public static void main(String[] args) {

        // ICE implementation
        Petrol p = new Petrol("BMW X1", "Petrol");
        Diesel d = new Diesel("Jeep Meridian", "Diesel");
        Hybrid h = new Hybrid("Innova Hycross Hybrid", "Petrol");

        // CNG implementation
//        CNG cng = new CNG("Maruti Wagon-R", "CNG");

        // Ev implementation
        Electric e = new Electric("Tata Nexon", "Lead Acid Battery");
        Electric ev = new Electric("Jaguar F-Pace", "Lithium-ion battery");


        // Function Call
        p.combustionType();
        d.combustionType();
        h.combustionType();

//        cng.gas();

        e.battery();
        ev.battery();
    }
}