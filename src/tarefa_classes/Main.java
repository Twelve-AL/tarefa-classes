package tarefa_classes;

public class Main extends carro{
    public static void main(String[] args) {
        // Criando um objeto Carro
        carro carro1 = new carro();

        // Atribuindo valores às propriedades do carro
        carro1.cor = "Azul";
        carro1.modelo = "Fusca";
        carro1.ano = 1985;

        // Exibindo as informações do carro
        carro1.mostrarInfo();
    }
}









