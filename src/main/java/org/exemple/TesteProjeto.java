package org.exemple;

public class TesteProjeto {

    private static final double DIAPROFESSOR = 85.35;
    private static final double DIAGERENTE = 98.2;
    private static final double DIADESENVOLVEDOR = 115;

    public static void main(String[] args){
        Funcionario proffesor01 = new Professor();
        proffesor01.setName("Fernanda");

        Funcionario desenvolvedor01 = new Desenvolvedor();
        desenvolvedor01.setName("Paulo Uilian");

        Funcionario desenvolvedor02 = new Desenvolvedor();
        desenvolvedor02.setName("Josimar");

        Funcionario gerente = new Gerente();
        gerente.setName("Lary");

        cauculaSalario(proffesor01, 20);
        cauculaSalario(desenvolvedor01, 20);
        cauculaSalario(desenvolvedor02, 15);
        cauculaSalario(gerente, 20);
    }

    // Calcula o salário do funcionário de acordo com a quantidade de dias trabalhados
    private static void cauculaSalario(Funcionario funcionario, int dias){
        if(funcionario instanceof Professor){
            funcionario.setSalario(dias * DIAPROFESSOR);
            exibeSalario(funcionario, "professor");
        }

        else if(funcionario instanceof Gerente){
            funcionario.setSalario(dias * DIAGERENTE);
            exibeSalario(funcionario, "gerente");
        }

        else if(funcionario instanceof Desenvolvedor){
            funcionario.setSalario(dias * DIADESENVOLVEDOR);
            exibeSalario(funcionario, "desenvolvedor");
        }
    }

    // Exibe o salário de cada funcionario
    private static void exibeSalario(Funcionario funcionario, String cargo){

        System.out.printf("O(A) %s(a) %s, vai receber o salário de R$: %.2f%n",
                cargo,
                funcionario.getName(),
                funcionario.getSalario());
    }

}
