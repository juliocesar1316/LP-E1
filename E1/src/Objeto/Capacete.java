package Objeto;

public class Capacete {
	//Atributos
	private String marca;
	private String material;
	private String cor;
	private double preco;
	private String protecao;
	
	//Metodo de acesso
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(Integer quantidade_viseira) {
		this.preco = quantidade_viseira;
	}
	
	public String getProtecao() {
		return protecao;
	}

	public void setProtecao(String protecao) {
		this.protecao = protecao;
	}
	
	//metodos de classe
	
	public String Colocar(String modelo) {
		System.out.println("O modelo: " +  modelo + "é o melhor do mercado"); //Marca do capacete
	}
	public String Testar(String mat, String prot) {
		System.out.println("O teste é realizado atraves da resistencia do material e da proteção");
		System.out.println("..... Testando");
		System.out.println("o material: " + mat + "é bem resistente e passou no teste");
		System.out.println("A protecao: " + prot + "passou no teste tambem");
	}
	
	public String Comprar(String mat,int price, String corCapa) {
		System.out.println("O capacete: " + mat + "com a/as cores: " + );
	
	}
	
	
	public static void main(String[] args) {
		
	}

	
}
