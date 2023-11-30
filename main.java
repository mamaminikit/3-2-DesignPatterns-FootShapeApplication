/* Kitthanya Teachanontkullawat (Mine) 64050027 */
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        FootShape footShape = new FootShape();
        Foot foot = new Foot(footShape);
        Scanner input = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int shape = input.nextInt();
        switch(shape) {
            case 1:
                foot.draw("Ellipse");
                break;
            case 2:
                foot.draw("Rectangle");
                break;
            default:
                System.out.println("Try again, enter only 1 or 2");
        }
    }
}
