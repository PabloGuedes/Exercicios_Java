package F_Encapsulamento_Ex04;

public class MediaCTR {
    MediaDAO mediaDAO = new MediaDAO();
    
    public String imprimir(MediaDTO mediaDTO){
        return mediaDAO.imprimir(mediaDTO);
    }
}
