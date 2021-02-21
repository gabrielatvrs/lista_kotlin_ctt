package model

//Abstrato: pode ser substituído
abstract class InstrumentoMusical(
    val donoInstrumento: String,
    val valorInstrumento: Double
) {
    //Atributos abstratos
    //Tudo que for abstrato, será substituído na classe que for herdado
    abstract var possuiCordas: Boolean

    //Métodos abstratos
    abstract fun emitirSom(): String

    //Métodos não abstratos
    fun comprar(): String {
        return ("Compra realizada com sucesso!")
    }
}

class Guitarra(
    donoInstrumentoGuitarra: String,
    valorInstrumentoGuitarra: Double,
    possuiCordasGuitarra: Boolean
) : InstrumentoMusical(
    donoInstrumento = donoInstrumentoGuitarra,
    valorInstrumento = valorInstrumentoGuitarra), TouchScreen, OutroExemplo {

    override var atributoQualquer: Int = 0

    override var possuiCordas: Boolean = possuiCordasGuitarra

    override fun emitirSom(): String {
            return "TÁÁÁÁ"
        }
    override fun tocar(): String {
            return "TÁÁÁÁÁÁÁÁ"
        }
    }