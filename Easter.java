//Jian Acol
//This program will calculate the date easter falls on given a year after 1583
public class Easter{
    public static void main(String[] args) {
        //code goes here
        int y = 1583;
        System.out.println("y = "+y);
        int a = y%19;
        System.out.println("a = "+a);
        int b = y/100;
        System.out.println("b = "+b);
    }

}
