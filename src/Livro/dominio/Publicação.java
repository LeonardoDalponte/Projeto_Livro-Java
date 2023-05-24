package Livro.dominio;

public interface Publicação {
    public void abrir();

    public void fechar();

    public void folhear(int p);

    public void avançarPag();

    public void voltarPag();

}
