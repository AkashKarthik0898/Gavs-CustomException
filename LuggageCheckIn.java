package com.customexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuggageCheckIn {

	public static void main(String args[]) {
		while (true) {
			try {
				BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the luggage weight");
				String s = CheckWeight.limitCheck(Integer.parseInt(read.readLine()));
				if(s.equals("The luggage is successfully registered")) {
					System.out.println(s);
					System.exit(0);
				}
					

			} catch (WeightOutOfBoundException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
