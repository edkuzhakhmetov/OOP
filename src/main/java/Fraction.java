class Fraction {
    //Объекты дробей не могут изменять свое состояние
    private final int x;//Имеет числитель: целое число
    private final int y;//Имеет знаменатель: целое число

    //Дробь может быть создана с указанием числителя и знаменателя
    public Fraction(int x, int y) {
        this.x = x;//Для числителя задать отрицательное значение можно, в этом случае вся дробь считается отрицательной
        if (y > 0) this.y = y;//Для знаменателя отрицательное значение недопустимо
        else throw new IllegalArgumentException("недопустимое значение знаменателя");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Может выполнять операции сложения с целым числом
    public Fraction fSumInt(int s2) {
        int x2 = this.y * s2;
        int sumX = this.x + x2;
        int sumY = this.y;
        Fraction fSum = new Fraction(sumX, sumY);
        return fSum;
    }

    public Fraction fMinusInt(int s2) {
        int x2 = this.y * s2;
        int sumX = this.x - x2;
        int sumY = this.y;
        Fraction fMinus = new Fraction(sumX, sumY);
        return fMinus;
    }

    //Может выполнять операции сложения с другой Дробью
    public Fraction sum(Fraction s2) {
        int x1 = this.x;
        int y1 = this.y;
        int x2 = s2.x;
        int y2 = s2.y;
        int sumX;
        int sumY;
        if (y1 == y2) {
            sumX = x1 + x2;
            sumY = y1;
        } else if (y1 % y2 == 0) {
            int n = y1 / y2;
            sumX = x1 + x2 * n;
            sumY = y1;
        } else if (y2 % y1 == 0) {
            int n = y2 / y1;
            sumX = x1 * n + x2;
            sumY = y2;
        } else {
            sumX = x1 * y2 + x2 * y1;
            sumY = y1 * y2;
        }
        Fraction fSum = new Fraction(sumX, sumY);
        return fSum;
    }

    public Fraction minus(Fraction s2) {
        int x1 = this.x;
        int y1 = this.y;
        int x2 = s2.x;
        int y2 = s2.y;
        int minusX;
        int minusY;
        if (y1 == y2) {
            minusX = x1 - x2;
            minusY = y1;
        } else if (y1 % y2 == 0) {
            int n = y1 / y2;
            minusX = x1 - x2 * n;
            minusY = y1;
        } else if (y2 % y1 == 0) {
            int n = y2 / y1;
            minusX = x1 * n - x2;
            minusY = y2;
        } else {
            minusX = x1 * y2 - x2 * y1;
            minusY = y1 * y2;
        }
        Fraction fMinus = new Fraction(minusX, minusY);
        return fMinus;
    }

    //Может вернуть строковое представление вида “числитель/знаменатель”
    public String toString() {
        String res = "";
        res += x + "/" + y;
        return res;
    }

}
/*
Может выполнять операции сложения, вычитания с другой Дробью или целым числом. Результатом операции должна быть новая Дробь
Затем необходимо выполнить следующие задачи:

Создать несколько экземпляров дробей
Посчитать f1.sum(f2).sum(f3).minus(5), где f1 это одна треть, f2 две пятых, а f3 это семь восьмых
*/

