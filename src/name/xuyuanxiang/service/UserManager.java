package name.xuyuanxiang.service;

import java.rmi.RemoteException;
import java.util.List;

import name.xuyuanxiang.common.Constants;
import name.xuyuanxiang.model.User;

import org.springframework.transaction.annotation.Transactional;

import cn.myapps.webservice.fault.UserServiceFault;

@Transactional
public class UserManager extends BaseManager<User, String> {

	public UserManager() {
		super(User.class);
	}

	public User getByUsername(String username) {
		return userDao.getByUsername(username);
	}

	public String validUsername(String username) {
		User user = getByUsername(username);
		if (user == null)
			return "账号不存在！";
		if (user.getStatus() != 1)
			return "账号已被注销！";
		if (user.getLockflag() != 1)
			return "账号已被锁定！";
		return null;
	}

	public String validPassword(String username, String password) {
		try {
			userService.validateUser(Constants.DOMAIN, username, password, 0);
			return null;
		} catch (UserServiceFault e) {
			e.printStackTrace();
			return "密码输入错误，账号已被锁定！";
		} catch (RemoteException e) {
			e.printStackTrace();
			return "网络连接错误！";
		}
	}

	public List<User> getAll() {
		return userDao.getAllDistinct();
	}

}
