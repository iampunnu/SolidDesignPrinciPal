package MainFunction.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Comparable {
    public static void main(String[] args) {
        Movie m=new Movie("karan arjun",9.3,1994);
        Movie m1=new Movie("dilwale ",9.6,1992);
        Movie m2=new Movie("ddlg",10,1996);
        Movie m3=new Movie("hum aapkehai kon",8.9,1993);
        Movie m4=new Movie("khiladi",8.5,1998);
        Movie m5=new Movie("mkta",9.2,1990);
        Movie m6=new Movie("mkta",9.2,1993);

        List<Movie> movies=new ArrayList<>();
        movies.add(m);movies.add(m1);movies.add(m2);movies.add(m3);movies.add(m4);movies.add(m5);movies.add(m6);

        for (Movie movie:movies){
            movie.compareTo(m1);
        }
        /*for (Movie  movie:movies){
            System.out.println(movie.toString());
        }
        System.out.println();
        Collections.sort(movies);
        for (Movie  movie:movies){
            System.out.println(movie.toString());
        }

        SortByName sortByName = new SortByName();
        Collections.sort(movies,sortByName);
        System.out.println();
        for (Movie  movie:movies){
         //   System.out.println(movie.toString());
        }
        Collections.sort(movies,(k1,k2)->{if (k1.getRating() < k2.getRating())
            return -1;
            if (k1.getRating() > k2.getRating())
                return 1;
            else
                return 0;});
        System.out.println();
        for (Movie  movie:movies){
          //  System.out.println(movie.toString());
        }
        System.out.println(movies);*/

    }
}
