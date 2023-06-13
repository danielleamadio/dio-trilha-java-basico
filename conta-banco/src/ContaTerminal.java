import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
    //to do: conhecer e importar a classe Scanner
    Scanner sc = new Scanner(System.in).useLocale(Locale.US); {
    //to do: exibir as mensagens para nosso usuário
    System.out.println("***Conta Bancária***");
    //to do: obter pela classe Scanner os valores digitados no terminal
    try{
    System.out.println("Digite o número da sua Conta");
    int conta = sc.nextInt();
    sc.nextLine();
          
    System.out.println("Digite o número da sua Agência");
    String agencia = sc.next();
    sc.nextLine();

    System.out.println("Digite seu nome completo");
    String nome = sc.nextLine();

    System.out.println("Digite o Saldo");
    double saldo = sc.nextDouble();
              
    //to do: exibir a mensagem final (da conta criada)
    System.out.println("Olá " +nome);
    System.out.println(" obrigado por criar uma conta em nosso banco, sua agência é " +agencia);
    System.out.println(",conta " +conta);
    System.out.println(" e seu saldo " +saldo+ " já está disponível para saque");

    sc.close();
    }

    catch(InputMismatchException e){
        System.out.println("A agência deve ser no formato númerico. Ex: 1234.");
    }   
}
}
}

