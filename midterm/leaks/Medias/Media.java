package midterm.leaks.Medias;

public class Media {
    protected String title;

    public Media(String title){
        this.title = title;
    }

    public void play(){
        System.out.println("Playing media");
    }

    public String getTitle(){
        return title;
    }
    
}
