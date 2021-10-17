package org.exemple;

public class TesteProjeto {

    private static final double DIAPROFESSOR = 85.35;
    private static final double DIAGERENTE = 98.2;
    private static final double DIADESENVOLVEDOR = 115;

    public static void main(String[] args){
        String texto = "texto";
        System.out.println("A string é igual :" + texto.equals(texto));
        Funcionario proffesor01 = new Professor(DIAPROFESSOR);
        proffesor01.setName("Fernanda");

        Funcionario desenvolvedor01 = new Desenvolvedor(DIADESENVOLVEDOR);
        desenvolvedor01.setName("Paulo Uilian");

        Funcionario desenvolvedor02 = new Desenvolvedor(DIADESENVOLVEDOR);
        desenvolvedor02.setName("Josimar");

        Funcionario gerente = new Gerente(DIAGERENTE);
        gerente.setName("Lary");

        cauculaSalario(proffesor01, 20);
        cauculaSalario(desenvolvedor01, 20);
        cauculaSalario(desenvolvedor02, 15);
        cauculaSalario(gerente, 20);
    }

    // Calcula o salário do funcionário de acordo com a quantidade de dias trabalhados
    private static void cauculaSalario(Funcionario funcionario, int dias){
        String cargo = "";

        if(funcionario instanceof Professor){
            cargo = "professor";
        }

        else if(funcionario instanceof Gerente){
            cargo = "gerente";
        }

        else if(funcionario instanceof Desenvolvedor){
            cargo = "desenvolvedor";
        }

        // Exibe o salario do funcionário
        System.out.printf("O(A) %s(a) %s, vai receber o salário de R$: %.2f%n",
                cargo,
                funcionario.getName(),
                funcionario.getSalario() * dias);
    }



}
