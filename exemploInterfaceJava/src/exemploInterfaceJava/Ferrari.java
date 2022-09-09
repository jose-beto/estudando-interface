package exemploInterfaceJava;

public class Ferrari implements Automovel, itemCaro
{
	
@Override	
public void virarEsquerda()
{

System.out.println("Virando a esquerda");
}

public void acelerar()
{
	System.out.println("Acelerando");
	
}

public double getPreco() 
{
	
	return 150000;
}

}