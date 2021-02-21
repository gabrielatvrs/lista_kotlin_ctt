package Exercicio3

import java.util.*

val scanner: Scanner = Scanner(System.`in`);
var funcionarios: MutableList<Funcionario?> = mutableListOf();

fun main() {
    var continuar = true;

    do {
        textoInicial();

        println();
        print("Opção informada: ");
        val opcao = scanner.next();
        println();

        when (opcao) {
            "1" -> salvarFuncionario();
            "2" -> buscarFuncionario();
            "3" -> continuar = false;
            else -> println("Opção informada não é válida");
        }

        println();
    } while (continuar);
}

fun textoInicial() {
    println("===========================================");
    println("Informe a opção desejada:");
    println("1 - Salvar funcionário");
    println("2 - Buscar funcionário");
    println("3 - Sair");
    println("===========================================");
}

fun salvarFuncionario() {
    println("Informe os dados do funcionário");

    var idEmUso: Funcionario?;
    var id: Int;

    do {
        print("Id: ");
        id = scanner.nextInt();

        idEmUso = funcionarios.filter{ it?.getId() == id  }.firstOrNull();

        if (idEmUso !== null) {
            println("O id \"$id\" já está em uso");
        }
    } while (idEmUso !== null);

    print("Nome: ");
    val nome: String = scanner.next();

    print("CPF: ");
    val cpf: Long = scanner.nextLong();

    print("Salário: ");
    val salario: Double = scanner.nextDouble();

    var funcao: String;

    do {
        print("Função: (1 - Gestor; 2 - Programador) ");
        funcao = scanner.next();

        if (funcao != "1" && funcao != "2") {
            println("Função inválida");
        }
    } while (funcao != "1" && funcao != "2");

    val tipoFuncionario: TiposFuncionario = if (funcao == "1") TiposFuncionario.Gestor else TiposFuncionario.Programador;

    val funcionario = Funcionario();
    funcionario.setId(id);
    funcionario.setNome(nome);
    funcionario.setCpf(cpf);
    funcionario.setSalario(salario);
    funcionario.setTipoFuncionario(tipoFuncionario);
    funcionarios.add(funcionario);

    println();
    println("Funcionário salvo com sucesso");
}

fun buscarFuncionario() {
    print("Informe o id do funcionario que deseja buscar: ");
    val id: Int = scanner.nextInt();

    val funcionario: Funcionario? = funcionarios.filter{ it?.getId() == id  }.firstOrNull();

    println();

    if (funcionario !== null) {
        println("===========================================");
        println("Informe a opção desejada:");
        println("1 - Exibir dados");
        println("2 - Aumentar salário");
        println("===========================================");

        println();
        println("Opção informada: ");
        val opcao = scanner.next();

        when (opcao) {
            "1" -> println(funcionario.getDados());
            "2" -> println(funcionario.aumentarSalario());
            else -> println("Opção inválida");
        }
    } else {
        println("Não há nenhum funcionário com o id informado");
    }
}

enum class TiposFuncionario {
    Gestor {
        override fun reajustarSalario(): Double = 0.1;
    },
    Programador {
        override fun reajustarSalario(): Double = 0.2;
    };

    abstract fun reajustarSalario(): Double;
}

class Funcionario {
    private var id: Int? = null;

    private var nome: String? = null;

    private var cpf: Long? = null;

    private var salario: Double? = null;

    private var tipoFuncionario: TiposFuncionario? = null;

    fun setId(idInformado: Int) {
        id = idInformado;
    }

    fun getId(): Int? {
        return id;
    }

    fun setNome(nomeInformado: String) {
        nome = nomeInformado;
    }

    fun setCpf(cpfInformado: Long) {
        cpf = cpfInformado;
    }

    fun setSalario(salarioInformado: Double) {
        salario = salarioInformado;
    }

    fun setTipoFuncionario(tipoFuncionarioInformado: TiposFuncionario) {
        tipoFuncionario = tipoFuncionarioInformado;
    }

    fun getDados(): String {
        return "Id: $id" +
                "\nNome: $nome" +
                "\nCPF: $cpf" +
                "\nSalário: $salario" +
                "\nTipo funcionário: $tipoFuncionario";
    }

    fun aumentarSalario(): String {
        salario = salario?.plus(tipoFuncionario?.let { salario?.times(it.reajustarSalario()) }!!);

        return "O funcionário teve um aumento de salário." +
                "\nSeu novo salário é $salario";
    }
}