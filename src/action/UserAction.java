package action;

import po.student.*;
import po.IUserService;

public class UserAction {
	private Student loginUser;
	private IUserService userService = null;
	public Customer getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(Customer loginUser) {
		this.loginUser = loginUser;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String execute() {
		userService.register(loginUser);
		return "success";
	}
}