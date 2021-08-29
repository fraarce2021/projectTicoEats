package capaLogica;

public enum TipoUsuario {
    Regular("Regular"),
    Gerente("Gerente"),
    Administrador("Administrador");
    private String Codigo;
    
    public String getCodigoTipoUsuario() {
        return Codigo;
    }
    
    TipoUsuario(String codigo){
    Codigo = codigo;
    }
}
