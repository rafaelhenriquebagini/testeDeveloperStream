
import java.util.ArrayList;
import java.util.List;
import javaapplication1.Stream;

public class CharClass {

    public char firstChar(Stream input) {
        String vogais = "AEIOUaeiou";
        String ultimoChar = "";
        char retorno = ' ';
        List<String> list = new ArrayList<>();
        List<String> todasVogais = new ArrayList<>();

        while (input.hasNext()) {
            char charCorrente = input.getNext();
            if (vogais.contains(String.valueOf(charCorrente))) {
                todasVogais.add(String.valueOf(charCorrente).toUpperCase());
                if (!vogais.contains(ultimoChar)) {
                    list.add(String.valueOf(charCorrente));
                }
            }
            ultimoChar = String.valueOf(charCorrente);
        }
        for (String st : list) {
            int i = 0;
            for (String tt : todasVogais) {
                if (tt.toUpperCase().equals(st.toUpperCase())) {
                    i++;
                    if (i > 1) {
                        break;
                    }
                }
            }
            if (i == 1) {
                retorno = st.toCharArray()[0];
                break;
            }
        }

        if (retorno == ' ') {
            System.out.println("Não foi encontrada nenhuma vogal que atenda ao requisito");
        }
        return retorno;
    }
}
