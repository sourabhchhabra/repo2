package com.sourabh.fxpro.calculator;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCountWater {

	CountWater obj = new CountWater();
	ArrayList<Integer> inputList;
	ArrayList<Integer> inputList1;
	ArrayList<Integer> inputList2;
	
	@Before
    public void setUp() throws Exception {
	
		inputList = new ArrayList<>(Arrays.asList(5,3,7,2,6,4,5,9,1,2));
		inputList1 = new ArrayList<>(Arrays.asList(8,8,4,5));
		inputList2 = new ArrayList<>(Arrays.asList(3,4,4,3,2,1,1,2,7,3,3,2,1,4));
		
	}
	
	@Test
    public void testGetMaxHeightPosition() {
        Assert.assertEquals(7, obj.getMaxHeightPosition(inputList));
        Assert.assertEquals(1, obj.getMaxHeightPosition(inputList1));
        Assert.assertEquals(8, obj.getMaxHeightPosition(inputList2));
    }

//	@Test
//	public void testGetTotalWaterAccumulated()
//	{
//		Assert.assertEquals(14, obj.getTotalWaterAccumulated(inputList));
//		Assert.assertEquals(1, obj.getTotalWaterAccumulated(inputList1));
//		Assert.assertEquals(18, obj.getTotalWaterAccumulated(inputList2));
//	}
//	
}
