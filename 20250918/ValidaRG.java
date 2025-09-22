public class ValidaRG {
    
    public static boolean isRG(String RG) {
        // Remove caracteres não numéricos
        RG = RG.replaceAll("[^\\d]", "");

        // Verifica se o RG tem 9 dígitos
        if (RG.length() != 9) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (RG.matches("(\\d)\\1{8}")) {
            return false;
        }

        // Calcula o dígito verificador
        int soma = 0;
        for (int i = 0; i < 8; i++) {
            soma += Character.getNumericValue(RG.charAt(i)) * (9 - i);
        }
        int digitoVerificador = soma % 11;
        if (digitoVerificador == 10) {
            digitoVerificador = 0;
        }

        // Verifica se o dígito calculado é igual ao dígito do RG
        return digitoVerificador == Character.getNumericValue(RG.charAt(8));
    }
    
}
