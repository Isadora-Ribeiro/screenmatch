import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();
        meuFilme.setNome("Harry Potter");
        meuFilme.setAnoDeLancamento(2004);
        meuFilme.setDuracaoEmMinutos(180);


      /*  meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());*/

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2022);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);


    }
}