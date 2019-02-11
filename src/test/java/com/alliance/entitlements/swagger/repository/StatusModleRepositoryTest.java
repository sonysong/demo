/**
 * 
 */
package com.alliance.entitlements.swagger.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;




/**
 * @author hongyi.a.song
 *
 */
public class StatusModleRepositoryTest {

	@Autowired
	StatusModleRepository repository;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link org.springframework.data.jpa.repository.JpaRepository#findAll()}.
	 */
	@Test
	public void testFindAll() {
		assertEquals(0l, repository.count());
		assertTrue(repository.findAll().isEmpty());
	}

}
