package entities;

public class Student {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double notaFinal;
	public boolean passou;
	public double notaFaltante;
	
	public String avaliacaoFinal() {
		notaFinal = nota1 + nota2 + nota3;
		String texto;
		if (notaFinal >= 60.0) {
			passou = true;
			texto = "\nFINAL GRADE = " 
					+ String.format("%.2f", notaFinal)
					+ "\nPASS";
		} else {
			passou = false;
			notaFaltante = 60.0 - notaFinal;
			texto = "\nFINAL GRADE = " 
					+ String.format("%.2f", notaFinal)
					+ "\nFAILED"
					+ "\nMISSING "
					+ String.format("%.2f", notaFaltante) 
					+ " POINTS";
		}
		return texto;	
	}

}
