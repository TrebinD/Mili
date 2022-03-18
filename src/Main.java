public class Main {
    public static void main(String[] args) {

        double costTicket = 1125.23;
        int points = 20;
        int mili = (int) costTicket / points;

        System.out.println("Вам начислено " + mili + " миль.");

    }
}