package SOLID_Principles.Single_Responsible_Principle;

// SRP the class should have only one task to follow.

class srp {
    public void search(int key, int[] arr) {
        int n = arr.length;
        boolean flag = false;
        for (int j : arr) {
            if (j == key) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(key + " found");
        } else{
            System.out.println(key + " not found");
        }
    }
}

class main_method{
    public static void main(String[] args) {
        srp srp = new srp();

        int[] arr = {4,5,6,7};
        int key = 60;

        srp.search(key, arr);
    }
}