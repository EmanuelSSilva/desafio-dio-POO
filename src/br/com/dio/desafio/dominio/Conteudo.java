package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_Padrao = 10d;

    private String titulo;
    private String Descricao;

    public abstract double calcularXp();

    public String getTitulo() { return titulo; }

    public void setTitulo(String titulo) { this.titulo = titulo;  }

    public String getDescricao() { return Descricao; }

    public void setDescricao(String descricao) { Descricao = descricao; }
}

