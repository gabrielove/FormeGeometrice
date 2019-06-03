package formeG.Shapes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import formeG.Constants;

public class Cerc implements FormaGeometrica {
	
	private double raza;
	
	public Cerc(double r){
		raza = r;
	}
	
	public double Arie() {
		return Constants.PI*raza*raza;
	}
	public double Perimetru() {
		return 2*Constants.PI*raza	;
	}
	
	public void afisareArie() {
		System.out.println("Aria: " + Arie() + " " + Constants.UnitSquared);
	}
	
	public void afisarePerimetru() {
		System.out.println("Perimetru: " + Perimetru() + " " + Constants.Unit);
	}
	
	public void WriteToFile() {
		try(FileWriter fw = new FileWriter(Constants.CircleFilePath, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println("Valoare introdusa: " + raza);
			    out.println("Arie Cerc: " + Arie() + " " + Constants.UnitSquared);
			    out.println("Perimetru Cerc: " + Perimetru() + " " + Constants.Unit);
			    out.println("");

			} catch (IOException e) {
			    System.out.println(e.getMessage());
			}
		
	}
}
