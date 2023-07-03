public class Cinema {
    private String nameMovie;
    private String genreMovie;
    private double lengthMovie;

    public Cinema(String nameMovie, String genreMovie, double lengthMovie) {
        this.nameMovie = nameMovie;
        this.genreMovie = genreMovie;
        this.lengthMovie = lengthMovie;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public String getGenreMovie() {
        return genreMovie;
    }

    public void setGenreMovie(String genreMovie) {
        this.genreMovie = genreMovie;
    }

    public double getLengthMovie() {
        return lengthMovie;
    }

    public void setLengthMovie(double lengthMovie) {
        this.lengthMovie = lengthMovie;
    }
}
