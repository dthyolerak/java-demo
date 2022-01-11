public class Time {
    private int hour;
    private int min;
    Time(){

    }
     void setHour(int hour){
        this.hour = hour;
    }

    int getHour(){
        return hour;
    }
    void setMin(int min){
        this.min = min;
    }

    int getMin(){
        return min;
    }
    public static void main(String[] args) {
        Time T = new Time();
        T.setHour(3);
        T.setMin(3999);
        System.out.println("hours "+ T.getHour()+  " min"  +T.getMin());

    }
}
