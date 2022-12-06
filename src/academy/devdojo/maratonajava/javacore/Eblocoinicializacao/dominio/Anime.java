package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    // 1 - Alocado espaço em memória para o objeto
    // Cada atributo da classe é criado e inicializado com valores default

    {
        System.out.println("dentro do bloco");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }

        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
