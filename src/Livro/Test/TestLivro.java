package Livro.Test;

import Livro.dominio.Livro;
import Livro.dominio.Pessoa;

public class TestLivro {
    public static void main(String[] args) {
        Pessoa pessoa[] = new Pessoa[3];
        pessoa[0] = new Pessoa("Leonardo Dalponte ", 17, "Masculino ");
        pessoa[1] = new Pessoa("Bruno Miguel ", 17, "Masculino ");
        pessoa[2] = new Pessoa("Arthur Teixeira ", 18, "Masculino ");
        // três leitores

        Livro livro[] = new Livro[4];
        livro[0] = new Livro("Dom Quixote ", "Miguel de Cervantes ", 300, pessoa[0]);
        livro[1] = new Livro("Cem Anos de Solidão ", "Gabriel García Márquez ", 500, pessoa[1]);
        livro[2] = new Livro("Guerra e Paz ", "Lev Tolstói ", 200, pessoa[0]);
        livro[3] = new Livro("Moby Dick  ", "Herman Melville ", 300, pessoa[2]);
        // 4 livros para 3 leitores

        pessoa[0].FazerAniversario(); // acrecenta um ano de idade na pessoa da posição [0]
        //---------------------------------------------------------------
        //avançarpag() acrecenta uma pagina lembrando que a pagina inicial é 0 e voltarPag() faz o mesmo diminuindo uma pagina

        livro[0].abrir();
        livro[0].avançarPag();
        System.out.println(livro[0].Detalhes());
        livro[0].fechar();

        System.out.println("----------------------");

        livro[1].abrir();
        livro[1].avançarPag();
        livro[1].avançarPag();
        livro[1].voltarPag();

        System.out.println(livro[1].Detalhes());
        livro[1].fechar();

        System.out.println("-----------------------");

        livro[1].abrir();
        System.out.println(livro[2].Detalhes());
        livro[1].fechar();

        System.out.println("------------------------");


        //metodo folhear faz voce folhear ate a pagina desejada e ela se torna a pagina atual
        livro[3].abrir();
        livro[3].folhear(30);
        System.out.println(livro[3].Detalhes());
        livro[3].fechar();


    }
}
