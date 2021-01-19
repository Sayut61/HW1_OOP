package Task3;

public class Autor
{
    private String autor;
    public Autor(String autor)
    {
        this.autor = autor;
    }

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    void show(){
        System.out.println(getAutor());
    }
}
