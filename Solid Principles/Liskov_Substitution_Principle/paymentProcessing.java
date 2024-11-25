package SOLID_Principles.Liskov_Substitution_Principle;

interface Payment{
    void paymentProcessing(int amount);
}

class DebitCard implements Payment{
    private final int cardNo;

    public DebitCard(int cardNO){
        this.cardNo = cardNO;
    }

    @Override
    public void paymentProcessing(int amount) {
        String n = String.valueOf(cardNo);
        int len = n.length();
        String card_no = "XXXX" +  n.charAt(len-1) + n.charAt(len-2);
        System.out.println(amount + " Deducted from your Debit card ending " + card_no);
    }
}

class CreditCard implements Payment{
    private final int cardNo;

    public CreditCard(int cardNO){
        this.cardNo = cardNO;
    }

    @Override
    public void paymentProcessing(int amount) {
        String n = String.valueOf(cardNo);
        int len = n.length();
        String card_no = "XXXX" +  n.charAt(len-1) + n.charAt(len-2);
        System.out.println(amount + " Deducted from your Credit card ending " + card_no);
    }
}

class upi implements Payment {
    private final String upiId;
    public upi(String upiId){
        this.upiId = upiId;
    }

    @Override
    public void paymentProcessing(int amount) {
        int n = upiId.length();
        String end = "XXXX" + upiId.substring(n-4, n);
        System.out.println(amount + " Debited from your UPI ID ending " + end);
    }
}

class netBanking implements Payment {

    private final int customerId;

    public netBanking(int customerId){
        this.customerId = customerId;
    }

    @Override
    public void paymentProcessing(int amount) {
        String customerId = String.valueOf(this.customerId);
        int length = customerId.length();
        String end = "XXXX" + customerId.substring(length-4, length);
        System.out.println(amount + " Debited from your Bank Account ending " + end);
    }
}

class paymentProcessing  {
    public void payment_Processing(Payment payment, int amount){
        payment.paymentProcessing(amount);
    }
}

class main_method{
    public static void main(String[] args) {

        DebitCard dc = new DebitCard(439029233);
        CreditCard cc = new CreditCard(400569087);
        upi upi = new upi("githendra@ybl");
        netBanking nb = new netBanking(102340909);

        dc.paymentProcessing(299);
        cc.paymentProcessing(40056);
        upi.paymentProcessing(10000);
        nb.paymentProcessing(66310);
    }
}