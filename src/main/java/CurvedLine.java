
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создайте класс Ломаная, которая будет представлять собой ломаную линию (см. пример на рис.1), которая описывается:
//
//массив Точек, через которые линия проходит
public class CurvedLine {
    Point[] pointArr;
    List<Line> linesArr;

    //При создании объекта можно ничего не указывать
    public CurvedLine() {
        //Значения по умолчанию
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(4, 4);
        Point[] arr = {p1, p2, p3, p4};
        this.pointArr = arr;
        LineCreate(pointArr);
    }

    //При создании объекта можно указать начальный набор Точек
    public CurvedLine(Point[] pointArr) {
        this.pointArr = pointArr;
        LineCreate(pointArr);
    }

    //Создание линий из массива точек
    public void LineCreate(Point[] pointArr) {
        Line line;
        linesArr = new ArrayList<>();
        int i;
        for (i = 0; i < pointArr.length - 1; i++) {
            line = new Line(pointArr[i], pointArr[i + 1]);
            linesArr.add(line);
        }
    }

    //Может вернуть массив Линий
    public List<Line> getLinesArr() {
        return linesArr;
    }

    //4.Рассчитать длину массива Линий
    private double CurvedLineSumLinesArrLength() {
        double sum = 0;
        for (Line lines : this.linesArr
        ) {
            sum += lines.getLineLength();
        }
        return sum;
    }

    public double getLength() {
        return CurvedLineSumLinesArrLength();
    }

    //Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”, где TN – это результат приведения к строке Точки с номером N
    @Override
    public String toString() {
        return "Линия " + Arrays.toString(pointArr);
    }
}
