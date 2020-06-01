import java.util.*

class Calculus {
    fun calculator(express: String): String {
        val result: String
        var numberList: List<Double> = ArrayList()
        var opList: List<Char> = ArrayList()
        numberList = getNumbers(express)
        opList = getOps(express)
        result = calculateValor(numberList, opList)
        return result
    }

    private fun calculateValor(
        numberList: List<Double>,
        opList: List<Char>
    ): String {
        var result = ""
        var total = 0.0
        var j = 0
        for (i in 0 until numberList.size - 1) {
            if (total == 0.0) {
                val number1 = numberList[i]
                val numbers2 = numberList[i + 1]
                val operator = opList[i]
                total = executedOperable(number1, operator, numbers2)
            } else if (total > 0.0) {
                val numbers2 = numberList[i]
                val operator = opList[j]
                total = executedOperable(total, operator, numbers2)
                j++
            }
        }
        result = "" + total
        return result
    }

    private fun executedOperable(numero1: Double, operador: Char, numero2: Double): Double {
        var result = 0.0
        when (operador) {
            '+' -> result = numero1 + numero2
            '-' -> result = numero1 - numero2
            '/' -> result = numero1 / numero2
            '*' -> result = numero1 * numero2
        }
        return result
    }

    private fun getNumbers(express: String): List<Double> {
        val numberList: MutableList<Double> = ArrayList()
        var numberString = ""
        for (i in express.indices) {
            numberString = when {
                isOperator(express[i]) -> {
                    val number = java.lang.Double.valueOf(numberString)
                    numberList.add(number)
                    ""
                }
                else -> numberString + "" + express[i]
            }
        }
        if (numberString.isNotEmpty()) {
            val number = java.lang.Double.valueOf(numberString)
            numberList.add(number)
        }
        return numberList
    }

    private fun getOps(express: String): List<Char> {
        val opList: MutableList<Char> = ArrayList()
        for (i in express.indices) {
            if (isOperator(express[i])) {
                opList.add(express[i])
            }
        }
        return opList
    }

    private fun isOperator(character: Char): Boolean {
        var isOperator = false
        when (character) {
            '-', '+', '/', '*' -> {
                isOperator = true
            }
        }
        return isOperator
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val c = Calculus()
            println(">>>>" + c.calculator("5/5"))
        }
    }
}