public class clock {
    String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static void main(String[] args) {
        clock c = new clock();
        c.setTime("1212");
        String currentTime = c.getTime();
        System.out.println("Time " + currentTime);
    }
}
