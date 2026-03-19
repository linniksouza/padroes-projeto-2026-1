public class Boleto implements FormaPagamento {
    
    @Override
    public boolean efetuar(double valor) {
        System.out.println(String.format("Tentando efetuar o pagamento no boleto bancario de %.2f reais...", valor));

        if(valor < 50){
            System.out.println("Valor menor que o minimo de 50 reais. Recusando...");

            return false;
        }else{
            System.out.println("Boleto pago com sucesso...");

            return true;
        }
    }
}
