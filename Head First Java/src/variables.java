public class variables {

    String name = "Jithu";

    // To avoid this problem we set the instance variable type to private and create getters and setters as public
    private String Name = "Jithu";

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static void main(String[] args) {

        variables v = new variables();
//        v.name = null; // any one from the program can directly change the name of the variable, where the variable wiill loose its original value and make the variable useless, so this is not the correct method to name a variable.

//        System.out.println(v.name);


        // now we can set the name what we want to the setName method, it will only reflect in the setName method, but it will not change the Name variable.

        v.setName("  ");
        System.out.println(v.getName());
        System.out.println(v.Name);
    }
}
