import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        // Crie um programa simples que solicita dois números ao usuário e realiza a
        // divisão do primeiro pelo segundo. Utilize o bloco try/catch para tratar a
        // exceção que pode ocorrer caso o usuário informe 0 como divisor.
/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = scanner.nextInt();

        System.out.println("Informe o denominador: ");
        int denominador = scanner.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }
*/
        // Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para
        // capturar a exceção SenhaInvalidaException, uma classe de exceção
        // personalizada que deve ser lançada caso a senha não atenda a critérios
        // específicos (por exemplo, ter pelo menos 8 caracteres).
/*
        Scanner scanner_1 = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner_1.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
*/
        // Desenvolva um programa em Java que permite aos usuários consultar informações
        // sobre um usuário do GitHub (utilize a API pública do GitHub para obter os
        // dados). Crie uma classe de exceção personalizada,
        // ErroConsultaGitHubException, que estende RuntimeException. Lance essa exceção
        // quando o nome de usuário não for encontrado. No bloco catch, trate de forma
        // específica essa exceção, exibindo uma mensagem amigável.
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome de usuário do GitHub para consultar informações: ");
        String username = leitura.nextLine();

        String endereco = "https://api.github.com/users/" + username;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);

            // Adicione aqui o código para processar o JSON e exibir as informações desejadas
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}

class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}

class ErroConsultaGitHubException extends RuntimeException {

    public ErroConsultaGitHubException(String mensagem) {
        super(mensagem);
    }
}
