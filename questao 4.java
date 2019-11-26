// classe mãe ~Imóvel
public class Imovel {
String endereco;
double preco;
public String getEndereco() {
return endereco;
}
public void setEndereco(String endereco) {
this.endereco = endereco;
}
public double getPreco() {
return preco;
}
public void setPreco(double preco) {
this.preco = preco;
}
}

// classe filha ~Novo
public class Novo extends Imovel {
double adicional;
public void setAdicional(double adicinonal) {
this.adicional = adicional;
}
public double getAdicional() {
return adicional;
}
public void imprimeAdicional() {
return ("O valor adicional é: " + (preco + this.adicional));
}
}
// classe filha ~Velho
public class Velho extends Imovel {
double desconto;
public void setDesconto(double desconto) {
this.desconto = desconto;
}
public double getAdicional() {
return adicional;
}
public String imprimeDescoto() {
return ("O valor do desconto é: " + (preco - this.desconto));
}
}
