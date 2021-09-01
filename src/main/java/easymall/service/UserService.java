package easymall.service;

import easymall.po.User;

public interface UserService {
	//用户登录功能，返回User类对象 
	public User login(User user);
	
	//检查用户是否已被注册 
	public Boolean checkUsername(String username);
	
	//注册用户
	public int regist(User user);
	
	
}
