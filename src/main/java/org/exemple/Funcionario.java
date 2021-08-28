package org.exemple;

abstract class Funcionario {
    String name;
    double salario;

    String getName() {
        return name;
    }

    void setName(String name){
        this.name = name;
    };

    double getSalario(){
        return salario;
    };

    void setSalario(double salario){
        this.salario = salario;
    };
}
