package com.training.springclasses.CarTyre;

public class Car
{
	private  Tyre tyreModel;
	
	private String carColor;
	
	public Car(Tyre tyreModel)
	{
		
		this.setTyreModel(tyreModel);	
		
	}

	public Car() {
		super();
	}

	public String getCarColor() 
	{
		return carColor;
	}

	public void setCarColor(String carColor)
	{
		this.carColor = carColor;

	}



	public Tyre getTyreModel() {
		return tyreModel;
	}

	public void setTyreModel(Tyre tyreModel) {
		this.tyreModel = tyreModel;
	}
	
	
	public void drive()
	{
		
		System.out.println("I am driving ");
		
		//getBeanName()
	}
}

