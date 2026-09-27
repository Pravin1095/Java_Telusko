package Java_Core.BasicCode;

public class LeapYear {
    private int year;
    private int month;

    public void setYearAndMonth(int year, int month){
        this.year = year;
        this.month = month;
    }

    private boolean isLeap() {
        if(this.year%400==0) {
            return true;
        }
        else if(this.year%100==0) {
            return false;
        }
        else if(this.year%4==0) {
            return true;
        }
        else {
            return false;
        }
    }

    public String DayCount(){
return switch(this.month){
    case 1,3,5,7,8,10,12 -> "31 Days";
    case 4,6,9,11 -> "30 Days";
    case 2 -> isLeap() ? "29 Days" : "28 Days";
    default -> "Invalid month";
        };
    }
}
