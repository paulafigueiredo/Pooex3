
public abstract class Animal {
	
	public String nome;
	public int idade;
	
	public Animal() 
	{
		super();
	}
	
	public Animal(String nome,int idade) 
	{
		this.nome = nome;
		this.idade= idade;
	}
	
	 public abstract void emitirSom(); //abstract puxa nas outras classes
	
	
	public abstract void correr();//
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	



}
