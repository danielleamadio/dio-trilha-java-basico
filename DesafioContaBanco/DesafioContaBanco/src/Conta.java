public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta (Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente=cliente;
    }

    
    public void sacar(double valor){
        saldo = saldo - valor;

    }
    public void depositar (double valor){
        saldo = saldo + valor;
    }
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular = %s",this.cliente.getNome));
        System.out.println(String.format("Agência = %d",this.agencia));
        System.out.println(String.format("Número da Conta = %d",this.numeroConta));
        System.out.println(String.format("Saldo = %.2f",this.saldo));
    }
}
