public class Start {
    public static void main (String[] args){
        Point point1=new Point (1, 3);
        Point point2=new Point (1, 3);
        Point point3=new Point (5, 6);
        //Выведите на экран текстовое представление этих точек
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);
        //результат сравнения точек между собой 1 и 2
        if (point1.x==point2.x&&point1.y==point2.y){
            System.out.println("Точка "+point1+" равна точке "+point2);
        }
        else System.out.println("Точка "+point1+" не равна точке "+point2);
        //результат сравнения точек между собой 1 и 3
        if (point1.x==point3.x&&point1.y==point3.y){
            System.out.println("Точка "+point1+" равна точке "+point3);
        }
        else System.out.println("Точка "+point1+" не равна точке "+point3);

        if (point2.x==point3.x&&point2.y==point3.y){
            System.out.println("Точка "+point2+" равна точке "+point3);
        }
        else System.out.println("Точка "+point2+" не равна точке "+point3);
    }
}
