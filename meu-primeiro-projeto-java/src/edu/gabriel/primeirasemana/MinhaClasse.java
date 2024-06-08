package edu.gabriel.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        
        String primeiroNome = "Gabriel";
        String segundoNome = "Canario";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        


        
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resulta do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
