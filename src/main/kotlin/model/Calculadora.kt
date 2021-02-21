package model
//Polimorfismo: um método usado de várias formas. Ex: Calcular
//Abstrato: reserva o método;
//Método abstrato não tem corpo
    abstract class Calculadora {
        abstract fun calcular(x: Int, y: Int) : Int
}

    class Soma : Calculadora(){
        override fun calcular(x: Int, y: Int): Int {
            return x + y
    }

    class Subtracao : Calculadora(){
        override fun calcular(x: Int, y: Int): Int {
            return x - y
        }

    }

        class Divisao : Calculadora(){
            override fun calcular(x: Int, y: Int): Int {
                return x / y
            }

        }
        class Multiplicacao : Calculadora(){
            override fun calcular(x: Int, y: Int): Int {
                return x * y
            }

        }

}


