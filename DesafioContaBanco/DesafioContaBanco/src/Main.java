public class Main {
   public static void main(String[] args) {
    Cliente Bento = new Cliente();
    Bento.setNome("Bento");
    Conta cc = new ContaCorrente(Bento);
    cc.depositar(100);
    Conta poupanca = new ContaPoupanca(Bento);
    cc.transferir(100, poupanca);

    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
   } 
}
