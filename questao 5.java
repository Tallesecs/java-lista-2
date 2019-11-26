public class Teste {
public static void main(String args[]) {
Assistente admin = new Administrativo();
Assistente tec = new Tecnico();
admin.exibeDados();
tec.exibeDados();
}
}
public class Teste {
public static void main(String args[]) {
Animal cachorro = new Cachorro();
Animal gato = new Gato();
cachorro.late();
gato.mia();
cachorro.caminha();
gato.caminha();
}
}
public class Teste {
public static void main(String args[]) {
Pessoa pessoaRica = new Rica();
Pessoa pessoaPobre = new Pobre();
Pessoa pessoaMiseravel = new Miseravel();
pessoaRica.fazcompras();
pessoaPobre.trabalha();
pessoaMiseravel.mendiga();
}
}