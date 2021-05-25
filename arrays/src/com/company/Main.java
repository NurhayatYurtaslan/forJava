package com.company;

public class Main {

    public static void main(String[] args) {
	String [] mahserin3atlisi = new String[3];
	mahserin3atlisi[0]="Nurhayat";
	mahserin3atlisi[1]="Ceylan";
	mahserin3atlisi[2]="Murat";

	for (int i=0;i< mahserin3atlisi.length;i++){
	    System.out.println("mahserin 3 atlısı:"+ mahserin3atlisi[i]);
    }
	System.out.println("-----------------------------------------------------------");
	for (String mahserin3Atlisi : mahserin3atlisi)
	{
		System.out.println(mahserin3Atlisi);
	}

	



    }
}
