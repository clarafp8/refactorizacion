package com.endes;

public class main {
	
	 // Método main que mezcla la lógica de negocio con la presentación
    public static void main(String[] args) {
        SpaghettiProducts sp = new SpaghettiProducts();
        sp.addProduct("Monitor", 250);
        sp.addProduct("Teclado", 50);
        sp.addProduct("Mouse", 25);
        sp.addProduct("Impresora", 150); // Debería activar la conversión de arrays a listas
        sp.listProducts();
        sp.findProduct("Teclado");
        sp.findProduct("Scanner");// Producto inexistente para provocar error

    }
}
