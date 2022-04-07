public class Pessoa {

    public String nome;
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
    public void setNome(String nome) {
       this.nome = nome;
    }
    public String getSobreNome(){
        return this.sobreNome;
    }
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public Integer getCpf(){
        return this.cpf;
    }
    public void setCpf(Integer cpf){
        this.cpf = cpf;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
}
