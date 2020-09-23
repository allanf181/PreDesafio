package predesafio

class Livro(override var codigo: Int,
            var titulo: String,
            var autor: String,
            var anoDeLancamento: Int,
            override var preco: Double,
            override var quantidade: Int): IProduto {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Livro) return false
        if (codigo != other.codigo) return false

        return true
    }
}