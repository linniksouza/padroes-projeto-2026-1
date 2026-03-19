public class PIX implements FormaPagamento {

    @Override
    public boolean efetuar(double valor) {
        System.out.println(String.format("Tentando efetuar o pagamento no PIX de %.2f reais...", valor));

        if(valor < 100){
            System.out.println("Valor menor que o minimo de 100 reais. Recusando...");

            return false;
        }else{
            System.out.println("PIX pago com sucesso...");

            return true;
        }
    }
}
