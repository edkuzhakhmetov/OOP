class Line {
    //Создайте класс Линия, расположенную на двумерной плоскости, которая описывается:
    //Координата начала: Точка
    //Координата конца: Точка
    Point point1, point2;

    //Создается одним из следующих способов:
    //с указанием двух Точек
    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    //Создается одним из следующих способов:
    //с указанием четырех целых чисел (x y начала и x y конца)
    public Line(int x1, int y1, int x2, int y2) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
    }

    //Может возвращать текстовое представление вида “Линия от {X1;Y1} до {X2;Y2}”
    public String toString() {
        String res = "";
        res += "Линия от " + point1 + " до " + point2;
        return res;
    }

    //Может вернуть длину Линии
    public double getLineLength() {
        int xLength = this.point2.x - this.point1.x;
        int yLength = this.point2.y - this.point1.y;
        double gipo = Math.sqrt(Math.pow(xLength, 2) + Math.pow(yLength, 2));
        return gipo;
    }
}
