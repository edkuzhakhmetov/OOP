public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(5, 8);
        Point p3 = new Point(10, 11);
        Point p4 = new Point(15, 19);
        //Линия 1 начиналась в Точке  {1;3} и кончалась в Точке {5;8}.
        CurvedLine line1 = new CurvedLine();//с указанием двух Точек
        //Линия 2 начиналась в Точке {10;11} и кончалась в Точке {15;19}
        Line line2 = new Line(p3, p4);//с указанием двух Точек
        //Линия 3 начиналась в Точке конца Линии 1, а кончалась в Точке начала Линии 2
        Line line3 = new Line(p2, p3);//с указанием двух Точек
        //Используя эти объекты, выполните следующее:
        //Выведите текстовое представление Линии 3 на экран
        System.out.println(line1);
    }
}
