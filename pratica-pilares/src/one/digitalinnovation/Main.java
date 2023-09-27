package one.digitalinnovation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import one.digitalinnovation.dominio.Bootcamp;
import one.digitalinnovation.dominio.Conteudo;
import one.digitalinnovation.dominio.Curso;
import one.digitalinnovation.dominio.Dev;
import one.digitalinnovation.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso cursoJavaBasico = new Curso();
        cursoJavaBasico.setTitulo("Java Básico");
        cursoJavaBasico.setDescricao("Aprenda os conceitos básicos sobre Java.");
        cursoJavaBasico.setCargaHoraria(8);    
       
        Curso cursoDoNet = new Curso();
        cursoDoNet.setTitulo(".NET C#");
        cursoDoNet.setDescricao("Aprenda os conceitos básicos sobre C#.");
        cursoDoNet.setCargaHoraria(8);

        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Java Avançado");
        cursoJavaAvancado.setDescricao("Aprenda os conceitos avançados sobre Java.");
        cursoJavaAvancado.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprendendo Orientação a Objetos com Java");
        mentoria.setDescricao("Imersão sobre os pilares da Orientação a Objetos");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT START #2 Java");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45));
        List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico,cursoJavaAvancado,mentoria);
        bootcamp.setConteudos(conteudosBootcamp);

        Dev claudia = new Dev();
        claudia.setNome("Claudia");
        Dev murilo = new Dev();
        murilo.setNome("Murilo");

        claudia.inscrever(cursoDoNet);
        claudia.inscrever(bootcamp);
        claudia.progredir();
        claudia.progredir();

        murilo.inscrever(bootcamp);
        murilo.progredir();
        murilo.progredir();
        murilo.progredir();

       List<Dev> ranking = Arrays.asList(claudia,murilo).stream()
                                .sorted((dev1,dev2) -> Double.compare(dev2.calcularTotalXp(),dev1.calcularTotalXp()))
                                .collect(Collectors.toList());

        for (Dev dev : ranking) {
            System.out.println(dev.getNome());
        }
    }
}
