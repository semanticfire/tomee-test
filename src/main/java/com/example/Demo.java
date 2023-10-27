package com.example;

import java.util.ArrayList;

public class Demo {
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	public ArrayList<DemoItem> list;
	
	public ArrayList<DemoItem> getList() {
		return list;
	}


	public String text;
}