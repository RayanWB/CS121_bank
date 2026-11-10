// User.java

import java.util.*;

public abstract User implements HasMenu {
	private String userName;
	private String PIN;
	
	public boolean login();
	public boolean login(username, PIN);
	public String getUserName();
	public void setUserName(userName);
	public String getPIN();
	public void setPIN();
	abstract String getReport();
} // end class def
