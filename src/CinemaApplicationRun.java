import java.util.ArrayList;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        ViewerStatistics viewerStatistics = new ViewerStatistics();
        ArrayList<Viewer> viewerArrayList = new ArrayList<>();
        ArrayList<Cinema> cinemas1 = new ArrayList<>();
        ArrayList<Cinema> cinemas2 = new ArrayList<>();
        ArrayList<Cinema> cinemas3 = new ArrayList<>();
        ArrayList<Cinema> cinemas4 = new ArrayList<>();
        ArrayList<Cinema> cinemas5 = new ArrayList<>();
        cinemas1.add(new Cinema("film1","comedy", 1.3));
        cinemas2.add(new Cinema("film2","drama", 1.4));
        cinemas3.add(new Cinema("film3","horror", 1.5));
        cinemas4.add(new Cinema("film4","adventure", 1.6));
        cinemas5.add(new Cinema("film5","fantasy", 1.7));
        viewerArrayList.add(new Viewer("User1", 25, cinemas1));
        viewerArrayList.add(new Viewer("User2", 30, cinemas2));
        viewerArrayList.add(new Viewer("User3", 20, cinemas3));
        viewerArrayList.add(new Viewer("User4", 28, cinemas4));
        viewerArrayList.add(new Viewer("User5", 35, cinemas5));
        System.out.println(viewerStatistics.averageAge(viewerArrayList));
    }
}
