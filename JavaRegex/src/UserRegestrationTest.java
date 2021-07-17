import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.bridgelab.com.UserRegisteration;
class UserRegestrationTest {

	
	@Test
	public void FirstNameValidation()
	{
		assertEquals(true,UserRegisteration.firstNameValidation("Dee"));
	}
	@Test
	public void LastNameValidation()
	{
		assertEquals(true,UserRegisteration.lastNameValidation("Men"));
	}
	
	@Test
	public void EmailValidation()
	{
		assertEquals(true,UserRegisteration.emailValidation("deepak@gmail.com"));
	}
	
	@Test
	public void PhonenumberValidation()
	{
		assertEquals(true,UserRegisteration.phonenumberValidation("07038716093"));
	}
	
	@Test
	public void PasswordValidation1()
	{
		assertEquals(true,UserRegisteration.passwordValidation1("Deepak12"));
	}
	public void PasswordValidation2()
	{
		assertEquals(true,UserRegisteration.passwordValidation2("DeepakM1"));
	}
	public void PasswordValidation3()
	{
		assertEquals(true,UserRegisteration.passwordValidation3("Deepak1@"));
	}

}
