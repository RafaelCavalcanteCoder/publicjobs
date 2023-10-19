package br.com.publicjobs.blogs.tratamento;

public enum Categorias {
    FRONT_END,
    BACK_END,
    MOBILE,
    JOGOS,
    IA_E_ML,
    OUTROS;
    @Override
    public String toString() {
        // Este método personalizado permite que você obtenha uma representação amigável da enumeração
        // Exemplo: "FRONT_END" -> "front end"
        String[] palavras = name().split("_");
        StringBuilder resultado = new StringBuilder();
        for (String palavra : palavras) {
            resultado.append(palavra.charAt(0)).append(palavra.substring(1).toLowerCase()).append(" ");
        }
        return resultado.toString().trim();
    }
}
