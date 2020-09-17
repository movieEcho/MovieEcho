package entity;

public class umRelation {
    private int uId;
    private int mid;
    private int echo;
    private boolean isLike;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getEcho() {
        return echo;
    }

    public void setEcho(int echo) {
        this.echo = echo;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean like) {
        isLike = like;
    }
}
