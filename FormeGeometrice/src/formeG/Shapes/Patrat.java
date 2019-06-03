package formeG.Shapes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import formeG.Constants;

public class Patrat implements FormaGeometrica {
	
	private double latura;
	
	public Patrat(double l){
		latura = l;
	}
	
	public double Arie() {
		return latura*latura;
	}
	public double Perimetru() {
		return 4*latura;
	}
	
	public void afisareArie() {
		System.out.println("Aria: " + Arie());
	}
	
	public void afisarePerimetru() {
		System.out.println("Perimetru: " + Perimetru());
	}

	public void WriteToFile() {
		try(FileWriter fw = new FileWriter(Constants.SquareFilePath, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println("Valoare introdusa: " + latura);
			    out.println("Arie Patrat: " + Arie() + Constants.UnitSquared);
			    out.println("Perimetru Patrat: " + Perimetru() + Constants.Unit);
			    out.println("");
			    
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		
	}
}
