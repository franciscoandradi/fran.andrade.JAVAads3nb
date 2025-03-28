package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe o Base:     */");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2:     */");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3:   */");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        return true;
    }

    public void calcularArea () {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("/*********************************/");

        area = (base * altura) / 2 ;
        System.out.println("A área é: " + area);
        System.out.println("/*********************************/");
    }

    public void calcularPerimetro () {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("/*********************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*********************************/");
    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo () {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");

        if (base == lado2 && base == lado3) {

            System.out.println("Este Triângulo é Equilátero ...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

            System.out.println("Este Triângulo é Escaleno ...");

        } else {
            System.out.println("Este Triângulo é Isosceles ...");
        }
        System.out.println("/***************************************/");

    }

    //Vou criar um metodo para que ele identifique se o triangulo eh retangulo
    public boolean identificarTRetangulo(){
        System.out.println("/*********************************/");
        System.out.println("/*        Identificando..         */");
        System.out.println("/*********************************/");


        double[] lados = {base, lado2, lado3};
        java.util.Arrays.sort(lados);

        //esse é o calculo pra calcular pitagoras
        boolean ehRetangulo = Math.abs(Math.pow(lados[0], 2) + Math.pow(lados[1], 2) - Math.pow(lados[2], 2)) < 1e-9;

        //caso seja possivel fazer pitagoras entao o triangulo é retangulo
        if (ehRetangulo) {
            System.out.println("É um triângulo retângulo.");
        } else {
            System.out.println("Não é um triângulo retângulo.");
        }
        return ehRetangulo;

    }


    //Criando a função que vai analisar se o triangulo segue a proporcao 345 ou nao
    public void verificarProporcao345() {
        System.out.println("/*********************************/");
        System.out.println("/*        Verificando 3:4:5       */");
        System.out.println("/*********************************/");

        //aqui caso os lados estiverem de acordo com as condicoes entao o triangulo passa
        // da primeira parte para definir se eh 345 ou nao
        if (ehDivisivel(base) && ehDivisivel(lado2) && ehDivisivel(lado3)) {

            // aqui eh mais uma condicao para saber se o triangulo pode fazer parte dos 345
            //ele fara uma conta de subtracao para ver se o triangulo segue a proporcao dos triangulos 345
            if ((lado3 - base == base - lado2) || (lado2 - base == base - lado3)) {
                //caso o triangulo passe pelas duas condicoes que foram definidas acima entao
                //ele sera definido como um triangulo 345
                System.out.println("O triângulo é 3:4:5");
            } else {
                System.out.println("O triângulo não é 3:4:5");
            }
        } else {
            System.out.println("O triângulo não é 3:4:5");
        }
    }

    // essa funcao serve para um fazer um calculo que serve como metodo de condicao para
    // saber se o triangulo 345
    private boolean ehDivisivel(double num) {
        return num % 3 == 0 || num % 4 == 0 || num % 5 == 0;

    }
}
