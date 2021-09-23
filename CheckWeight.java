package com.customexception;

public class CheckWeight {

	public static String limitCheck(int weight) throws WeightOutOfBoundException{
		if(weight <1)
			throw new WeightOutOfBoundException("No Luggage found on the scale");
		else if(weight>15)
			throw new WeightOutOfBoundException("The luggage weight exceeds the limit allowed.");
		else
		{
			return "The luggage is successfully registered";
		}
		
	}
}
