public class ValidaCPF {
    
    public static boolean isCPF(String CPF) {
        // Remove caracteres não numéricos
        CPF = CPF.replaceAll("[^\\d]", "");

        // Verifica se o CPF tem 11 dígitos
        if (CPF.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais
        if (CPF.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(CPF.charAt(i)) * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(CPF.charAt(i)) * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        // Verifica se os dígitos calculados são iguais aos dígitos do CPF
        return primeiroDigito == Character.getNumericValue(CPF.charAt(9)) &&
               segundoDigito == Character.getNumericValue(CPF.charAt(10));
    }
}
