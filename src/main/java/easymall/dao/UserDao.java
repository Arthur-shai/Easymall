package easymall.dao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import easymall.po.User;
@Repository("userDao")
@Mapper
public interface UserDao {
	//用户登录功能，返回User类对象 
	public User login(User user);
	
    //检查用户是否已被注册 
	public User checkUsername(String username);
	
	//注册用户
	public int regist(User user);
}
