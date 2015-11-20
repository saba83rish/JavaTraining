package com.training.springclasses.Day2;

import org.easymock.EasyMock;

import com.training.springclasses.CarTyre.Car;
import com.training.springclasses.CarTyre.Tyre;


import junit.framework.TestCase;


public class FactoryTest extends TestCase
{

	private Tyre Michelin;
	
	
	
	Car cartest;

	
	public void testBean()
	{
		cartest= EasyMock.createMock(Car.class);
		EasyMock.expect(cartest.getTyreModel()).andReturn(Michelin);
		EasyMock.replay(cartest);
		
			
		assertSame("Expected and Actual are same",cartest.getTyreModel(),Michelin);
		
		EasyMock.verify(cartest);
		
		
	}
	
	
}
