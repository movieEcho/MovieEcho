package service;
import Dao.userMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.core.config.plugins.ResolverUtil;
import util.MybatisUtils;
import entity.user;

import java.io.InputStream;

public class UserService {
    public static void createUser(user user){
        InputStream inputStream =
                ResolverUtil.Test.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new
                SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory =
                sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        userMapper userMapper  = sqlSession.getMapper(userMapper.class);
    userMapper.createUser(user);
    sqlSession.commit();
    sqlSession.close();
    }
    public static user findUserByUId(int uId){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper userMapper  = sqlSession.getMapper(userMapper.class);
        user user=userMapper.selectUserByUId(uId);
        return user;
    }
    public static user findUserByUName(String uName){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper userMapper  = sqlSession.getMapper(userMapper.class);
        user user=userMapper.selectUserByName(uName);
        return user;
    }
    public static void setUserStatus(int uId,boolean status){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        userMapper userMapper  = sqlSession.getMapper(userMapper.class);
        if(status){
            userMapper.makeUserSpeak(uId);

        }
        else {
            userMapper.makeUserSilence(uId);
        }
        sqlSession.commit();
        sqlSession.close();
    }
    public static void main(String[] args){
        int id=3;
        user u=findUserByUId(id);

    }
}
