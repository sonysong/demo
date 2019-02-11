/**
 * 
 */
package com.alliance.entitlements.swagger.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hongyi.a.song
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StatusTest {

	private static Validator validator;

	@BeforeClass
	public static void setUpValidator() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void statusCodeIsBlank() {
		Status status = new Status();

		status.setStatusCode(" ");
		status.setText("Open");

		Set<ConstraintViolation<Status>> constraintViolations = validator.validate(status);

		assertEquals(1, constraintViolations.size());
		assertEquals("may not be empty", constraintViolations.iterator().next().getMessage());
	}

	@Ignore
	public void test() {
		fail("Not yet implemented");
	}

}
