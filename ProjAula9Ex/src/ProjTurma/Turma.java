package ProjTurma;

public class Turma{
    String turma, nomeA1, nomeA2, nomeA3, nomeA4, nomeA5;
    double n1, n2, n3, n4, n5;
   
   
    public void setTurma(String turma){
        this.turma = turma;
    }
    public String getTurma(){
        return turma;
    }
    
    public void setNomeA1(String nomeA1){
        this.nomeA1 = nomeA1;
    }
    public String getNomeA1(){
        return nomeA1;
    }

    public void setNomeA2(String nomeA2){
        this.nomeA2 = nomeA2;
    }
    public String getNomeA2(){
        return nomeA2;
    }

    public void setNomeA3(String nomeA3){
        this.nomeA3 = nomeA3;
    }
    public String getNomeA3(){
        return nomeA3;
    }

    public void setNomeA4(String nomeA4){
        this.nomeA4 = nomeA4;
    }
    public String getNomeA4(){
        return nomeA4;
    }

    public void setNomeA5(String nomeA5){
        this.nomeA5 = nomeA5;
    }
    public String getNomeA5(){
        return nomeA5;
    }



    public void setN1(double n1){
        this.n1 = n1;
    }
    public double getN1(){
        return n1;
    }

    public void setN2(double n2){
        this.n2 = n2;
    }
    public double getN2(){
        return n2;
    }

    public void setN3(double n3){
        this.n3 = n3;
    }
    public double getN3(){
        return n3;
    }

    public void setN4(double n4){
        this.n4 = n4;
    }
    public double getN4(){
        return n4;
    }

    public void setN5(double n5){
        this.n5 = n5;
    }
    public double getN5(){
        return n5;
    }

    public String maiorNota(){
        String resultado1, resultado2, resultado3, resultado4, resultado5;

        double media;
        media = (n1 + n2 + n3 + n4 + n5)/5;
        
        if(this.n1 >= media){
            resultado1 = this.nomeA1 + " está acima da média. Nota = " + this.n1;
        } else{
            resultado1 = this.nomeA1 + " está abaixo da média. Nota = " + this.n1;
        }
        
        if (this.n2 >= media){
            resultado2 = this.nomeA2 + " está acima da média. Nota = " + this.n2;
        } else{
            resultado2 = this.nomeA2 + " está abaixo da média. Nota = " + this.n2;
        }
        
        if (this.n3 >= media){
            resultado3 = this.nomeA3 + " está acima da média. Nota = " + this.n3;
        }else {
            resultado3 = this.nomeA3 + " está abaixo da média. Nota = " + this.n3;
        }
        
        if (this.n4 >= media){
            resultado4 = this.nomeA4 + " está acima da média. Nota = " + this.n4;
        }else {
            resultado4 = this.nomeA4 + " está abaixo da média. Nota = " + this.n4;
        }
        
        if (this.n5 >= media){
            resultado5 = this.nomeA5 + " está acima da média. Nota = " + this.n5;
        }else{
            resultado5 = this.nomeA5 + " está abaixo da média. Nota = " + this.n5;
        }
        return "A média da turma é " + media  + "\n" + resultado1 + "\n" + resultado2 + "\n" + resultado3 + "\n" + resultado4 + "\n" + resultado5;
        

    }

    public String toString(){
        return "Notas da turma " + this.turma + "\n" +
                this.nomeA1 + " = " + n1 + "\n" + 
                this.nomeA2 + " = " + n2 + "\n" + 
                this.nomeA3 + " = " + n3 + "\n" + 
                this.nomeA4 + " = " + n4 + "\n" + 
                this.nomeA5 + " = " + n5;
    }

}