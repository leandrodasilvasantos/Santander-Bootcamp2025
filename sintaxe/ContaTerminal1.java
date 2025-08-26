package sintaxe;

import java.util.Scanner;

public class ContaTerminal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do Cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Número da conta: ");
        int numeroConta = sc.nextInt();
        System.out.println("Agencia da conta: ");
        int agenciaConta = sc.nextInt();
        System.out.println("Saldo do Cliente: ");
        double saldoCliente = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é " +
                "%s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agenciaConta,
                numeroConta, saldoCliente);



    }
}
