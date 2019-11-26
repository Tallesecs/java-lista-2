public class Funcionario {
String nome;
String cpf;
double salario;
int matricula;
public void exibeDados() {
System.out.println("Nome: " + nome + " Cpf: " + cpf + " Salário: " +
salario + " Matricula: " + matricula);
}
}
public class Gerente extends Funcionario {
String departamento;
}
public class Assistente extends Funcionario {
public void getMatricula(int matricula) {
this.matricula = matricula;
}
public void exibeDados() {
System.out.println("Nome: " + nome + " Cpf: " + cpf + " Salário: " +
salario + " Matricula: " + this.matricula);
}
}
public class Tecnico extends Assistente {
public double bonusSalarial() {
this.salario += this.salario * 0.1;
return this.salario;
}
}
public class Administrativo extends Assistente {
String turno;
public void adicionalNoturno (double adicional) {
if (turno == "Noturno" || turno == "noturno") {
this.salario += adicional;
}
}
}