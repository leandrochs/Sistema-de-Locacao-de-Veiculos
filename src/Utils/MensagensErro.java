package Utils;

public enum MensagensErro {
    ENTRADA_INVALIDA("Entrada inválida! Tente novamente."),
    OPCAO_INVALIDA("Por favor, digite uma opção disponível no menu."),
    VEICULO_EXISTENTE("Veículo já cadastrado."),
    ID_NUMBER_INVALIDO("IdNumber inválido. Por favor, insira um CPF (11 dígitos) ou CNPJ (14 dígitos)."),
    ERRO_CADASTRO_CLIENTE("Erro ao cadastrar cliente. Tente novamente."),
    VEICULO_NAO_ENCONTRADO("Veículo não encontrado. Operação cancelada."),
    CLIENTE_NAO_ENCONTRADO("Cliente não encontrado. Operação cancelada."),
    DATA_DEVOLUCAO_INVALIDA("Data de devolução inválida. Operação cancelada.");


    private final String mensagem;

    MensagensErro(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
