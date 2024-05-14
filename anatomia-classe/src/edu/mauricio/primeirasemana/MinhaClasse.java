package edu.mauricio.primeirasemana;

public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Maurício";
        String segundoNome = "Nadal";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
        // "O nome é " + primeiroNome.concat(" ") + segundoNome;
    }
}

