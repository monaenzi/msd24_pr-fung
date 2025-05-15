package at.fhj.at;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class UserValidatorTest {
  private UserValidator uservalidator;

  @BeforeEach
  void setup(){
    uservalidator = new UserValidator();

  }
  
  @Test
  void testFiveDigits(){
    boolean result = uservalidator.isValidUsername("monae");
    assertEquals(false, result);
  }

  @Test
  void testTwelveDigits(){
    boolean result = uservalidator.isValidUsername("monaenz12345");
    assertEquals(true, result);
  }
}
