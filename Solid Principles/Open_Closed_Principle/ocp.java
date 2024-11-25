package SOLID_Principles.Open_Closed_Principle;

    // OPEN CLOSE PRINCIPLE is a software design principle used in Object oriented design, It states that software classes, modules and functions should be open for extension and closed for modification.

    // it increases code re-usability
    // the chances of new bugs arising is low, when we do not manipulate the tested code.

interface chassis{
    String body();
}

class bike implements chassis {
    private final String company;
    public bike(String company){
        this.company = company;
    }
    @Override
    public String body() {
        return "BMW RR310 Chasis is from " + company;
    }
}

class car implements chassis{
    private final String company;
    public car(String company){
        this.company = company;
    }
    @Override
    public String body() {
        return "Tata Nexon's Chasis is inspired from " + company;
    }
}

class truck implements chassis {
    private final String company;
    public truck(String company){
        this.company = company;
    }
    @Override
    public String body() {
        return "Ashok Leyland's chasis is inspired and designed by " + company;
    }
}

class Body{
    public String get_body(chassis chasis){
        return chasis.body();
    }
}

class elc {
    public static void main(String[] args) {
        Body body = new Body();

        chassis bike = new bike("TVS Motorcycle");
        chassis car = new car("BMW X1");
        chassis truck = new truck("Nissan");
        chassis train = new train("BEML Limited");

        System.out.println(body.get_body(bike));
        System.out.println(body.get_body(car));
        System.out.println(body.get_body(truck));
        System.out.println(body.get_body(train));
    }
}

class train implements chassis{
    private final String company;
    public train(String company){
        this.company = company;
    }
    @Override
    public String body() {
        return "Indian railways use chassis from " + company;
    }
}