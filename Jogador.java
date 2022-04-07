import java.util.Scanner;

public class Jogador extends Pessoa{

    @Override
    public void setNome(String nome) {
        this.nome = "jogador :" + nome;
    }
    public void Jogar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira quantidade de jogadas");
        int numero;
        numero = sc.nextInt();
        for( int i = 0; i <= numero; i++){

             int jogadas = i * (int)((Math.random()*1)+1);
             if( jogadas >= 5){
                 System.out.println("Você ganhou "+jogadas);
             }
             else if( jogadas <5){
                 System.out.println("Você perdeu "+jogadas);
             }
        }
        sc.close();
    }

}

