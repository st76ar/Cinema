import java.util.ArrayList;

public class Viewer {
    private String nickname;
    private int age;
    private int countViewedMovies;

    private ArrayList<Cinema> cinemas;

    public Viewer(String nickname, int age, ArrayList<Cinema> cinemas) {
        this.nickname = nickname;
        this.age = age;
        this.countViewedMovies = cinemas.size();
        this.cinemas = cinemas;
    }

    public ArrayList<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(ArrayList<Cinema> cinemas) {
        this.cinemas = cinemas;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountViewedMovies() {
        return countViewedMovies;
    }

    public void setCountViewedMovies(int countViewedMovies) {
        this.countViewedMovies = countViewedMovies;
    }
}
