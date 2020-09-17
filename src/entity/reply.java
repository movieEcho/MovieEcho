package entity;

public class reply {
    private int replyId;
    private int level;
    private String content;
    private int replyWhoId;
    private int uid;

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReplyWhoId() {
        return replyWhoId;
    }

    public void setReplyWhoId(int replyWhoId) {
        this.replyWhoId = replyWhoId;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(int replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    private int replyCommentId;
}
