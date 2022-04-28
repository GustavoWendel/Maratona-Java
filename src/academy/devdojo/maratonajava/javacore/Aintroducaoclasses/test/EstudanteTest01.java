package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EstudanteTest01 {
    public static void main(String[] args) {
        /*Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);*/

        List<Estudante> lista = new ArrayList<>();
        HashMap<Estudante, Object> map = new HashMap<>();

        for (Estudante e : lista) {
            map.put(e, lista);
        }
    }
}
