import java.util.Scanner;
public class Main {
    //Pretrazivanje slobodnih mjesta u kinu.
    static boolean odabir() {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Koji red? (1-5): ");
        int x = sc.nextInt();
        x = x - 1;
        System.out.print("Koje sjedalo? (1-10): ");
        int y = sc.nextInt();
        y = y - 1;
        if (x > 4 || y > 9) {
            System.out.println("Redovi su od 1 do 5, a sjedala pak od 1 do 10!");
            odabir();
        } else if (seats[x][y] == 0) {
            System.out.println("Slobodno");
        }
        else if (seats[x][y] == 1) {
            System.out.println("Prodano");
        }
        return false;
    }

    public static void main(String[] args) {
        odabir();
    }
}