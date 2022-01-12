public class Inicio {

    static String tabuada(num){
        def i
        def response

        for(i = 1; i <= 10; i++){
            response += num + " * " + i  + " = " + i*num + "\n"
        }
        response += "--------------------\n"
        return response
    }

    static String numeroMaior(){
        def response
        print("--------- Exercicio do Maior Numero ---------")
        print("Digite dois numeros: ")
        print("Num 1: ")
        def a = System.in.newReader().readLine()
        print("Num 2: ")
        def b = System.in.newReader().readLine()
        if(a > b){
            response += "O maior numero e o " + a + "\n"
        }else if(b > a) {
            response += "O maior numero e o " + b + "\n"
        }else{
            response += "Sao numeros iguais"
        }
        response += "--------------------\n"
        return response
    }

    static String somaNumeros(){
        print("--------- Exercicio Somando Numeros ---------")
        print("Digite dois numeros: ")
        print("Num 1:")
        def num1 = System.in.newReader().readLine()
        print("Num 2:")
        def num2 = System.in.newReader().readLine()
        return "A soma: " + num1 + num2
    }



    static void main(String[] args) {
           try {
               print(" 1 - Tabuada \n 2 - Numero Maior \n 0 - Sair \n Digite uma das opcoes: ")
               def op = System.in.newReader().readLine()
               switch (op.toInteger()){
                   case 1:
                       print("--------- Exercicio da Tabuada ---------\n")
                       print("Digite um numero: ")
                       def num = System.in.newReader().readLine()
                       print(tabuada(num))
                       break
                   case 2:
                       print(numeroMaior())
                       break
                   case 3:
                       print(somaNumeros())
                   case 0:
                       print("Saindo...")
                       break
                   default:
                       print("Digite uma opcao valida.")
                       break

               }
           } catch(Exception e){
               print("Erro. Digite um numero")
           }


    }




}
