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
        val livro = Livro(codigo,"","",0)
        val index = produtos.indexOf(livro)
        if(index > 0){
            return produtos[index]
        } else {
            println("Livro não encontrado")
            return null
        }
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