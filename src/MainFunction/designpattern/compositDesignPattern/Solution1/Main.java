package MainFunction.designpattern.compositDesignPattern.Solution1;


public class Main {
    public static void main(String args[]){

        Directory movieDirectory = new Directory("Movie");

        FileSystem border = new File("Border");
        movieDirectory.add(border);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        File hungma = new File("Hunagam");
        comedyMovieDirectory.add(hulchul);
        comedyMovieDirectory.add(hungma);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();

    }
}
