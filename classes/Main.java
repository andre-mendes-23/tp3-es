package classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exibirMenuPrincipal();
    }

    public static void exibirMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\nMenu Principal");
            System.out.println("1. Figuras Planas");
            System.out.println("2. Figuras Não Planas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
                  
            switch (opcao) {
                case 1:
                    exibirMenuFigurasPlanas();  
                    System.out.flush();  
                    break;
                
                case 2:
                    exibirMenuFigurasNaoPlanas();
                    System.out.flush();
                    break;
                    
                case 3:
                    System.out.println("Saindo...");
                    System.out.flush();
                    break;

                default:
                    System.out.println("Opção Inválida");
                    System.out.flush();
                    exibirMenuPrincipal();
                    break;
            }
        
        } while (opcao <= 0 && opcao > 3);
        scanner.close();
    }

    public static void exibirMenuFigurasPlanas() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu das Figuras Geométricas Planas:");
            System.out.println("1. Circulo");
            System.out.println("2. Quadrado");
            System.out.println("3. Triângulo");
            System.out.println("4. Retângulo");
            System.out.println("5. Trapézio");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    clonarFigurasPlanas(new Circulo(5.0));
                    System.out.flush();
                    break;
                case 2:
                    clonarFigurasPlanas(new Quadrado(5.0));
                    System.out.flush();
                    break;
                case 3:
                    clonarFigurasPlanas(new Triangulo(5.0, 7.0, 10.0));
                    System.out.flush();
                    break;
                case 4:
                    clonarFigurasPlanas(new Retangulo(5.0, 10.0));
                    System.out.flush();
                    break;
                case 5:
                    clonarFigurasPlanas(new Trapezio(5.0, 7.0, 1.0, 3.0, 10.0));
                    System.out.flush();
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    System.out.flush();
                    exibirMenuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.flush();
                    exibirMenuFigurasPlanas();
                    break;
            }
        } while (opcao > 5);
        scanner.close();
    }

    public static void exibirMenuFigurasNaoPlanas() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\nMenu das Figuras Geométricas Não Planas:");
            System.out.println("1. Cilindro");
            System.out.println("2. Cubo");
            System.out.println("3. Pirâmide");
            System.out.println("4. Esfera");
            System.out.println("5. Paralelepípedo");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    clonarFigurasNaoPlanas(new Cilindro(5.0, 10.0));
                    System.out.flush();
                    break;
                case 2:
                    clonarFigurasNaoPlanas(new Cubo(5.0));
                    System.out.flush();
                    break;
                case 3:
                    clonarFigurasNaoPlanas(new Piramide(5.0, 10.0));
                    System.out.flush();
                    break;
                case 4:
                    clonarFigurasNaoPlanas(new Esfera(5.0));
                    System.out.flush();
                    break;
                case 5:
                    clonarFigurasNaoPlanas(new Paralelepipedo(5.0, 7.0, 10.0));
                    System.out.flush();
                    break;
                case 0:
                    System.out.println("Voltando ao Menu Principal...");
                    System.out.flush();
                    exibirMenuPrincipal();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.flush();
                    exibirMenuFigurasPlanas();
                    break;
            }
        } while (opcao > 5);
        scanner.close();
    }

    public static void clonarFigurasPlanas(FigurasPlanas figura) {
        try {
            
            System.out.println("\nInformações da Figura Original");
            System.out.println("Figura: " + figura);
            System.out.println("Área: " + Math.round(figura.calcularArea()));
            System.out.println("Perímetro: " + Math.round(figura.calcularPerimetro()));
            
            FigurasPlanas cloneFigura = (FigurasPlanas) figura.clone();
            
            System.out.println("\nInformações do Clone da Figura");
            System.out.println("Figura: " + cloneFigura);
            System.out.println("Área: " + Math.round(cloneFigura.calcularArea()));
            System.out.println("Perímetro: " + Math.round(cloneFigura.calcularPerimetro()));
        
        } catch (Exception e) {
        
            System.out.println("Erro ao clonar a figura: " + e.getMessage());
        
        }
    }

    public static void clonarFigurasNaoPlanas(FigurasNaoPlanas figura) {
        try {
            
            System.out.println("\nInformações da Figura Original");
            System.out.println("Figura: " + figura);
            System.out.println("Área: " + Math.round(figura.calcularArea()));
            System.out.println("Perímetro: " + Math.round(figura.calcularVolume()));
            
            FigurasNaoPlanas cloneFigura = (FigurasNaoPlanas) figura.clone();
            
            System.out.println("\nInformações do Clone da Figura");
            System.out.println("Figura: " + cloneFigura);
            System.out.println("Área: " + Math.round(cloneFigura.calcularArea()));
            System.out.println("Perímetro: " + Math.round(cloneFigura.calcularVolume()));
        } catch (Exception e) {
            System.out.println("Erro ao clonar a figura: " + e.getMessage());
        }
    }

}
