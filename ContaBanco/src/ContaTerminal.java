import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.nextLine();
        
        System.out.print("Informe o nome do Usuário: ");
        String nome = sc.nextLine();

        System.out.print("Informe o Saldo da Conta: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
