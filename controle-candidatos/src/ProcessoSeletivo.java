public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");
        analisarCandidato(1900.00);
        analisarCandidato(2000.0);
        analisarCandidato(2500.00);
    }
static void analisarCandidato (double salarioPretendido){
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido){
        System.out.println("Ligar para o Candidato");
    }else if (salarioBase == salarioPretendido)
        System.out.println("Ligar para o Candidato com Contra Proposta");
    else{
        System.out.println("Aguardando o Resultado dos demais Candidatos"); 
    }
}
    
}
