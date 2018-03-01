package com.ds.ch4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * This program sorts n Strings using Radix Sort ( LSD mechanism)
 * 
 * @author ananyap
 *
 */
public class LSDSort {

	private static final String path = System.getProperty("user.dir");

	public static void main(String[] args) {

		System.out.println(System.getProperty("user.dir"));

		/*
		 * for(int i=0 ; i< 900; i++){ createRandomStrings(); }
		 */

		long start_time = System.currentTimeMillis();

		try {
			System.out.print("Please specify the input file (default = f.txt): ");
			Scanner input = new Scanner(System.in);

			String fileName = input.nextLine();

			if (fileName.equals("")) {
				fileName = "f.txt";
			}
			File file = new File(path + "/src/" + fileName);
			input = new Scanner(file);
			String line = null;
			List<String> list = new ArrayList<String>();

			while (input.hasNextLine()) {
				line = input.nextLine();

				if (line.length() != 21) {
					line = padRight(line);
				}
				list.add(line);
			}
			input.close();
			String[] array = list.toArray(new String[list.size()]);
			sort(array, 21);
			createOutPutFile(array);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		long end_time = System.currentTimeMillis();
		long total = end_time - start_time;
		System.out.println("\nTotal Time Taken: " + total + " ms......");

	}

	/**
	 * This method writes the sorted output in a new file : g.txt
	 * 
	 * @param array
	 * @throws IOException
	 */
	private static void createOutPutFile(String[] array) throws IOException {
		BufferedWriter bufferedWriter = null;
		try {
			File myFile = new File(path + "/src/" + "g.txt");
			Writer writer = new FileWriter(myFile);
			bufferedWriter = new BufferedWriter(writer);
			for (String s : array) {
				bufferedWriter.write(s);
				bufferedWriter.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			bufferedWriter.close();
		}
	}

	/**
	 * This method sorts the String values on leading size using LSD principle.
	 * 
	 * @param a
	 * @param W
	 */
	public static void sort(String[] a, int size) {

		int len = a.length;
		int S = 256; // Ascii albhabet size
		String[] str = new String[len];
		for (int d = size - 1; d >= 0; d--) {
			// Compute frequency counts.
			int[] count = new int[S + 1];

			for (int i = 0; i < len; i++) {
				count[a[i].charAt(d) + 1]++;
			}

			for (int r = 0; r < S; r++) {// Transform counts to indices.
				count[r + 1] += count[r];
			}
			// Move the data.
			for (int i = 0; i < len; i++) {
				str[count[a[i].charAt(d)]++] = a[i];
			}
			// Copy to the array.
			for (int i = 0; i < len; i++) {
				a[i] = str[i];
			}
		}
	}

	/**
	 * This method is used for right padding
	 * 
	 * @param s
	 * @return
	 */
	public static String padRight(String s) {
		return String.format("%1$-" + 21 + "s", s);
	}

	private static void createRandomStrings() {
		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 21; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		System.out.println(output);
	}

}
