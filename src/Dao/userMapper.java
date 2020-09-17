package Dao;
import entity.user;
public interface userMapper {
    public user selectUserByUId(int uId);
    public void createUser(user user);
    public void makeUserSilence(int uId);
    public void makeUserSpeak(int uId);
    public user selectUserByName(String uName);
}
