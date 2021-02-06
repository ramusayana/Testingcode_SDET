package com.corejava;

public class ChromeBrowser extends BaseClass{
	
  // overriding is same syntax but implementation is different
	public void uploadImg() {
		System.out.println("Upload JPG");
	}
	
	public static void main(String[] args) {
		
		ChromeBrowser obj1 = new ChromeBrowser();
		BaseClass obj2 = new BaseClass();
		
		obj1.uploadImg();
		obj2.uploadImg();
		
	}

}
