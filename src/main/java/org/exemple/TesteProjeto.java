package org.exemple;

public class TesteProjeto {

    private static final double DIAPROFESSOR = 85.35;
    private static final double DIAGERENTE = 98.2;
    private static final double DIADESENVOLVEDOR = 115;

    public static void main(String[] args){
        Professor proffesor01 = new Professor();
        proffesor01.setName("Fernanda");

        Desenvolvedor desenvolvedor01 = new Desenvolvedor();
        desenvolvedor01.setName("Paulo Uilian");

        Desenvolvedor desenvolvedor02 = new Desenvolvedor();
        desenvolvedor02.setName("Josimar");

        Gerente gerente = new Gerente();
        gerente.setName("Lary");

        cauculaSalario(proffesor01, 20);
        cauculaSalario(desenvolvedor01, 20);
        cauculaSalario(desenvolvedor02, 15);
        cauculaSalario(gerente, 20);
    }

    // Calcula o salário do funcionário de acordo com a quantidade de dias trabalhados
    private static void cauculaSalario(Funcionario funcionario, int dias){
        if(funcionario instanceof Professor){
            ((Professor) funcionario).setSalario(dias * DIAPROFESSOR);
            System.out.printf("O profesor %s, vai receber o salário de R$: %.2f%n",
                    ((Professor) funcionario).getName(),
                    ((Professor) funcionario).getSalario());
        }

        else if(funcionario instanceof Gerente){
            ((Gerente) funcionario).setSalario(dias * DIAGERENTE);
            System.out.printf("O gerente %s, vai receber o salário de R$: %.2f%n",
                    ((Gerente) funcionario).getName(),
                    ((Gerente) funcionario).getSalario());
        }

        else if(funcionario instanceof Desenvolvedor){
            ((Desenvolvedor) funcionario).setSalario(dias * DIADESENVOLVEDOR);
            System.out.printf("O desenvovedor %s, vai receber o salário de R$: %.2f%n",
                    ((Desenvolvedor) funcionario).getName(),
                    ((Desenvolvedor) funcionario).getSalario());
        }
    }

}
