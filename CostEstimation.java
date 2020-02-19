package com.epm.CleanCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
class CostDetection{
	public double cost(String material_standard, double square_feet){
		double cost = 0.0;
		if(material_standard.equals("standardmaterial")){
			cost = 1200 * square_feet;
		}
		else if(material_standard.equals("abovestandardmaterial")){
			cost = 1500 * square_feet;
		}
		else if(material_standard.equals("highstandardmaterial")){
			cost = 1800 * square_feet;
		}
		else if(material_standard.equals("highstandardmaterialandfullyautomatic")){
			cost = 2500 * square_feet;
		}
		return cost;
	}
}
public class CostEstimation{
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		double square_feet = Double.parseDouble(br.readLine());
		String material_standard = br.readLine();
		CostDetection cd = new CostDetection();
		bw.write("Total Construction cost =" + c.cost(material_standard, square_feet));
		bw.flush();
	}
}