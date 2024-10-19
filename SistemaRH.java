public class SistemaRH {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Thiago Almada", 15000);

        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Salário: " + gerente.calcularSalario());
        System.out.println("Responsabilidade: " + gerente.descreverResponsabilidades());

        Desenvolvedor desenvolvedor = new Desenvolvedor("Manuel", 2300);

        desenvolvedor.descreverResponsabilidades();
        System.out.println("Desenvolvedor: " + desenvolvedor.getNome());
        System.out.println("Salário: " + desenvolvedor.calcularSalario());
        System.out.println("Responsabilidade : " +         desenvolvedor.descreverResponsabilidades());
    }
}
