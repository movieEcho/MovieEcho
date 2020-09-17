package entity;

public class actor {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getActorInfo() {
        return actorInfo;
    }

    public void setActorInfo(String actorInfo) {
        this.actorInfo = actorInfo;
    }

    private boolean gender;
    private int mid;
    private String actorInfo;
}
