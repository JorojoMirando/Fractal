package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("FRACTAL SIMPLES...\n\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a forma geométrica que deseja (C - Círculo, Q - Quadrado): ");

        String forma = scanner.next().toUpperCase();

        if(!(forma.equals("C") || forma.equals("Q"))) {
            System.out.println("Não foi escolhido uma forma válida!\n\nEncerrando aplicação...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(1);
        }
        else {
            try {
                int idForma;
                if(forma.equals("C"))
                    idForma = FormaGeometricaEnum.CIRCULO.getId();
                else
                    idForma = FormaGeometricaEnum.QUADRADO.getId();
                System.out.println("Forma escolhida: " + (idForma == 1 ?
                        FormaGeometricaEnum.CIRCULO.toString() : FormaGeometricaEnum.QUADRADO.toString()));
                System.out.println("Informe o tamanho inicial " +
                        (idForma == 1 ? "do raio " : "do lado ") + "de 10 a 100 (px): ");
                int tamanho = scanner.nextInt();
                System.out.println("Informe a quantidade de interações 1 a 20: ");
                int interacoes = scanner.nextInt();
                Fractal f = new Fractal(tamanho, interacoes,
                        (idForma == 1 ? FormaGeometricaEnum.CIRCULO : FormaGeometricaEnum.QUADRADO));
                Fractal.GeraArquivoSVG(f);
            } catch (Exception e)
            {
                System.out.println((e.getClass().equals(InputMismatchException.class) ? "Erro ao converter dados!" : e.getMessage()) );
            }
            scanner.close();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(1);
        }
    }
}
