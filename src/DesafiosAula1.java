public class DesafiosAula1 {

    public static void main(String[] args) {

        // DESAFIO 01
        String[] cores = {"vermelho", "preto", "branco", "roxo", "azul", "amarelo"};
        System.out.println("Tamanho: " + cores.length);
        System.out.println("Terceiro Elemento: " + cores[2]);
        System.out.println("Primeiro Elemento: " + cores[0]);
        System.out.println("Ultimo Elemento: " + cores[5]);
        System.out.println("Ultimo Elemento: " + cores[cores.length-1]);

        // DESAFIO 02
        String[][] multicores = {
                {"vermelho", "preto", "branco"},
                {"roxo", "azul"}
        };
        System.out.println("Primeiro elemento do primeiro array: " + multicores[0][0]);
        System.out.println("Primeiro elemento do segundo array: " + multicores[1][0]);
        System.out.println("Tamanho array multidimensional: " + multicores.length);
        System.out.println("Tamanho primeiro array: " + multicores[0].length);
    }

}
