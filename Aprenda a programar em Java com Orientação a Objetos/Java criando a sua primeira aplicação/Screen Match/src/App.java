public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esse é o Screen Match");
        //System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
       // System.out.println("Ano de Lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada das três notas
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = "Filme de aventura com galã dos anos 80";
        sinopse = """
                Filme: Top Gun: Maverick
                Filme de aventura com galã dos anos 80
                Muito Bom!
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) media / 2;
        System.out.println(classificacao);
    }
}
