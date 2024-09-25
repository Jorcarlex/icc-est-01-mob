public class App {
    public static void main(String[] args) throws Exception {
        Metodos metodosBubble = new Metodos();
        int[] arreglo = { 5, 7, 30, 12, 9 };

        int[] arregloOrdenado = metodosBubble.sortByBubble(arreglo);
        metodosBubble.printArreglo(arregloOrdenado);

        int[] arregloOrdenadoDes = metodosBubble.sortByBubbleDES(arreglo);
        metodosBubble.printArregloDES(arregloOrdenadoDes);

        /////////////////////////

        String cadena  = "este es un ejemplo de texto para ordenar";
        String[] palabras=cadena.split(" ");
        String[] palabrasOrdenara = metodosBubble.sortByBubblePalabras(palabras);
        metodosBubble.printArregloPalabras(palabrasOrdenara);
    }

}