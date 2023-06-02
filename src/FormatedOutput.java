import java.text.Format;

public class FormatedOutput {
    public static void main(String[] args) {
        
        var nome = "Maria";
        var sobrenome = "Silva";
        var idade = 18;
        var aplic = 123.353f;

        System.out.printf("Olá, %s %s.\nVocê tem %d anos.\nVocê tem R$ %.2f investidos", nome, sobrenome, idade, aplic);
                
    }
}
