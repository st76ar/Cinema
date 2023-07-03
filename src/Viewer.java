public class Viewer {
    private String nickname;
    private int age;
    private int countViewedMovies;

    public Viewer(String nickname, int age, int countViewedMovies) {
        this.nickname = nickname;
        this.age = age;
        this.countViewedMovies = countViewedMovies;
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
