public class Start {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan");
        Employee e3 = new Employee("Innokent");
        Employee e4 = new Employee("Lena");
        System.out.println(e1);
        System.out.println(e3);
        System.out.println(e4);
        Department d1 = new Department("ITT", e1);
        d1.setDepartmentName("IT");
        Employee e2 = new Employee("Anton", d1);
        e3.setName("Innokentiy");
        Department d2 = new Department("Finance", e3);
        e4.setDepartment(d2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        d1.setBoss(e2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        //
    }
}
