package entity;

public class user {
    private int uId;
    private String uName;
    private String password;
    private String gender;
    private String uHobby;
    private boolean uStatus;

    public user(String uName, String password, String gender, String uHobby, boolean uStatus) {
        this.uName = uName;
        this.password = password;
        this.gender = gender;
        this.uHobby = uHobby;
        this.uStatus = uStatus;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String isGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getuHobby() {
        return uHobby;
    }

    public void setuHobby(String uHobby) {
        this.uHobby = uHobby;
    }

    public boolean getuStatus() {
        return uStatus;
    }

    public void setuStatus(boolean uStatus) {
        this.uStatus = uStatus;
    }
}
