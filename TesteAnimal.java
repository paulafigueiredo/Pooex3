
public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro thor = new Cachorro();
		Cavalo pernaDePano = new Cavalo();
		Preguica lerdin = new Preguica();
		
		thor.setNome("Thor");
		System.out.println("Nome do animal:  " + thor.getNome());
		thor.setIdade(2);
		System.out.println("Idade do Animal: " +thor.getIdade());
		thor.emitirSom();
		thor.correr();
		System.out.println("\n");
		
		
		
		pernaDePano.setNome("Perna de pano");
		System.out.println("Nome do animal: " + pernaDePano.getNome());
		pernaDePano.setIdade(34);
		System.out.println("Idade do Animal: " +pernaDePano.getIdade());
		pernaDePano.emitirSom();
		pernaDePano.correr();
		System.out.println();
		
		
		lerdin.setNome("Lerdin");
		System.out.println("Nome do animal:" + lerdin.getNome());
		lerdin.setIdade(31);
		System.out.println("Idade do Animal: "+ lerdin.getIdade());
		lerdin.emitirSom();
		lerdin.correr();
		
		
		
		
		
		
	}

}
