////fun main{
////    data class Carro(
////        val nome: String,
////        val placa: String
////    ) {
////
////        var novo: Boolean = true
////
////        //CONSTRUTOR SECUNDÁRIO
////        constructor(
////            nomeInserido: String,
////            placaInserida: String,
////            modeloNovo: Boolean
////        ) : this(nomeInserido, placaInserida) {
////            novo = modeloNovo
////        }
////
////    }
////}
////
////enum class EnumTiposPokemon {
////    FOGO, AGUA, ELETRICO, DRAGAO, NORMAL
////}
////
////data class Imovel (val valor: Double,
////                   val qtdQuartos: Int,
////                   val endereco: String) {
////
////    var nmrAndares: Int? = null
////
////    constructor(valor: Double,
////                qtdQuartos: Int,
////                endereco: String,
////                numeroAndares: Int) : this(valor, qtdQuartos, endereco){
////        nmrAndares = numeroAndares
////    }
////}
////data class Livro (private var titulo: String,
////                  var numeroPaginas: Int,
////                  var autor : String,
////                  var editora : String,
////                  var seEstaAlugado : Boolean) {
////
////    //Encapsulamento: visibilidade de um atributo ou método
////    //publico: visibilidade geral
////    //privado: ele só tem visibilidade na classe a qual ele pertence
////    fun getTitulo() : String {
////        return "Título do livro: $titulo"
////    }
////}
//
////class Livro {
////    private var titulo: String
////    private var numeroPaginas: Int
////    private var autor: String
////    private var editora: String
////    private var seEstaAlugado: Boolean
////
////      CONSTRUTOR PRIMÁRIO
////    constructor(tituloInserido: String,
////                numeroPaginasInserido: Int,
////                autorInserido: String,
////                editoraInserido: String,
////                seEstaAlugadoInserido: Boolean = false){
////        titulo = tituloInserido
////        numeroPaginas = numeroPaginasInserido
////        autor = autorInserido
////        editora = editoraInserido
////        seEstaAlugado = seEstaAlugadoInserido
////    }
////}
//
///*
//*
//* public class Livro {
//*       private String titulo;
//*       private int paginas;
//*       private String autor;
//*       private String editora;
//*       private bool seEstaAlugado;
//*
//*       public Livro(String titulo, int paginas, String autor, String editora){
//*           setTitulo(titulo);
//*       }
//*
//*       public String getTitulo(){
//*           return titulo;
//*       }
//*
//*       public void setTitulo(String tituloInserido){
//*           this.titulo = tituloInserido;
//*       }
//*
//*       public void alugar(alugar: bool){
//*           seEstaAlugado = alugar;
//*       }
//* }
//* */
//
//    class Redirecionamento {
//
//        private var link = "abcd"
//
//        fun irParaGoogle() {
//            println(link)
//        }
//    }
//    class Repositorio(val redirecionamento: Redirecionamento) {
//
//        fun irParaGoogle(){
//            redirecionamento.irParaGoogle()
//        }
//
//    }
//    class Soma(val x : Int, val y : Int){
//        fun somar() : Int {
//            return x.plus(y)
//        }
//    }
//    fun main() {
////    var readLine : Int?
////    var scanner: Int?
////
//        //Permite valores nulos e outros formatos de caracteres enquanto Scanner, não.
////    println("Testando método readline()")
////    readLine = readLine()?.toIntOrNull()
////
////    println("Testando método scanner")
////    scanner = Scanner(System.`in`).nextInt()
////
////    println(readLine)
////    println(scanner)
//
//        //Aula 02 - Biblioteca
//        //Livro harrypotter = new Livro("",""...);
////
////        var livro3 : Livro? = null
////
////        val livro1 = Livro(
////            titulo = "Harry Potter e a Pedra Filosofal",
////            autor ="J. K. Rowling",
////            editora ="Saraiva",
////            numeroPaginas = 200,
////            seEstaAlugado = true)
////
////        val livro2 = Livro(
////            titulo = "Capitães de Areia",
////            autor ="Jorge Amado",
////            editora ="Saraiva",
////            numeroPaginas = 150,
////            seEstaAlugado = true)
////
////        println(livro1)
////        println(livro1.getTitulo())
////
////        var listaLivros : MutableList<Livro> = mutableListOf(livro1, livro2)
////
////        val resultado = Soma(2,2).somar()
////
////        val carro1 = Carro(nome = "ABC", placa = "XPTO")
////        val carro2 = Carro(nomeInserido = "DEF", placaInserida = "ABCD", modeloNovo = true)
////
////        println("${carro1.nome}, ${carro1.placa}")
////
////        //Só exibe de forma completa no log se for um data class!!
////        println(carro1)
////
////        val tipo = EnumTiposPokemon.FOGO
////
////        val mensagem = when(tipo){
////            EnumTiposPokemon.FOGO -> "Tá pegando fogo, bicho!"
////            EnumTiposPokemon.DRAGAO -> "Dragão"
////            else -> "Alguma coisa..."
////        }
////
////        println(mensagem)
////
////        val casa = Imovel(valor = 350000.00, qtdQuartos = 2, endereco = "Onde judas perdeu as botas")
////        val apartamento = Imovel(valor = 4600000.00, qtdQuartos = 5, endereco = "Também onde judas perdeu as botas", numeroAndares = 8)
////
////    }
//
