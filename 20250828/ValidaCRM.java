import java.util.Set;
import java.util.regex.Pattern;


public class ValidaCRM {
     private static final Pattern CrmPadrao = Pattern.compile("^\\d{4,7}[A-Z]{2}$");
    
    private static final Set<String> EstadosValidos = Set.of(
        "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
        "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
        "RS", "RO", "RR", "SC", "SP", "SE", "TO"
    );

   private ValidaCRM() {}

    /**
     * Método público e estático que valida o formato e o estado de um CRM.
     * @param crm A String do CRM a ser validada.
     * @return {true} se o CRM for válido, {false} caso contrário.
     */
    
    public static boolean isValid(String crm) {
        if (crm == null) {
            return false;
        }
        
        // 1. Validação de formato
        if (!CrmPadrao.matcher(crm).matches()) {
            return false;
        }

        // 2. Validação de conteúdo (o estado)
        String estado = crm.substring(crm.length() - 2);
        
        return EstadosValidos.contains(estado);
    }
}