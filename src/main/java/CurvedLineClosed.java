import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CurvedLineClosed extends CurvedLine {

    public CurvedLineClosed() {
        //Значения по умолчанию
        Point p1 = new Point(4, 4);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(1, 1);
        Point[] arr = {p1, p2, p3, p4};
        super.pointArr = arr;
        LineCreate(pointArr);
    }

    public CurvedLineClosed(Point[] pointArr) {
        super.pointArr = pointArr;
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
        if (i == pointArr.length - 1) {
            line = new Line(pointArr[i], pointArr[0]);
            linesArr.add(line);
        }
    }
    //Может вернуть массив Линий
    @Override
    public double getLength() {
        return super.getLength();
    }

    //4.Рассчитать длину массива Линий
    @Override
    public String toString() {
        return "Линия " + Arrays.toString(pointArr);
    }
}