package de.hadesrofl.gcd.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.hadesrofl.gcd.GCD;

/**
 * <strong>License:</strong>
 * <p>
 * Copyright 2016 René Kremer
 * </p>
 *
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * </p>
 *
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * </p>
 *
 * </p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * </p>
 * <strong>Project:</strong> GCD
 * <p>
 * <strong>Packages:</strong> de.hadesrofl.gcd.test
 * </p>
 * <p>
 * <strong>File:</strong> GCDTest.java
 * </p>
 * <p>
 * <strong>last update:</strong> 02.07.2016
 * </p>
 * <p>
 * <strong>Time:</strong> 12:42:02
 * </p>
 * <strong>Description:</strong>
 * <p>
 * Test Cases to check if the {@link de.hadesrofl.gcd.GCD GCD} works as
 * intended.
 * </p>
 *
 * @author Rene Kremer
 * @version 1.0
 */
public class GCDTest {
	List<Integer> list = new ArrayList<Integer>();

	/**
	 * Test for the gcd of two values
	 */
	@Test
	public void testGCD() {
		int result = GCD.gcd(4, 8);
		assertEquals(4, result);
	}

	/**
	 * Test for the list size of 1
	 */
	@Test
	public void testLength1() {
		list.add(8);
		int result = GCD.gcdList(list, 0, list.size() - 1);
		assertEquals(8, result);
	}

	/**
	 * Test for the list size of 2
	 */
	@Test
	public void testLength2() {
		list.add(8);
		list.add(6);
		int result = GCD.gcdList(list, 0, list.size() - 1);
		assertEquals(2, result);
	}

	/**
	 * Test for the list size of 3
	 */
	@Test
	public void testLength3() {
		list.add(9);
		list.add(81);
		list.add(27);
		int result = GCD.gcdList(list, 0, list.size() - 1);
		assertEquals(9, result);
	}

	/**
	 * Test for the list size of 4
	 */
	@Test
	public void testLength4() {
		list.add(8);
		list.add(6);
		list.add(4);
		list.add(2);
		int result = GCD.gcdList(list, 0, list.size() - 1);
		assertEquals(2, result);
	}

	/**
	 * Test for the list size of 6
	 */
	@Test
	public void testLength6() {
		list.add(15);
		list.add(21);
		list.add(9);
		list.add(12);
		list.add(6);
		list.add(3);
		int result = GCD.gcdList(list, 0, list.size() - 1);
		assertEquals(3, result);
	}

	/**
	 * Test for the list size of 8
	 */
	@Test
	public void testLength8() {
		list.add(16);
		list.add(8);
		list.add(12);
		list.add(4);
		list.add(18);
		list.add(9);
		list.add(81);
		list.add(243);
		int result = GCD.gcdList(list, 0, list.size() - 1);
		assertEquals(1, result);
	}

}
