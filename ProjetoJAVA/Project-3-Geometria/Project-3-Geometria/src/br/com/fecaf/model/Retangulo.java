package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    public double lado1, lado2, area, perimetro;

    // Instancia Scanner
    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarRetangulo() {
        System.out.println("/*************************/");
        System.out.println("/** Cadastrar Retangulo **/");
        System.out.println("/*************************/");
        System.out.print("Informe o lado 1: ");
        lado1 = scanner.nextDouble();
        System.out.println("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.println("Retangulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        return true;

    }

    public void calcularArea() {
        System.out.println("/* Calculando Area */");
        area = lado1 * lado2;
        System.out.println("A area é: " + area);
    }

    public void calcularPerimetro () {
        System.out.println("/* Calculando Perimetro */");
        perimetro = lado1 * 2 + lado2 * 2;
        System.out.println("O Perimetro é: " + perimetro);
    }

    // Define se é um Quadrado !!
    public void validarQuadrado() {
        System.out.println("/* Definindo se é quadrado */");

        if (lado1 == lado2) {
            System.out.println("Isso é um Quadrado ...");
            return;

        }
        System.out.println("Não é um Quadrado ...");
    }






}
