fun main() {
    var valorPedido = 0f
    var valorTotal = 0f
    var encerrado = false
    do {
        println("========== caixa ==============")
        println("1 -> para realizar o pedido")
        println("2 -> Fechar o pedido")
        println("3 -> verificar o valor de caixa")
        println("4 -> fechar o caixa")
        println("===============================")

        print("Digite a opção:")
        var opcao: String = readln()

        when (opcao) {
            "1" -> {
                do {
                    println("===============================")
                    println("1 -> para Suco R$3,50")
                    println("2 -> Lanche  R$10,50")
                    println("3 -> Salgado R$5,50")
                    println("===============================")

                    print("Digite a opção:")
                    var opcaoPedido: String = readln()

                    when (opcaoPedido) {
                        "1" -> valorPedido += 3.50f
                        "2" -> valorPedido += 10.50f
                        "3" -> valorPedido += 5.50f
                        else -> println("Opção invalida !!")
                    }

                    print("Deseja continuar o pedido? S/N :")
                    val resposta = readln()

                } while (resposta.uppercase() == "S")

            }

            "2" -> {
                println("O valor total para pagar é de R$$valorPedido ")
                print("Digite o valor pago:")

                var pago = readLine()?.toFloat() ?: 0f
                var troco = pago - valorPedido

                troco -= valorPedido
                valorTotal += valorPedido

                println("===============================")
                println("                               ")
                println("Foi pago R$$pago seu troco é de R$$troco ")
                println("                               ")
                println("===============================")

                valorPedido = 0f
            }

            "3" -> {
                println("===============================")
                println("                               ")
                println("O valor total do caixa é R$$valorTotal ")
                println("                               ")
                println("===============================")
            }

            "4" -> {
                print("Deseja realmente fechar o caixa? S/N :")
                val resposta = readln()

                if (resposta.uppercase() == "S") encerrado = true
            }

            else -> {
                println("===============================")
                println("                               ")
                println(" Opção invalida !!")
                println("                               ")
                println("===============================")
            }
        }
    } while (!encerrado)

    println("===============================")
    println("                               ")
    println("fim do dia total do caixa é R$$valorTotal ")
    println("                               ")
    println("===============================")
}