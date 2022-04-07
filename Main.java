public class Main {

    public static void main(String[] args) {


        Pessoa p;
        p = new Pessoa();

        p.setNome("Hitallo");
        p.setSobreNome("Freitas");
        p.setIdade(25);
        p.setCpf(123123);
        p.setAltura(1.83);
        p.setPeso(95.5);

        System.out.println(p.getNome());
        System.out.println(p.getSobreNome());
        System.out.println(p.getIdade());
        System.out.println(p.getCpf());
        System.out.println(p.getAltura());
        System.out.println(p.getPeso());

    }
}
