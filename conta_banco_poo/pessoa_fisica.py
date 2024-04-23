from cliente import Cliente


class PessoaFisica(Cliente):
    def __init__(self, cpf,nome , nascimento, endereco):
        super().__init__(endereco)
        self.cpf = cpf
        self.nome = nome
        self.nascimento = nascimento
    