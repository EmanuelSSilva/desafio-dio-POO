import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHorario(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Java");
        curso2.setCargaHorario(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria1);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria1);

        Dev devEmanuel = new Dev();
        devEmanuel.setNome("Emanuel");
        devEmanuel.increverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Emanuel" + devEmanuel.getConteudoInscrito());
        devEmanuel.progredit();
        System.out.println("__________________________________________________________________");
        System.out.println("Conteudos Inscritos Emanuel" + devEmanuel.getConteudoInscrito());
        System.out.println("Conteudos Concluidos Emanuel" + devEmanuel.getConteudoCocluido());
        System.out.println("XP: " + devEmanuel.calcularTotalXp());

        System.out.println("***********************************************************************");

        Dev devIkaro = new Dev();
        devIkaro.setNome("Ikaro");
        devIkaro.increverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Ikaro " + devIkaro.getConteudoInscrito());
        devIkaro.progredit();
        devIkaro.progredit();
        devIkaro.progredit();
        System.out.println("__________________________________________________________________");
        System.out.println("Conteudos Inscritos Ikaro " + devIkaro.getConteudoInscrito());
        System.out.println("Conteudos Concluidos  Ikaro " + devIkaro.getConteudoCocluido());
        System.out.println("XP: " + devIkaro.calcularTotalXp());
    }
}