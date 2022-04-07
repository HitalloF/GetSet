public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;
    private Integer cpf;
    private double altura;
    private double peso;

    public void Pesssoa(String nome, String sobreNome, int idade, Integer cpf, double altura, double peso){
        nome = this.nome;
        sobreNome = this.sobreNome;
        idade = this.idade;
        cpf = this.cpf;
        altura = this.altura;
        peso = this.peso;
    }

    public String getNome(){
        return this.nome;
    }
    public String setNome(String nome) {
      return this.nome = nome;
    }
    public String getSobreNome(){
        return this.sobreNome;
    }
    public String setSobreNome(String sobreNome){
        return this.sobreNome = sobreNome;
    }
    public int getIdade(){
        return this.idade;
    }
    public int setIdade(int idade){
        return this.idade = idade;
    }
    public Integer getCpf(){
        return this.cpf;
    }
    public Integer setCpf(Integer cpf){
        return this.cpf = cpf;
    }
    public double getAltura(){
        return this.altura;
    }
    public double setAltura(double altura){
        return this.altura = altura;
    }
    public double getPeso(){
        return this.peso;
    }
    public double setPeso(double peso){
        return this.peso = peso;
    }



}
