package de.hadesrofl.launcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
 *
 * <strong>Project:</strong> GCD
 * <p>
 * <strong>Packages:</strong> de.hadesrofl.launcher
 * </p>
 * <p>
 * <strong>File:</strong> Launcher.java
 * </p>
 * <p>
 * <strong>last update:</strong> 02.07.2016
 * </p>
 * <p>
 * <strong>Time:</strong> 12:36:14
 * </p>
 * <strong>Description:</strong>
 * <p>
 * Launcher for the Example App for the {@link de.hadesrofl.gcd.GCD GCD}
 * Calculation
 * </p>
 *
 * @author Rene Kremer
 * @version 1.0
 */
public class Launcher {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner scanny = new Scanner(System.in);
		try {
			while (scanny.hasNextInt()) {
				list.add(scanny.nextInt());
			}
			int sz = list.size();
			if (sz > 0) {
				System.out.println("gcd = " + GCD.gcdList(list, 0, sz - 1));
			}
		} finally {
			scanny.close();
		}
	}
}
