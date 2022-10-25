package Objeto;

import java.util.ArrayList;
import java.util.List;

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

	public void setPreco(double quantidade_viseira) {
		this.preco = quantidade_viseira;
	}
	
	public String getProtecao() {
		return protecao;
	}

	public void setProtecao(String protecao) {
		this.protecao = protecao;
	}
	
	//metodos de classe
	
	
	public void Testar(String mat, String prot) {
		System.out.println(".................. Teste de Capacete ..................");
		System.out.println("O teste e realizado atraves da resistencia do material e da protecao");
		System.out.println("\n..... Testando......");
		System.out.println("O material: " + mat + " e bem resistente e passou no teste");
		System.out.println("A protecao: " + prot + " passou no teste tambem");
	}
	
	public void Comprar(String mat,double price, String corCapa) {
		System.out.println("\n.................. Venda de Capacete ..................");
		System.out.println("Capacete: " + mat + " com a/as cores: " + corCapa);
		System.out.println("Custa: " + " R$ " + price);
	}
	
	
	public static void main(String[] args) {
		//Criando o objeto
		
		Capacete c1 = new Capacete();
		c1.setMarca("LS2");
		c1.setMaterial("Carbono,Kevlar e Fiberglass");
		c1.setCor("Preto Fosco/Roxo");
		c1.setPreco(1500);
		c1.setProtecao("Protecaoo UV/ Cinta jugular reforcada");
		
		c1.Testar(c1.material, c1.protecao);
		c1.Comprar(c1.material, c1.preco, c1.cor);
		
		ArrayList<String> capa = new ArrayList<String>();
	}

	
}
