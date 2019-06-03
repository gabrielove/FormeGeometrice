package formeG.Shapes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Math; 
import formeG.Constants;

public class Triunghi implements FormaGeometrica {
	
	private double l1,l2,l3;
	
	
	public Triunghi(double l1,double l2,double l3){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	
	public double Arie() {
		double SP = (l1+l2+l3)/2; //semiperimetru
		double a = Math.sqrt(SP*(SP-l1)*(SP-l2)*(SP-l3)); //formula Heron
		return a;
	}
	public double Perimetru() {
		return l1+l2+l3;
	}
	
	public void afisareArie() {
		System.out.println("Aria: " + Arie()  + " " + Constants.UnitSquared);
	}
	
	public void afisarePerimetru() {
		System.out.println("Perimetru: " + Perimetru()  + " " + Constants.Unit);
	}

	public void WriteToFile() {
		try(FileWriter fw = new FileWriter(Constants.TriangleFilePath, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println("Valoari introduse l1 = " + l1 + ", l2 = " + l2 + ", l3 = " + l3);
			    out.println("Arie Triunghi: " + Arie()  + " " + Constants.UnitSquared);
			    out.println("Perimetru Triunghi: " + Perimetru()  + " " + Constants.Unit);
			    out.println("");

			} catch (IOException e) {
			    System.out.println(e.getMessage());
			}
		
	}
}
