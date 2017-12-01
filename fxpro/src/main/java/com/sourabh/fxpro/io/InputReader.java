package com.sourabh.fxpro.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputReader {
	
	List<String> heightsArrayStr = new ArrayList<>();
	ArrayList<Integer> heightsArray = new ArrayList<>();

	public ArrayList<Integer> readInputFromFile(String filePath) {
		
		ClassLoader classLoader = getClass().getClassLoader();
		 File file = new File(classLoader.getResource(filePath).getFile());

		try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {

			String input="",inputHeights ="" ;

			while ((input = br.readLine()) != null) {
				System.out.println(input);
				inputHeights=input;
			}
			
			heightsArrayStr = Arrays.asList(inputHeights.split(","));
			
			for(int i=0;i<heightsArrayStr.size();i++)
			{
				heightsArray.add(i, Integer.parseInt(heightsArrayStr.get(i)));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return heightsArray;

	}

	
}
