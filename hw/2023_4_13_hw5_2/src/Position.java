public class Position {
    public static String getPosition(Rectangle r1, Rectangle r2) {
        if (r1.x + r1.width < r2.x || r2.x + r2.width < r1.x || r1.y + r1.height < r2.y || r2.y + r2.height < r1.y) {
            return "两个矩形不相交";
        } else if (r1.x + r1.width < r2.x ) {
            return "第一个矩形在第二个左边";
        } else if (r2.x + r2.width < r1.x ) {
            return "第一个矩形在第二个右边";
        } else if (r1.y + r1.height < r2.y) {
            return "第一个矩形在第二个上边";
        } else {
            return "第一个矩形在第二个下边";
        }
    }
}