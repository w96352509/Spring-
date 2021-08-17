package com.study.spring.case03.modle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Page {
	 @Autowired
	private Size size;
  @Autowired
	private Color color ;
public Size getSize() {
	return size;
}
public void setSize(Size size) {
	this.size = size;
}
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}
@Override
public String toString() {
	return "Page [size=" + size + ", color=" + color + "]";
}
  
  
	
}
