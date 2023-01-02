
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создайте класс Ломаная, которая будет представлять собой ломаную линию (см. пример на рис.1), которая описывается:
//
//массив Точек, через которые линия проходит
public class CurvedLine {
    Point[] pointArr;
    List<Line> linesArr;
    double CurvedLineLength;


    //При создании объекта можно ничего не указывать
    public CurvedLine() {
        //Значения по умолчанию
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(10, 10);
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
        linesArr = new ArrayList<>();
        CurvedLineLength = 0;
        Line line;
        for (int i = 0; i < this.pointArr.length - 1; ) {
            line = new Line(pointArr[i], pointArr[++i]);
            linesArr.add(line);
            // Рассчитать длину Ломаной
            CurvedLineLength += line.getLineLength();
        }
    }

    //Может вернуть массив Линий
    public List<Line> getLinesArr() {
        return linesArr;
    }


    // Может вернуть свою длину
    public double getCurvedLineLength() {
        return CurvedLineLength;
    }

    //4.Рассчитать длину массива Линий
    public double getCurvedLineLinesArrLength() {
        double CurvedLineSumLinesArrLength = 0;
        for (Line lines : linesArr
        ) {
            CurvedLineSumLinesArrLength += lines.getLineLength();
        }
        return CurvedLineSumLinesArrLength;
    }

    //Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”, где TN – это результат приведения к строке Точки с номером N
    @Override
    public String toString() {
        return "Линия " + Arrays.toString(pointArr);
    }
}
