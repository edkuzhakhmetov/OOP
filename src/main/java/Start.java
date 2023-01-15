import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        Point[] arr = {p1, p2, p3, p4};
        CurvedLine cline1 = new CurvedLine(arr);
        CurvedLine cline2 = new CurvedLineClosed(arr);
        CurvedLine cline3=new CurvedLine();
        CurvedLine cline4=new CurvedLineClosed();
        System.out.println(cline1);
        System.out.println(cline1.getLinesArr());
        System.out.println(cline1.getLength());
        System.out.println("");
        System.out.println(cline2);
        System.out.println(cline2.getLinesArr());
        System.out.println(cline2.getLength());
        System.out.println("");
        System.out.println(cline3);
        System.out.println(cline3.getLinesArr());
        System.out.println(cline3.getLength());
        System.out.println("");
        System.out.println(cline4);
        System.out.println(cline4.getLinesArr());
        System.out.println(cline4.getLength());
    }
}
