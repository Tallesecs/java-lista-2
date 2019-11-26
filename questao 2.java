public class Animal {
String nome;
String raca;
}
public Animal() {
}
public Animal(String nome) {
this.nome = nome;
}
public String caminha() {
return String caminha;
}
// classe filha ~cachorro
public class Cachorro extends Animal {
public String late() {
return String late;
}
}
// classe filha ~gato
public class Gato extends Animal {
public String mia() {
return String mia;
}
}
// classe mãe ~Pessoa
public class Pessoa {
String nome;
int idade;
}
public Pessoa() {
}
// classe filha ~rica
public class Rica extends Pessoa {
double dinheiro;
public void fazCompras() {
}
}
// classe filha ~pobre
public class Pobre extends Pessoa {
public void trabalha() {
