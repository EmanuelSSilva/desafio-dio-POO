package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHorario;

    @Override
    public double calcularXp() {
        return XP_Padrao * cargaHorario;
    }

    public Curso() { //Contructor Default "VAZIO."
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario=" + cargaHorario +
                '}';
    }

}
