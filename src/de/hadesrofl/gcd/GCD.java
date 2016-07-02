package de.hadesrofl.gcd;

import java.util.List;

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
 * <strong>Packages:</strong> de.hadesrofl.gcd
 * </p>
 * <p>
 * <strong>File:</strong> GCD.java
 * </p>
 * <p>
 * <strong>last update:</strong> 02.07.2016
 * </p>
 * <p>
 * <strong>Time:</strong> 12:35:38
 * </p>
 * <strong>Description:</strong>
 * <p>
 * Gets the GCD (Greatest Common Divisor) of a list of values or two values.
 * </p>
 *
 * @see <a href="https://en.wikipedia.org/wiki/Greatest_common_divisor">Wiki:
 *      GCD</a>
 *
 * @author Rene Kremer
 * @version 1.0
 */
public class GCD {
	/**
	 * Private Method to get the gcd of two values
	 *
	 * @param a
	 *            is the first value
	 * @param b
	 *            is the second value
	 * @return the gcd of the first and second value
	 */
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	/**
	 * Returns the gcd of the values of the list
	 *
	 * @param list
	 *            is the list
	 * @param iMin
	 *            is the start value of the list
	 * @param iMax
	 *            is the max value of the list (size - 1)
	 * @return the gcd of the values of the list
	 */
	public static int gcdList(List<Integer> list, int iMin, int iMax) {
		if (iMin < iMax) {
			int middle = (iMin + iMax) / 2;
			int d1 = 0;
			int d2 = 0;
			int tmp = 0;
			/* Sequential way to code this */

			// Case for length 2
			if (middle == 0) {
				return gcd(list.get(0), list.get(1));
			}
			// Case for length 3
			else if (middle == 1) {
				d1 = gcd(list.get(0), list.get(1));
				return gcd(d1, list.get(2));
			}
			// Everything else
			else if (d1 == 0 && middle >= 2) {
				d1 = gcd(list.get(0), list.get(1));
				for (int i = 2; i < middle; i++) {
					tmp = gcd(d1, list.get(i));
					if (tmp < d1)
						d1 = tmp;
				}
				d2 = gcd(list.get(middle), list.get(middle + 1));
				for (int i = middle; i < list.size(); i++) {
					tmp = gcd(d2, list.get(i));
					if (tmp < d2)
						d2 = tmp;
				}
			}
			/* Sequential end */

			/* Recursive way to code this */
			// int d1 = getGCD(a, iMin, middle);
			// int d2 = getGCD(a, middle + 1, iMax);
			/* Recursive end */
			return gcd(d1, d2);
		}
		// Case for length 1
		return 0 <= iMin && iMin < list.size() ? list.get(iMin) : 0;
	}
}
