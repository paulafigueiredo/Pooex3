import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Estoque1 {

	public static void main(String[] args)
	{
		Collection<String> estoque = new <String> ArrayList();
		estoque.add("Tv");
		estoque.add("Pc");
		estoque.add("Mouse");
		
		System.out.println("Dados adicionados: "  +estoque);
		
		
		//remove dados
		estoque.remove("Tv");
		System.out.println("Dados sem Tv: "  +estoque);
		
		//atualizar dados
		
		Collection<String> estoque1 = Arrays.asList("Copo");
		estoque.addAll(estoque1);
		System.out.println("Dados atualizado: "  +estoque);
		
		//apresentar
		for(String estoq: estoque)
		{
			System.out.println("Apresentaçao de  dados: " + estoq);
		}
	}

}
