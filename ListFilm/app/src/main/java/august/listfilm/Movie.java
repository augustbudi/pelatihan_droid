package august.listfilm;

import android.widget.ListView;

import java.io.Serializable;

/**
 * Created by D2J-00 on 09/02/2017.
 */
public class Movie implements Serializable{
    public String title;
    public String description;
    public double rating;
    public int year;

    public Movie(String title,String description, double rating, int year){
        this.title = title;
        this.description = description;
        this.rating =rating;
        this.year=year;
    }
    public String toString(){
        return this.title;
    }
}
