package entity;

import java.util.Date;

public class comment {
    private int commentId;
    private int commentType;
    private String commentText;
    private int PostUserId;
    private Date commentPostTime;
    private int commentEcho;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getCommentType() {
        return commentType;
    }

    public void setCommentType(int commentType) {
        this.commentType = commentType;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getPostUserId() {
        return PostUserId;
    }

    public void setPostUserId(int postUserId) {
        PostUserId = postUserId;
    }

    public Date getCommentPostTime() {
        return commentPostTime;
    }

    public void setCommentPostTime(Date commentPostTime) {
        this.commentPostTime = commentPostTime;
    }

    public int getCommentEcho() {
        return commentEcho;
    }

    public void setCommentEcho(int commentEcho) {
        this.commentEcho = commentEcho;
    }
}
