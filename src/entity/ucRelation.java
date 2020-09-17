package entity;

public class ucRelation {
    private int uId;
    private int commentId;
    private int echo;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getEcho() {
        return echo;
    }

    public void setEcho(int echo) {
        this.echo = echo;
    }

    public int getComplaint() {
        return complaint;
    }

    public void setComplaint(int complaint) {
        this.complaint = complaint;
    }

    private int complaint;
}
