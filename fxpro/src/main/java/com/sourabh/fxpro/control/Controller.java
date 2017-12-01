package com.sourabh.fxpro.control;

import java.util.ArrayList;
import java.util.Arrays;

import com.sourabh.fxpro.calculator.CountWater;
import com.sourabh.fxpro.io.InputReader;

public class Controller {

	public static void main(String[] args) {

		ArrayList<Integer> inputList = new ArrayList<>();
		ArrayList<String> inputListStr;

		long startTime = System.currentTimeMillis();

		if(args!=null && args.length==1)
		{
			inputListStr = new ArrayList<> (Arrays.asList(args[0].split(",")));

			for(int i=0;i<inputListStr.size();i++)
			{
				inputList.add(i, Integer.parseInt(inputListStr.get(i)));
			}
		}

		else
		{
			System.out.println("entering the read from file mode. Or to keep using command line argument mode pass only 1 argument (comma seperated values)");
			InputReader readInput = new InputReader();
			inputList =  readInput.readInputFromFile("heights.txt");
		}
		CountWater obj = new CountWater();

		obj.getTotalWaterAccumulated(inputList);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("time in milliseconds to execute = " +  totalTime);

	}

}
