public class varArgs_Method {

    public void function(int... i) {
        System.out.println("Function call present inside varArgs_Method class called");
    }
}

class new_Class extends varArgs_Method {
    public void function(int i) {
        System.out.println("Function call present inside new_Class class called");
    }
}

class main {
    public static void main(String[] args) {
        varArgs_Method vm = new varArgs_Method();
        vm.function(10);

        new_Class nc = new new_Class();
        nc.function(10);

        varArgs_Method vc = new new_Class();
        vc.function(10);

//        new_Class n_c = (new_Class) new varArgs_Method();
//        n_c.function();

    }
}