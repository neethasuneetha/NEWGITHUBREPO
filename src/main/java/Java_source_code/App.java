package Java_source_code;

import java.util.ResourceBundle;

public class App {
	
	public int usrlogin(String in_user,String in_pwd)
	{
		ResourceBundle rb =ResourceBundle.getBundle("config");
		String username= rb.getString("username");//valid data
		String password= rb.getString("password");//valid data
		if(in_user.equals(username) && in_pwd.equals(password) )//compare user Name and password
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
