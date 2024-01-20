import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) throws Exception {

        // Crie um programa em Java que escreva a seguinte mensagem em um arquivo
        // chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as
        // classes do pacote java.io.
        String data = "Conteúdo a ser gravado no arquivo.";

        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write(data);
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Defina uma classe chamada Titulo com os atributos necessários. Em seguida,
        // crie um programa que instancia um objeto Titulo, serializa esse objeto para
        // JSON usando a biblioteca Gson e imprime o resultado.
        Titulo titulo = new Titulo(); 

        Gson gson = new Gson();
        String json = gson.toJson(titulo);

        System.out.println(json);
        // Modifique o programa anterior para que o JSON gerado seja formatado de
        // maneira mais elegante. Utilize o método setPrettyPrinting para alcançar esse
        // resultado.
        Titulo titulo_1 = new Titulo(); 

        // Configuração do Gson com Pretty Printing
        Gson gson_1 = new GsonBuilder().setPrettyPrinting().create();
        String json_1 = gson_1.toJson(titulo_1);

        System.out.println(json_1);
        // Defina uma classe chamada Veiculo com os atributos necessários. Em seguida,
        // crie um programa que instancia um objeto Veiculo, serializa esse objeto para
        // JSON usando a biblioteca Gson e imprime o resultado.
        // Crie uma instância do objeto Veiculo
        Veiculo carro = new Veiculo();
        carro.setMarca("Toyota");
        carro.setModelo("Corolla");
        carro.setAnoFabricacao(2022);
        carro.setPreco(75000.00);

        Gson gson_2 = new Gson();
        String jsonVeiculo = gson_2.toJson(carro);

        // Imprima o JSON resultante
        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(jsonVeiculo);
    }
}

class Titulo {
    // Defina a classe do objeto Titulo aqui
    private String nome = "Teste";
}

class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}