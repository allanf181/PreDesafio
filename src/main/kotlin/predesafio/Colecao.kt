package predesafio

class Colecao(override var codigo: Int, var livros: MutableList<String>, var descricao: String) : IProduto {
    override var quantidade = 0
    override var preco = 0.0

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IProduto) return false
        if (codigo != other.codigo) return false

        return true
    }

}