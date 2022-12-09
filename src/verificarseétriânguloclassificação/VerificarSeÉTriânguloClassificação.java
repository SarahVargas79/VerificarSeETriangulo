/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarseétriânguloclassificação;

import java.util.Scanner;

/**
 *
 * @author sarin
 */
public class VerificarSeÉTriânguloClassificação {

    /**
     * @param args the command line arguments
     */
    private static void menu() {
        System.out.println("\n--Calculadora de Triângulo Equilátero, Isósceles e Escaleno--");
        System.out.println("\n1 - Verificar Triâgulo e Classificação");
        System.out.println("\n0 - Sair");
        System.out.print("\nDigite sua opção aqui: ");
    }

    public static void main(String[] args) {
        int opM;

        Scanner leia = new Scanner(System.in);

        do {
            menu();
            opM = leia.nextInt();
            switch (opM) {
                case 1:
                    verifTriagClass();
                    break;
                case 0:
                    System.out.println("\nCalculadora encerrada");
                    break;
                default:
                    System.out.println("\nOpção inválida, tente novamente!\n");
                    break;
            }
        } while (opM != 0);
    }//fim main

    private static void verifTriagClass() {
        int A, B, C;

        Scanner leia = new Scanner(System.in);

        //Capturando os dados do teclado
        
        System.out.print("\n");

        System.out.print("\nDigite valor para o lado A: ");
        A = leia.nextInt();

        System.out.print("\nDigite valor para o lado B: ");
        B = leia.nextInt();

        System.out.print("\nDigite valor para o lado C: ");
        C = leia.nextInt();

        //Processamento e saída de dados
        
        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            if ((A == B) && (B == C)) {
                System.out.println("\nResposta: Triângulo Equilátero.\n");
            }//fim se é três lados iguais
            else {
                if ((A == B) || (A == C) || (B == C)) {
                    System.out.println("\nResposta: Triângulo Isósceles.\n");
                }//fim se é dois lados iguais
                else {
                    System.out.println("\nResposta: Triângulo Escaleno.\n");
                }//fim se é todos os lados diferentes		  	  	  
            }
        }//fim se é triângulo
        else {
            System.out.println("\nResposta: Não formam um triângulo.\n");
        }//fim se não é triângulo
    }//fim verifTriangClass 
    
}//fim VerificarSeÉTriânguloClassificação
