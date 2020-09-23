package predesafio

class Livro(var codigo: Int,
            var titulo: String,
            var autor: String,
            var anoDeLancamento: Int,
            var quantidade: Int,
            var preco: Double) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Livro) return false
        if (codigo != other.codigo) return false

        return true
    }
}