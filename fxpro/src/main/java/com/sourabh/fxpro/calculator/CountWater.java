package com.sourabh.fxpro.calculator;

import java.math.BigInteger;
import java.util.ArrayList;

public class CountWater {
	
	int currentHighest=0;
	int thisBlock = 0;
	BigInteger totalWater = BigInteger.valueOf(0);
	int maxHeightPosition = 0;
	int maxHeight = 0 ;
	
	
	public int getMaxHeightPosition(ArrayList<Integer> inputList)
	{
		currentHighest=0;
		maxHeightPosition = 0;
		maxHeight = 0 ;
		
		for (int i=0;i<inputList.size();i++)
		{
			if(inputList.get(i)>=maxHeight)
			{
				maxHeight = inputList.get(i);
				maxHeightPosition = i;
			}
		}
		
		return maxHeightPosition;
	}
	
	public BigInteger getTotalWaterAccumulated(ArrayList<Integer> input)
	
	{
		getMaxHeightPosition(input);
		
		for(int i = 0;i<maxHeightPosition;i++)
		{
			int hillHeight = input.get(i);
			if(hillHeight>=currentHighest)
			{
				currentHighest = hillHeight;
				continue;			
			}
			else
			{
				thisBlock = currentHighest-hillHeight;
						
				totalWater = totalWater.add(BigInteger.valueOf(thisBlock));
			}
			
		}
		
		currentHighest = 0;
		for(int i = input.size()-1;i>maxHeightPosition;i--)
		{
			int hillHeight = input.get(i);
			
			if(hillHeight>=currentHighest)
			{
				currentHighest = hillHeight;
				continue;			
			}
			else
			{
				thisBlock = currentHighest-hillHeight;
						
				totalWater = totalWater.add(BigInteger.valueOf(thisBlock));
			}
		}
		
		System.out.println("The total amount of water collected = " + totalWater);
		
		return totalWater;
	}

}
