/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Foot {
    private FootShape footShape;
    public Foot(FootShape footShape) {
        this.footShape = footShape;
    }

    public void draw(String shape) {
        switch (shape) {
            case "Ellipse":
                footShape.drawAsEllipse();
                break;
            case "Rectangle":
                footShape.drawAsRectangle();
                break;
        }
    }
}
