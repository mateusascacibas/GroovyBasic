
import org.w3c.dom.ranges.Range

class DaysExercise{
        public enum days {
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA,
        SABADO, DOMINGO
        }

    static void main(String[] args) {
        print("--- Enum --- \n")
       EnumSet<days> e_set
        e_set = EnumSet.range(days.SEGUNDA, days.DOMINGO)
        print("Tamanho da ENUM: ${e_set.size()} \n")
        print(e_set.contains("quarta"))
        print("\n ---------------------")
        print("\n --- List --- \n")
        List listDays = ['segunda', 'terca', 'quarta', 'quinta', 'sexta', 'sabado', 'domingo']
        print(listDays)
        print('\n')
        print("Tamanho da Lista = ${listDays.size()} \n")
        listDays.remove("sabado")
        print("Lista sem o sabado = ${listDays} \n")
        listDays.add("sabado")
        print("O sabado voltou = ${listDays} \n")


    }
}
