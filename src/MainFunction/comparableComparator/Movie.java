package MainFunction.comparableComparator;

import java.util.Comparator;

public class Movie implements java.lang.Comparable <Movie>{
    public String name;
    public double rating;
    public int yearOfRelease;

    @Override
    public int compareTo(Movie o) {
        System.out.println(this.yearOfRelease+" "+o.yearOfRelease);
        return this.yearOfRelease-o.yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public Movie(String name, double rating, int yearOfRelease) {
        this.name = name;
        this.rating = rating;
        this.yearOfRelease = yearOfRelease;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}

class SortByName implements Comparator<Movie>{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.name.compareTo(o2.name);
    }
}
