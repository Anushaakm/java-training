package com.anu.fileHandling;

import java.io.Serializable;

public class Car implements Serializable{
int i;
String string;
boolean b;
	public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}
public String getString() {
	return string;
}
public void setString(String string) {
	this.string = string;
}
public boolean isB() {
	return b;
}
public void setB(boolean b) {
	this.b = b;
}
	public Car(int i, String string, boolean b) {
		// TODO Auto-generated constructor stub
	}

}
