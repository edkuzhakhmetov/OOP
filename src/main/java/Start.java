import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        //1. Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        Point[] arr = {p1, p2, p3, p4};
        CurvedLine cline1 = new CurvedLine(arr);
        //Ломаная До
        System.out.println(cline1);
        //2. Рассчитать длину Ломаной
        System.out.println(cline1.getCurvedLineLength());
        //3. Получить у Ломаной массив Линий
        System.out.println(cline1.getLinesArr());
        //4. Рассчитать длину массива Линий
        System.out.println(cline1.getCurvedLineLinesArrLength());
        //5.Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.println(cline1.getCurvedLineLength() == cline1.getCurvedLineLinesArrLength());
        //6. Сдвинуть координату Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
        // Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3),
        // то задача решена верно
        int shft = 10;
        p2.x += shft;
        //Ломаная После
        System.out.println(cline1);
        //3. Получить у Ломаной массив Линий После изменения точки
        System.out.println(cline1.getLinesArr());
    }
}
