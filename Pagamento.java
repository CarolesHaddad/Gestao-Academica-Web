public interface Pagamento {
    void receberPagamento(String tipoPagamento, double valor);
    String consultarContracheque();
}
