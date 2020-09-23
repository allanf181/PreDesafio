package predesafio

class Livraria {
    val produtos = mutableListOf<IProduto>()

    fun cadastrarLivro(livro: Livro){
        if(!produtos.contains(livro)){
            produtos.add(livro)
        } else {
            println("Livro já cadastrado ou código já cadastrado em outro produto.")
        }
    }

    fun cadastrarLivro(vararg livro: Livro){
        if(!produtos.containsAll(livro.toList())){
            produtos.addAll(livro)
        } else {
            println("Livros já cadastrados ou códigos já cadastrados em outros produtos.")
        }
    }

    fun cadastrarColecao(colecao: Colecao){
        if(!produtos.contains(colecao)){
            produtos.add(colecao)
        } else {
            println("Coleção já cadastrado ou código já cadastrado em outro produto.")
        }
    }

    fun consultarLivroPorCodigo(codigo: Int): IProduto? {
        class dummy(override var codigo: Int) : IProduto{
            override var preco: Double = 0.0
            override var quantidade: Int = 0
            override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (other !is IProduto) return false
                if (codigo != other.codigo) return false

                return true
            }
        }
        val fake = dummy(codigo)
        val produto = produtos.find { it == fake }
        if(produto == null){
            println("Livro não encontrado")
        }
        return produto
    }

    fun efetuarVenda(codigo: Int){
        val produto = consultarLivroPorCodigo(codigo)
        if(produto != null){
            if(produto.quantidade > 0) {
                produtos[produtos.indexOf(produto)].quantidade--
            } else {
                println("Estoque esgotado")
            }
        }
    }
}