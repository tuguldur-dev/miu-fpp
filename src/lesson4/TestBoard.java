package lesson3;

public class TestBoard {
    public static double getAveragePerimeter(Board[] boards) {
        double sum = 0;
        if (boards == null || boards.length == 0) {
            return sum;
        }
        for (Board board : boards) {
            sum += board.getPerimeter();
        }
        return sum / boards.length;

    }

    public static void main(String[] args) {
        Board b1 = new Board();
        Board b2 = new Board(1, 2, "red");
        Board b3 = new Board(3, 4);
        Board[] col = {b1, b2, b3, new Board(4, 5)};
        System.out.printf("Average Perimeter: %.2f", getAveragePerimeter(null));


//        b1.dislay();
//        b2.dislay();
//        b3.dislay();
//        IO.println(b1.area());
//        IO.println(b2.area());
//        IO.println(b3.area());
//
//
//        b1.setColor("black");
//        b2.setL(40);
//        Board[] boards = new Board[5];
//        boards[0] = b1;
//        boards[1] = b2;
//        boards[2] = b3;
//        boards[3] = new Board();
//
//
//
//
//        for (Board _b : col) {
//            System.out.println(_b.area());
//        }
    }
}
