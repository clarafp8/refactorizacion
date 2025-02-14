package com.endes;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	
	List<Product> products= new ArrayList<Product>();
	
	public void addProduct(Product p) {
        if (p.getNombre() == null || p.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre inválido");
        }
        
        if (p.getPrecio() < 0) {
           throw new IllegalArgumentException("El precio no puede ser negativo");
        }

        try {
        	 this.products.add(p);
             System.out.println("Producto agregado : " + p.getNombre());

        } catch (Exception e) {
        System.out.println("Error al agregar producto: " + e.getMessage());
    }

	}
	
	public void listProducts() {
		try {
			if(products.isEmpty()) {
	             throw new Exception("No hay productos para listar.");
			}
			for(int i=0; i<products.size(); i++) {
				
				System.out.print("Producto "+ (i+1)+ products.get(i).getNombre() + "- Precio: "+ products.get(i).getPrecio());
			}
		
			
		}catch (Exception e) {
	         System.out.println("Error en listProducts: " + e.getMessage());
	}
	}
}
