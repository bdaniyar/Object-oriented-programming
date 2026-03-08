package lab2.problem5;

public class PhDStudent extends Student {

    private String researchField;

    public PhDStudent(String name, int age, String major, String researchField){
        super(name, age, major);
        this.researchField = researchField;
    }

    @Override
    public void assignPet(Animal pet){

        if(pet instanceof Dog){
            System.out.println("PhD students cannot own dogs.");
            return;
        }

        super.assignPet(pet);
    }

    @Override
    public String getOccupation(){
        return "PhD Student (" + researchField + ")";
    }
}