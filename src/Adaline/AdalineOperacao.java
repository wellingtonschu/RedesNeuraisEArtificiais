package Adaline;

public class AdalineOperacao {

	public static void main(String[] args) {
		double[] pesos = { 0.01222577719907951, 0.004762759645191947, -0.009727417287218335, 0.0020898259147021994 };

		double[][] amostras = new double[][] {
				{-1.0, -1.0, -1.0, -1.0 },
				{ 0.1,  0.3,  0.6,  0.5 },
				{ 0.4,  0.7,  0.9,  0.7 },
				{ 0.7,  0.2,  0.8,  0.1 }};

		double[] saidas = new double[] { 1.0, -1.0, -1.0, 1.0 };

		double eqmMedio = Eqm.calculateEQM(amostras, saidas, pesos);

		System.out.println("EQM medio " + eqmMedio);
	}

}
