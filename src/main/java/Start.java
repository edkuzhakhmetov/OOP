import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        //Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        Point[] arr= {p1,p2,p3,p4};

        CurvedLine cline1 = new CurvedLine(arr);

        //Линия 3 начиналась в Точке конца Линии 1, а кончалась в Точке начала Линии 2
        //Line line3 = new Line(p2, p3);//с указанием двух Точек
        //Используя эти объекты, выполните следующее:
        //Выведите текстовое представление Линии 3 на экран
        CurvedLine cline2 = new CurvedLine();
        System.out.println(cline1);
        System.out.println(cline1.getLinesArr());
        System.out.println(cline1.getLineArrLength());
        //System.out.println(Arrays.toString(cline1.getPointArr()));
    }
}
