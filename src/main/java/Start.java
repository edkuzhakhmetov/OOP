public class Start {
    public static void main (String[] args){
        //1
        int [] arr={5,5,3,4,2,4};
        Student s1 =new Student("Ant",arr);
        System.out.println(s1);
        //2
        Student s2 =new Student("Ivan");
        System.out.println(s2);
        //
        s2.addScores(arr);
        System.out.println(s2);
        //System.out.println(s1.getScoresList()==s2.getScoresList());
        //
        int [] arr2={2,3};
        s1.setName("Anton");
        s1.addScores(arr2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
