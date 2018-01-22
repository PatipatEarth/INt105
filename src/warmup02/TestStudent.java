package warmup02;
// 1. declare an array variable consisting of 3 Student objects
// 2. print all students object to the console using "for" and "foreach" style

public class TestStudent {

    public static void main(String[] args) {
        
        Student[] stdInfo = new Student[3];
        stdInfo[0] = new Student("Patipat");
        stdInfo[1] = new Student("Earth");
        stdInfo[2] = new Student("Kito");
        
        for(int i =0;i<stdInfo.length;i++){
            System.out.println(stdInfo[i]);
        }
        System.out.println("----------------------------");
        
        for(Student tempStd : stdInfo)
            System.out.println(tempStd.toString());


    }

}
