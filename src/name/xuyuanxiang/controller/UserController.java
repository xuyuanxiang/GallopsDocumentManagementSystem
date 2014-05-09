package name.xuyuanxiang.controller;

import name.xuyuanxiang.model.User;
import name.xuyuanxiang.service.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Controller;

@Controller
@RemotingDestination
public class UserController {

	@Autowired
	private UserManager userManager;

	public User getByUsername(String username) {
		User user = userManager.getByUsername(username);
		return user;
	}

	public String validUsername(String username) {
		return userManager.validUsername(username);
	}

	public String validPassword(String username, String password) {
		return userManager.validPassword(username, password);
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

}
