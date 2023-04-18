package Ordenacion;

import java.util.Scanner;

public class Listas {

	static int buscar(Integer e[], Integer b) {
		boolean encontrado = false;
		int c = 0;
		int p = e[0];
		int u = e.length;
		int m = (p + u) / 2;
		while (p <= u) {
			m = (p + u) / 2;
			if (b == e[m])
				return m;
			else if (b < e[m])
				u = m - 1;
			else
				p = m + 1;
		}
		return m;
	}

	public static void main(String[] args) {
		Integer[] Elemento = { 1, 3, 7, 16, 26, 34, 50, 72 };
		Integer num = 72;
		int prueba = 0;
		prueba = buscar(Elemento, num);
		System.out.println(prueba);
	}

}
