package problem2;
public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable{

    @Override
    public void eatPizza(){
        System.out.println("Student eats pizza");
    }

    @Override
    public void retakeExam(){
        System.out.println("Student retakes exam");
    }

    @Override
    public void move(){
        System.out.println("Student moves");
    }

    @Override
    public void dance(){
        System.out.println("Student dances");
    }
}
