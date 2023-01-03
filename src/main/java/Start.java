public class Start {
    public static void main (String[] args){
        Fraction f1=new Fraction(1, 3);
        Fraction f2=new Fraction(2, 5);
        Fraction f3=new Fraction(7, 8);
        //Создать несколько экземпляров дробей
        //Посчитать f1.sum(f2).sum(f3).minus(5), где f1 это одна треть, f2 две пятых, а f3 это семь восьмых
        System.out.println(f1.sum(f2).sum(f3).fMinusInt(5));
    }
}
