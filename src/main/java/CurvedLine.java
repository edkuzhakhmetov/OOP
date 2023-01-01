
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создайте класс Ломаная, которая будет представлять собой ломаную линию (см. пример на рис.1), которая описывается:
//массив Точек, через которые линия проходит
public class CurvedLine {
    Point[] pointArr;
    Line line;
    List<Line> linesArr;

    //При создании объекта можно ничего не указывать
    public CurvedLine() {
        //Значения по умолчанию
        Point p1 = new Point(1, 1);
        Point p2 = new Point(3, 3);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(10, 10);
        //Линия 1 начиналась в Точке  {1;3} и кончалась в Точке {5;8}.
        Point[] arr = {p1, p2, p3, p4};
        this.pointArr = arr;
        LineCreate(pointArr);
    }

    //При создании объекта можно указать начальный набор Точек
    public CurvedLine(Point[] pointArr) {
        this.pointArr = pointArr;
        LineCreate(pointArr);
        /*
        for (int i = 0; i < pointArr.length-1;) {
            line = new Line(pointArr[i],pointArr[++i]);
            System.out.println(line);
        }

         */
    }

    //Создание линий из массива
    public void LineCreate(Point[] pointArr) {
        int i;
        linesArr = new ArrayList<>();
        for (i = 0; i < this.pointArr.length - 1; ) {
            line = new Line(pointArr[i], pointArr[++i]);
            linesArr.add(line);
        }
        //System.out.println(linesArr);
    }

    //Может вернуть массив точек,если это имелось ввиду
    public Point[] getPointArr() {
        return pointArr;
    }

    //Может вернуть массив Линий
    public List<Line> getLinesArr() {
        return linesArr;
    }

    // Может вернуть свою длину
//
// Рассчитать длину массива Линий
    public double getLineArrLength() {
        double sumLength = 0;
        int j;
        for (j = 0; linesArr.length; ) {
            sumLength += Line.getLineLength();
            j++;
        }
        return sumLength;
    }

    //Может быть приведена к строковой форме вида “Линия [Т1,T2,…,TN]”, где TN – это результат приведения к строке Точки с номером N
    @Override
    public String toString() {
        return "Ломаная Линия " + Arrays.toString(pointArr);
    }
}
/*





Под Точкой имеется ввиду класс, созданный в задании 1 (точка координат). Под Линией имеется ввиду класс, созданный в задании 2 (линия).

Необходимо выполнить следующие задачи:


Рассчитать длину Ломаной
Получить у Ломаной массив Линий
Рассчитать длину массива Линий
Сравнить длину Ломаной и массива Линий: они должны совпасть
Сдвинуть координату Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}. Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
 */