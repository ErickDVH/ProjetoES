public class Cliente {

    private String nome;
    private String nif;
    private String contacto;
    private String email;
    private String morada;

    public Cliente(String nome, String nif, String contacto,String email, String morada){
        this.nome = nome;
        this.nif = nif;
        this.contacto = contacto;
        this.email = email;
        this.morada = morada;
    }

    public String getNome() {
        return nome;
    }

    public String getNif() {
        return nif;
    }

    public String getContacto() {
        return contacto;
    }

    public String getEmail() {
        return email;
    }

    public String getMorada() {
        return morada;
    }
}
