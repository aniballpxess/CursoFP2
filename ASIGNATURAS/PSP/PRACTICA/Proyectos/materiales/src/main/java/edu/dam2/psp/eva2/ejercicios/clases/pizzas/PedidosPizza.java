package edu.dam2.psp.eva2.ejercicios.clases.pizzas;

public class PedidosPizza {
	public static void main(String[] args) {
		Pizza p1 = new Pizza("margarita", "mediana");
		Pizza p2 = new Pizza("peperoni", "familiar");
		p2.sirve();
		Pizza p3 = new Pizza("cuatro quesos", "mediana");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.sirve();
		System.out.println("pedidas: " + Pizza.getTotalPedidas());
		System.out.println("servidas: " + Pizza.getTotalServidas());
	}
}