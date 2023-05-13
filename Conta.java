public class Conta {
    private int numero;
    private String nomeAgencia;
    private int numeroAgencia;
    private String nomeBanco;
    private int numeroBanco;
    private String tipoConta;
    private float saldo;
    
    
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.abrir(1, "AGSobral", 10, "BB",
                10, "Corrente");
        System.out.println(conta1.toString());
    }
    //ABRIR → método que recebe todos os atributos e insere 0,0 no saldo;
    public void abrir(int numero, String nomeAgencia, int numeroAgencia,
            String nomeBanco, int numeroBanco,String tipoConta) {
        
        this.numero = numero;
        this.nomeAgencia = nomeAgencia;
        this.numeroAgencia = numeroAgencia;
        this.nomeBanco = nomeBanco;
        this.numeroBanco = numeroBanco;
        this.tipoConta = tipoConta;
        this.saldo = 0;
    }

    public void encerrar() {
    }

    public void consultar() {
    }

    public void saldo() {
    }

    public void creditar() {
    }

    public void debitar() {
    }

    @Override
    public String toString() {
        return ("Conta criada com numero:" + numero + ", na agencia: " + nomeAgencia);
    }
    
    
}
