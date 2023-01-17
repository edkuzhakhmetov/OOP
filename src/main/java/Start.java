import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        Point[] arr = {p1, p2, p3, p4};
        CurvedLine cline1 = new CurvedLine(arr);
        CurvedLine cline2 = new CurvedLineClosed(arr);

        Line line1 = new Line(p1, p2);

        List<Lenghtable> arr2 = new ArrayList<>();
        arr2.add(cline1);
        arr2.add(cline2);
        // arr2.add(line1);
        //System.out.println(line1.getLength());
        System.out.println(cline1.getLinesArr());
        System.out.println(cline1.getLength());
        System.out.println(cline2.getLinesArr());
        System.out.println(cline2.getLength());
        System.out.println("\n" +
                "Принимает такой набор объектов,\n" +
                "у которых можно посчитать длину, и возвращает сумму длин принятых объектов.\n" +
                "Переданы в этот метод одна обычная Ломаную из задачи #2 и одна Замкнутая,\n" +
                "результат на экране: " +
                "\n" +sumLengths(arr2) );
    }
/*Разработайте метод, который принимает такой набор объектов,
у которых можно посчитать длину, и возвращает сумму длин принятых объектов.
Передайте в этот метод одну обычную Ломаную из задачи #2 и одну Замкнутую и выведите результат на экран.*/
    public static double sumLengths(List<Lenghtable> linesLst) {
        double sum = 0;
        for (Lenghtable lines : linesLst
        ) {
            sum += lines.getLength();
        }
        return sum;
    }

    interface Lenghtable {
        double getLength();
    }

}
