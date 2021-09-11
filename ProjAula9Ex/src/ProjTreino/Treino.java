package ProjTreino;


public class Treino {
    String nomeAtleta;
    double marca1;
    double marca2;
    double marca3;

    public void setNomeAtleta(String nomeAtleta){
    this.nomeAtleta = nomeAtleta;
    }

    public String getNomeAtleta(){
        return this.nomeAtleta;
    }

    public void setMarca1(double marca1){
        this.marca1 = marca1;
    }

    public double getMarca1(){
        return marca1;
    }

    public void setMarca2(double marca2){
        this.marca2 = marca2;
    }

    public double getMarca2(){
        return marca2;
    }

    public void setMarca3(double marca3){
        this.marca3 = marca3;
    }

    public double getMarca3(){
        return marca3;
    }

    public String toString(){
        return this.nomeAtleta + "\n" +"primeira marca: " + this.marca1 + "m/s"+ "\n"+ "segunda marca: " + this.marca2 + "m/s"+ "\n"+ "terceira marca: " +this.marca3 + "m/s";

    }



    public double calcularMediaDeMarcas(){
        double media;
        media = (this.marca1 + this.marca2+ this.marca3)/3;

        return media;
    }

    public String obterMaiorMarca(){
        String resposta;

        if(this.marca1 > this.marca2 && this.marca1 >this.marca3){
            resposta = "A maior marca foi a primeira " + this.marca1;
        } else if(this.marca2 > this.marca1 && this.marca2 >this.marca3){
            resposta = "A maior marca foi a segunda " + this.marca2;
        }else if(this.marca3 > this.marca1 && this.marca3 >this.marca2){
            resposta = "A maior marca foi a terceira " + this.marca3;
        }else{
            resposta = "Não há marca maior" + this.marca3;
        }
        return resposta;
    }


}
