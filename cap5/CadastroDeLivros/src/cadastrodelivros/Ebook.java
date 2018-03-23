package cadastrodelivros;

public class Ebook extends Livro{
    
    private String waterMark;
    
    public Ebook (Autor autor){
        super(autor);
    }
    @Override
    public boolean aplicaDescontoDe(double porcentagem){       
        if(porcentagem > 0.15){
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }
    
    public String getWaterMark(){
        return waterMark;
    }
    
}
