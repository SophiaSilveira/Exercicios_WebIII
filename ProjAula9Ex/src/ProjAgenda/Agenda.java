package ProjAgenda;


public class Agenda {
    String nome, endereco, email;
    int telefone;

    public void setNome (String nome){
        this.nome = nome ;
    }
    public String getNome(){
        return this.nome;
    }

    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }

    public void setEmail (String email){
        this.email = email;
    }
    public String getEmail (){
        return email;
    }

    public void setTelefone (int telefone){
        this.telefone = telefone ;
    }
    public int getTelefone (){
        return this.telefone;
    }

    public String toString(){
        return  "____________________________" + "\n" +
                "Nome: " + this.nome + "\n"+
                "____________________________" + "\n" +
                "Telefone: " + this.telefone + "\n"+
                "____________________________" + "\n" +
                "Endereço: " + this.endereco + "\n"+
                "____________________________" + "\n" +
                "E-mail: " + this.email + "\n"+
                "____________________________" ;
    }
}
