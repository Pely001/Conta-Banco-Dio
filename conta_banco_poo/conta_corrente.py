from conta import Conta
class ContaCorrente(Conta):
    def __init__(self, numero, cliente,limite=500 ,limite_saque=3):
        super().__init__(numero, cliente)
        self._limite = limite
        self._limite_saque = limite_saque