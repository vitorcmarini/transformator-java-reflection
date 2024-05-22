package br.com.alura.refl;

import br.com.alura.Pessoa;

public class ObjectToJasonTester {

    public static void main(String... x) {
        Pessoa pessoa = new Pessoa(1, "vitor", "12345");
        ObjectToJason objectToJason = new ObjectToJason();
        System.out.println(objectToJason.transform(pessoa));
    }
}
