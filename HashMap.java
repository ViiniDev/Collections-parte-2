package Aula_01;

import java.util.Map;
import java.util.Scanner;

public class HashMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> pessoasPorSexo = new java.util.HashMap<>();

        System.out.println("Cadastre pessoas no formato nome,sexo. Digite F para encerrar.");

        while (true) {
            System.out.print("Entrada: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("F")) {
                break;
            }

            String[] dados = entrada.split(",");
            if (dados.length != 2 || dados[0].isBlank() || dados[1].isBlank()) {
                System.out.println("Formato invalido. Use: nome,sexo");
                continue;
            }

            pessoasPorSexo.put(dados[0].trim(), dados[1].trim());
        }

        System.out.println("\nPessoas cadastradas por sexo:");
        pessoasPorSexo.forEach((nome, sexo) -> System.out.println(sexo + ": " + nome));

        scanner.close();
    }
}
