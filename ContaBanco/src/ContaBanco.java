import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta");
        int numConta = sc.nextInt();

        System.out.println("Em seguida, digite o número da agência");
        var numAgencia = sc.next();

        System.out.println("Em seguida, Digite o seu nome");
        var nome = sc.next();

        System.out.println("Por fim, digite o valor que deseja sacar");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, numAgencia, numConta, saldo );

    }
}
