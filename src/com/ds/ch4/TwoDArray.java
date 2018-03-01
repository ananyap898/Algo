package com.ds.ch4;

import java.util.ArrayList;
import java.util.List;

public class TwoDArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Meethun");
		list.add("MAnanon");
		list.add("Kumarpa");
		list.add("Ananyap");
		
		String[][] array = new String[list.size()][];
		for(int i=0; i < array.length ; i++){
			for(int j=0 ; j< 6;j++){
				array[i][j] = list.get(i);
			}
		}
		
	}

}
