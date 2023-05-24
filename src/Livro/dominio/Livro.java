package Livro.dominio;

public class Livro implements Publicação {
    private String titulo;
    private String autor;
    private int totalPags;
    private int pagAtual = 0;
    private boolean aberto = false;
    private Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPags() {
        return totalPags;
    }

    public void setTotalPags(int totalPags) {
        this.totalPags = totalPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    public Livro(String titulo, String autor, int totalPags, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPags = totalPags;
        this.leitor = leitor;
    }

    public String Detalhes() {
        return "Livro " + "titulo = " + getTitulo() + '\'' + " \n autor = '" + getAutor() + '\'' + " \n totalPags = " + getTotalPags() + " \n pagina atual = " + getPagAtual() + " \n leitor= " + leitor.getNome() + " \n idade = " + leitor.getIdade() + " \n sexo = " + leitor.getSexo();
    }


    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {

        if (aberto == true) {
            if (pagAtual > totalPags) {
                pagAtual = 0;
            } else {
                this.pagAtual = p;
            }
        } else {
            System.out.println("abra o livro para conseguir ler");
        }

    }


    @Override
    public void avançarPag() {
        if (aberto == true) {
            if (pagAtual == totalPags) {
                pagAtual = totalPags;
            } else {
                pagAtual++;
            }
        } else {
            System.out.println("abra o livro para conseguir ler");
        }
    }

    @Override
    public void voltarPag() {
        if (aberto == true) {
            if (pagAtual == 0) {
                pagAtual = 0;
            } else {
                this.pagAtual--;
            }
        } else {
            System.out.println("abra o livro para conseguir ler");
        }
    }
}
