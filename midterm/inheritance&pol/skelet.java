public class skelet {
    private final int id;
    private String name;

    public static int counter = 0;
    {
        counter++;
    }

    public skelet(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args){
        skelet user = new skelet(1,"Daniyar");
        System.out.println(user.getId());
        System.out.println(user.getName());
    }
}
