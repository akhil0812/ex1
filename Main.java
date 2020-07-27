package com.design.bridge.main;

import com.design.bridge.color.GreenColor;
import com.design.bridge.color.RedColor;
import com.design.bridge.shape.Pentagon;
import com.design.bridge.shape.Shape;
import com.design.bridge.shape.Triangle;

public class Main {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();

	}

}
