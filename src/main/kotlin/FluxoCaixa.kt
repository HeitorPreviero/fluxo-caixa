fun main() {
    var mValorPedido = 0f
    var mValorTotal = 0f
    var mFinal = false
    do {
        println("========== caixa ==============")
        println("1 -> para realizar o pedido")
        println("2 -> Fechar o pedido")
        println("3 -> verificar o valor de caixa")
        println("4 -> fechar o caixa")
        println("===============================")

        print("Digite a opção:")
        var mOpcao: String = readln()

        when (mOpcao) {
            "1" -> {
                do {
                    println("===============================")
                    println("1 -> para Suco R$3,50")
                    println("2 -> Lanche  R$10,50")
                    println("3 -> Salgado R$5,50")
                    println("===============================")

                    print("Digite a opção:")
                    var mOpcaoPedido: String = readln()

                    when (mOpcaoPedido) {
                        "1" -> mValorPedido += 3.50f
                        "2" -> mValorPedido += 10.50f
                        "3" -> mValorPedido += 5.50f
                        else -> println("Opção invalida !!")
                    }

                    print("Deseja continuar o pedido? S/N :")
                    val value = readln()

                } while (value.uppercase() == "S")

            }

            "2" -> {
                println("O valor total para pagar é de R$$mValorPedido ")
                print("Digite o valor pago:")

                var mPago = readln()
                var mTroco = mPago.toFloat()

                mTroco -= mValorPedido
                mValorTotal += mValorPedido

                println("===============================")
                println("                               ")
                println("Foi pago R$$mPago seu troco é de R$$mTroco ")
                println("                               ")
                println("===============================")

                mValorPedido = 0f
            }

            "3" -> {
                println("===============================")
                println("                               ")
                println("O valor total do caixa é R$$mValorTotal ")
                println("                               ")
                println("===============================")
            }

            "4" -> {
                print("Deseja realmente fechar o caixa? S/N :")
                val value1 = readln()

                if (value1.uppercase() == "S") mFinal = true
            }

            else -> {
                println("===============================")
                println("                               ")
                println(" Opção invalida !!")
                println("                               ")
                println("===============================")
            }
        }


    } while (!mFinal)

    println("===============================")
    println("                               ")
    println("fim do dia total do caixa é R$$mValorTotal ")
    println("                               ")
    println("===============================")
}