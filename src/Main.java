import br.com.dio.dominio.*;

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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java");
        bootcamp.setDescricao("desbravando o java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev bolt = new Dev();
        bolt.setNome("eliardo");
        bolt.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos bolt" + bolt.getConteudosInscritos());
        bolt.progredir();
        System.out.println("--progredindo bolt--");
        System.out.println("Conteudos inscritos bolt" + bolt.getConteudosInscritos());
        System.out.println("Conteudos concluidos bolt" + bolt.getConteudosConcluidos());
        System.out.println("xp" + bolt.calcularTotalXp());


        System.out.println("------------------------------------------------------");
        Dev erica = new Dev();
        erica.setNome("erica");
        erica.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos erica" + erica.getConteudosInscritos());
        erica.progredir();
        erica.progredir();
        erica.progredir();
        System.out.println("--progredindo erica--");
        System.out.println("Conteudos inscritos erica" + erica.getConteudosInscritos());
        System.out.println("Conteudos concluidos erica" + erica.getConteudosConcluidos());
        System.out.println("Conteudos concluidos erica" + erica.getConteudosConcluidos());
        System.out.println("xp " + erica.calcularTotalXp());
    }
}