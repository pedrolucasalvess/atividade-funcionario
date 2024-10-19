class Desenvolvedor extends Funcionario {

    private double salarioInicial;

    public Desenvolvedor(String nome, double salarioInicial) {
        super(nome);
        this.salarioInicial = salarioInicial;
    }

    @Override
    public Double calcularSalario() {
        return salarioInicial; 
    }

    @Override
    public String descreverResponsabilidades() {
        return "Desenvolver os sistemas da empresa.";
    }
}
