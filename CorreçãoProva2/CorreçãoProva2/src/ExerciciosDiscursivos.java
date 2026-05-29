//ex03 - Class final
// A classe final é um tipo de classe que não permite
// a herança de seus atributos e métodos, portanto gera
// erros no código caso ocorra a tentativa de acesso dos
// seus elementos por outra class.


//ex05 - Composição e agregação entre classes
//Composição ou agregação de classes ocorre quando
//montamos uma classe composta de outras, ou seja,
//que terá sub-atributos em cada atributo. Nesse caso,
//motor é parte do carro, mas tem suas próprias características.
public class Carro {
	public Motor m1;
}

//ex06 - Métodos da classe String
public String frase = "Programação Orientada";
System.out.println("tamanho: " + frase.lenght());
System.out.println(frase.toUpperCase)
System.out.println(frase.replace("Orientada", "Estruturada");

//ex08 - Metodo Abs. Con.
//O Método abstrato é somenete declarado, nao possui
//corpo, enquanto o método concreto executa uma ação.

//ex09 - Interface e classe abstrata
//A principal diferença entre interface e classe abstrata
//é que, enquanto a primeira só pode conter métodos de
//corpo vazio, a segunda pode apresentar também atributos.
//Outra diferença são os operadores:
//Implements -> herda interface.
//Extends -> herda classe abstrata.

//ex10 - Super
//O método super aparece no construtor da classe, e é
//responsável por resgatar os atributos herdados da
//classe-mãe.
//EX: A classe Triângulo herda de FormaGeo os atributos
//área a perímetro, entao seu super seria: super(area, perimetro)

//ex11 - Analise
//A) Herança de classe, encapsulamento e sobrescrita de método.
//B) Sobrescrita.
//C) Latido.

//ex12 - try catch
try {
	public int n1 = 10;
	public int n2 = 0;
	System.out.println(n1/n2);
} catch (Exception e) {
	System.out.println("erro: " + e);