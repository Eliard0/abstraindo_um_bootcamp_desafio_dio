import br.com.dio.dominio.Conteudo;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("desbravando o mundo java - dio");
        curso1.setCargaHoraria(120);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javaScript");
        curso2.setDescricao("desbravando o mundo javaScript - dio");
        curso2.setCargaHoraria(110);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("java");
        mentoria.setDescricao("voando com java");
        mentoria.setData(LocalDate.now());


//        System.out.println(mentoria);
//        System.out.println(curso1);
//        System.out.println(curso2);

    }
}