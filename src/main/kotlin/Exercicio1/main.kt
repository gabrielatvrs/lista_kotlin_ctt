package Exercicio1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main(){
    val pessoa : Pessoa = Pessoa()
    println(pessoa.exibeNome())
    println(pessoa.exibeDataNascimento())
    println(pessoa.exibeAltura())
    println(pessoa.exibeDados())

    //Caso queira adicionar mais pessoas:
    val pessoa2 : Pessoa = Pessoa()
    pessoa2.informaNome("Pessoa2")
    println(pessoa2.exibeNome())
    pessoa2.informaData("26/12/1996")
    println(pessoa2.exibeDataNascimento())
    pessoa2.informaAltura(1.80)
    println(pessoa2.exibeAltura())
    println(pessoa2.exibeDados())
}

class Pessoa {
    private var nome: String = "Gabriela"
    private var dataNascimento: String = "16/03/1996"
    private var altura: Double = 1.60

    fun exibeNome(): String {
        return nome
    }

    fun exibeDataNascimento(): String {
        return dataNascimento
    }

    fun exibeAltura(): String {
        return "$altura m"
    }

    fun calculaIdade(): Long {
        val formatoDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val data = LocalDate.parse(dataNascimento, formatoDaData)
        val calculo = ChronoUnit.YEARS.between(data, LocalDate.now())
        return (calculo)
    }

    fun exibeDados(): String {
        val idade = calculaIdade()
        return "$nome nasceu em $dataNascimento, tem ${idade} anos e possui ${altura} m de altura."
    }

    //Caso queira adicionar mais pessoas:
    fun informaNome(nomeInformado: String) {
        nome = nomeInformado
    }

    fun informaData(dataInformada: String) {
        dataNascimento = dataInformada
    }

    fun informaAltura(alturaInformada: Double) {
        altura = alturaInformada
    }
}