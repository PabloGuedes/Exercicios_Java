package H_Polimorfismo_Ex02;

public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public String imprimir(MediaDTO mediaDTO){
        mediaDAO.calcularMedia(mediaDTO);
        return mediaDAO.imprimir();
    }
}
