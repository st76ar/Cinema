import java.util.List;

public class ViewerStatistics {
    public double averageAge(List<Viewer> viewerList){

        if (viewerList == null || viewerList.isEmpty()) {
            return 0.0;
        }
        int sumAge = 0;
        for (Viewer viewer : viewerList) {
            sumAge += viewer.getAge();
        }
        return (double) sumAge / viewerList.size();
    }
}
