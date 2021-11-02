package assignment_2;

public class leap_year {
    public static void leap_year (int num){
        if (num% 4 ==0) {
            System.out.println("this is leap year");
        }
        else{
        System.out.println("this is  not leap year");
    }

        public static void main(String args []){
            leap_year(2020);
        }
    }

}

