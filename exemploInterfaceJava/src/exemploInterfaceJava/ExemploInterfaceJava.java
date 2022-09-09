package exemploInterfaceJava;

public class ExemploInterfaceJava
{

	public static void main(String[] args)
	{
		Ferrari f1 = new Ferrari();
		f1.acelerar();
		f1.virarEsquerda();
		System.out.println("Valor da Ferrari:  " + f1.getPreco());
		
		AnelDiamante a1= new AnelDiamante();
		System.out.println("Valor do anel:  " + a1.getPreco());
	}

}
