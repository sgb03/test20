import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Employee[]employees=new Employee[12];
        for (int i = 0; i < employees.length; i++) {
            employees[i]=new Employee("name_"+(i+1),random.nextInt(12,77));
        }
                for (Employee e:employees){
            System.out.println(e);
        }
    
    }
}