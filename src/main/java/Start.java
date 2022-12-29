public class Start {
    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(5, 8);
        Point p3 = new Point(10, 11);
        Point p4 = new Point(15, 19);
        //Линия 1 начиналась в Точке  {1;3} и кончалась в Точке {5;8}.
        Line line1 = new Line(p1, p2);//с указанием двух Точек
        //Линия 2 начиналась в Точке {10;11} и кончалась в Точке {15;19}
        Line line2 = new Line(p3, p4);//с указанием двух Точек
        //Линия 3 начиналась в Точке конца Линии 1, а кончалась в Точке начала Линии 2
        Line line3 = new Line(p2, p3);//с указанием двух Точек
        //Используя эти объекты, выполните следующее:
        //Выведите текстовое представление Линии 3 на экран
        System.out.println(line3);
        //Рассчитайте суммарную длину всех трех линий и выведите её на экран
        double sumLength = line1.getLineLength() + line2.getLineLength() + line3.getLineLength();
        System.out.println(sumLength);
        //Сдвиньте начало и конец Линии 3 таким образом, чтобы изменились все три объекта Линии
        int shft = 1;
        p2.x += shft;
        p2.y += shft;
        p3.x += shft;
        p3.y += shft;
        //Выведите текстовое представление Линии 3 на экран после изменения её состояния
        System.out.println(line3);
    }
}
