package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudoCocluido = new LinkedHashSet<>();


    public void increverBootcamp(BootCamp bootCamp){
        this.conteudoInscrito.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);

    }

    public void progredit (){
        Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoCocluido.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());
        }else{
            System.err.println("Você nao está matriculado em nenhum conteúdo");
        }
    }

    public double calcularTotalXp(){
        return this.conteudoCocluido
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<Conteudo> getConteudoCocluido() {
        return conteudoCocluido;
    }

    public void setConteudoCocluido(Set<Conteudo> conteudoCocluido) {
        this.conteudoCocluido = conteudoCocluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoCocluido, dev.conteudoCocluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoCocluido);
    }
}
