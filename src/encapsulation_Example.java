public class encapsulation_Example {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        size();
    }

    public void size(){
        if(size > 60)
            System.out.println("Bark");
        else if (size > 30)
            System.out.println("Ruff Ruff");
        else
            System.out.println("Hip Hip");
    }
}

class elc {
    public static void main(String[] args) {
        encapsulation_Example dog1 = new encapsulation_Example();
        encapsulation_Example dog2 = new encapsulation_Example();
        encapsulation_Example dog3 = new encapsulation_Example();

        dog1.setSize(79);
        dog1.setSize(32);
        dog1.setSize(17);
    }

}