package predesafio

fun main () {
    val livraria = Livraria()

    val livro1 = Livro(1,"Jogos Vorazes","Suzzane Collins",2005)
    val livro2 = Livro(2,"Em Chamas","Suzzane Collins",2005)

    val colecao = Colecao(3, mutableListOf(livro1,livro2),"Suzzane Collins")

    livro1.quantidade += 10
    livro2.quantidade += 0

    livraria.cadastrarLivro(livro1,livro2)
    livraria.cadastrarColecao(colecao)

    livraria.cadastrarLivro(Livro(1,"","",0))

    println(livraria.consultarLivroPorCodigo(3)?.quantidade)
    livraria.efetuarVenda(3)
}
