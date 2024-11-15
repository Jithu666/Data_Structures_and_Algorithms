public class methodHiding {
    public  void function(){
        System.out.println("Method Hiding class's function called");
    }

}

class method_ extends methodHiding{
    public  void function() {
        System.out.println("Method_ class's function called");
    }
}

class elc{
    public static void main(String[] args) {
        methodHiding mh = new methodHiding();
        mh.function();

        method_ m = new method_();
        m.function();

        methodHiding mh1 = new method_();
        mh1.function();
    }
}
