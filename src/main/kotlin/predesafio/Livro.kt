package predesafio

class Livro(override var codigo: Int,
            var titulo: String,
            var autor: String,
            var anoDeLancamento: Int): IProduto {

    override var preco = 0.0
    override var quantidade = 0

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IProduto) return false
        if (codigo != other.codigo) return false

        return true
    }
}