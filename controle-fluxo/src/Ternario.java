public class Ternario {
    public static void main(String[] args) {
        //ternario com else if
        int nota = 6;                           //se nao se
		String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
