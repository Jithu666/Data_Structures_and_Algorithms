// class to implement main method

public class polymorphism_example {
    public static void main(String[] args) {
        payment p = new payment();
//        p.payment();

        payment cc = new cc_payment();
        cc.payment();

        payment dc = new dc_payment();
        dc.payment();

        payment nb = new net_banking();
        nb.payment();
    }
}

class payment {
    public void payment() {
        System.out.println("Generic payment method used at back-end.");
    }
}

class cc_payment extends payment {
    public void payment() {
        System.out.println("\nRuntime object is created for credit card payment.");
    }
}

class dc_payment extends payment {
    public void payment() {
        System.out.println("Runtime object is created for debit card payment.");
    }
}

class net_banking extends payment {
    public void payment() {
        System.out.print("Runtime object is created for net banking payment.");
    }
}