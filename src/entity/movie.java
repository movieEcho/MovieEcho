package entity;
public class movie {
  private int movieId;
  private String movieTitle;
    private String movieInfo;
    private String movieGerne;
  private String movieDirector;
  private int moviePostYear;
    public movie(int movieId, String movieTitle, String movieInfo, String movieGerne, String movieDirector, int moviePostYear) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieInfo = movieInfo;
        this.movieGerne = movieGerne;
        this.movieDirector = movieDirector;
        this.moviePostYear = moviePostYear;
    }
    public  movie(int movieId){
        this.movieId=movieId;
    }
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(String movieInfo) {
        this.movieInfo = movieInfo;
    }

    public String getMovieGerne() {
        return movieGerne;
    }

    public void setMovieGerne(String movieGerne) {
        this.movieGerne = movieGerne;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public int getMoviePostYear() {
        return moviePostYear;
    }

    public void setMoviePostYear(int moviePostYear) {
        this.moviePostYear = moviePostYear;
    }


}
