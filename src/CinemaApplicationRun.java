import java.util.ArrayList;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        ViewerStatistics viewerStatistics = new ViewerStatistics();
        ArrayList<Viewer> viewerArrayList = new ArrayList<>();
        viewerArrayList.add(new Viewer("User1", 25, 10));
        viewerArrayList.add(new Viewer("User2", 30, 15));
        viewerArrayList.add(new Viewer("User3", 20, 5));
        viewerArrayList.add(new Viewer("User4", 28, 12));
        viewerArrayList.add(new Viewer("User5", 35, 20));
        System.out.println(viewerStatistics.averageAge(viewerArrayList));
    }
}
