public class Start {
    public static void main(String[] args) {
        Square s1 = new Square(1, 3, 10);
        System.out.println(s1);
        s1.setN(5);
        System.out.println(s1.getN());
        System.out.println(s1);
        s1.setPoint(2,4);
        System.out.println(s1.getPoint());
        System.out.println(s1);
    }

}
