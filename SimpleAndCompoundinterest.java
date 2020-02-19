package com.epm.CleanCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
class CompundandSimpleInterest{
	double simpleInterest(int principal, double rate_of_interest, int time_period){
	double simple_interest = (principal * rate_of_interest * time_period) / 100;
	return simple_interest;
	}
	double compoundInterest(int principal, double rate_of_interest, int time_period){
		double compound_interest = (1+(rate_of_interest / 100));
		return compound_interest;
	}
}
public class SimpleAndCompoundInterest{
public static void main(String args[]) throws IOException{
	BufferedReader br = new BufferedReader(InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(OutputStreamWriter(System.out));
	int principal = Integer.parseInt(br.readLine());
	double rate_of_interest = Double.parseDouble(br.readLine());
	int time_period = Integer.parseInt(br.readLine());
	CompoundandSimpleInterest csi = new CompoundandSimpleInterest();
	bw.write("Simple interest = "+csi.simpleInterest(principal, rate_of_interest, time_period)+"\n");
	bw.write("Compound interest = "+csi.compoundInterest(principal, rate_of_interest, time_period));
	bw.flush();
}