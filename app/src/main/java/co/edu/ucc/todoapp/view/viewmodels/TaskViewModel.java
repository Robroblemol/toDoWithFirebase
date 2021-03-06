package co.edu.ucc.todoapp.view.viewmodels;

/**
 * Created by jggomez on 23-Mar-18.
 */

public class TaskViewModel {

    private String name;
    private String date;
    private String uriImage;
    private boolean done;


    public void setDate(String date) {
        this.date = date;
    }
    public String getDate(){
        return date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUriImage() {
        return uriImage;
    }

    public void setUriImage(String uriImage) {
        this.uriImage = uriImage;
    }
}
