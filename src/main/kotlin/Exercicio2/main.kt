package Exercicio2

import java.util.*

var contatos: MutableList<Contato?> = mutableListOf();
val scanner = Scanner(System.`in`);

fun main() {
    var continuar = true;

    do {
        textoInicial();

        println();
        print("Selecione uma opção: ");
        val opcao = scanner.next();
        println();

        when (opcao) {
            "1" -> salvarContato();
            "2" -> removerContato();
            "3" -> buscarContato();
            "4" -> listarContatos();
            "5" -> continuar = false;
            else -> println("Opção inválida");
        }

        println();
    } while (continuar);
}

fun textoInicial() {
    println("===========================================");
    println("Informe a opção desejada:");
    println("1 - Salvar contato");
    println("2 - Remover contato");
    println("3 - Buscar contato");
    println("4 - Listar contatos");
    println("5 - Sair");
    println("===========================================");
}

fun salvarContato() {
    if (contatos.lastIndex < 9) {
        print("Informe o nome do contato: ");
        val nome: String = scanner.next();

        print("Informe o telefone do contato: ");
        val telefone: Long = scanner.nextLong();

        println();

        val contatoFiltrado = filtrarContato(nome, telefone);

        if (contatoFiltrado === null) {
            val contato = Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contatos.add(contato);

            println("${contato.getNome()} foi adicionad@ à sua agenda");
        } else {
            println("O contato já existe na agenda");
        }
    } else {
        println("Não é possível adicionar mais que 10 contatos na agenda");
    }
}

fun removerContato() {
    if (contatos.lastIndex == -1) {
        println("Não há contatos na sua agenda");
    } else {
        print("Informe o nome do contato que deseja remover: ");
        val nome = scanner.next();

        print("Informe o telefone do contato que deseja remover: ");
        val telefone = scanner.nextLong();

        println();

        val contatoFiltrado = filtrarContato(nome, telefone);

        if (contatoFiltrado === null) {
            println("O contato não existe na sua agenda");
        } else {
            val contato: Contato? = contatos.get(contatoFiltrado);
            println("${contato?.getNome()} removido da agenda");
            contatos.remove(contato);
        }
    }
}

fun filtrarContato(nome: String, telefone: Long): Int? {
    return contatos.mapIndexed{ index, contato ->
        if (contato?.getNome() == nome && contato?.getTelefone() == telefone) {
            index;
        } else {
            null;
        }
    }.firstOrNull();
}

fun buscarContato() {
    if (contatos.lastIndex == -1) {
        println("Não há contatos na sua agenda");
    } else {
        println("Informe o nome do contato que deseja buscar:");
        val nome = scanner.next();

        contatos.filter{ contato: Contato? -> contato?.getNome() == nome }
            .forEach{ contatoFiltrado -> println(contatoFiltrado?.getContatoInfo()) };
    }
}

fun listarContatos() {
    if (contatos.lastIndex == -1) {
        println("Não há contatos na sua agenda");
    } else {
        contatos.forEachIndexed{ index, contato -> println("Posição: $index; ${contato?.getContatoInfo()}") };
    }
}

class Contato {
    private var nome: String = "";

    private var telefone: Long = 0;

    fun setNome(nomeInformado: String) {
        nome = nomeInformado;
    }

    fun getNome(): String {
        return nome;
    }

    fun setTelefone(telefoneInformado: Long) {
        telefone = telefoneInformado;
    }

    fun getTelefone(): Long {
        return telefone;
    }

    fun getContatoInfo(): String {
        return "Nome: $nome; Telefone: $telefone";
    }
}