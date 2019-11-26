// classe mãe ~ingresso
public class Ingresso {
int valor;
public int getValor() {
return valor;
}
public void setValor(int valor) {
this.valor = valor;
}
public int imprimeValor() {
return this.valor;
}
}
// classe filha ~VIP
public class Vip extends Ingresso {
int valorAdicional;
public int getValorAdicional() {
return valorAdicional;
}
public void setValorAdicional(int adicional) {
this.adicional = this.adicional;
}
public int imprimeValorVip() {
return this.valor + this.adicional;
}
}
// classe filha ~Normal
public class Normal extends Ingresso {
public String imprimeValorNormal() {
return ("Ingresso normal");
}
}
// classe filha ~Camarote Inferior e Camarote Superior
public class CamaroteInferior extends Vip {

String localizacao;
public void setLocalizacao(String localizacao) {
this.localizacao = localizacao;
}
public String getLocalizacao() {
return ("Localização: " + this.localizacao);
}
public String imprimeTipoDeCamarote() {
return ("Camarote Inferior");
}
}
public class CamoroteSuperior extends Vip {
int valorAdicionalCamSup;
public void setValorAdicionalCamSup(int valorAdicionalCamSup) {
this.valorAdicionalCamSup = valorAdicionalCamSup;
}
public int getValorAdicionalCamSup() {
return this.valorAdicionalCamSup;
}
public int imprimeValorCamSup() {
return this.valor + this.valorAdicional + this.valorAdicionalCamSup;
}
public String imprimeTipoDeCamarote() {
return ("Camarote Superior");
}
}