public class medico implements Comparable<medico> {

    private Long codigo; 
    private String nomeCompleto;
    private String especialidade;
    private String crm;
    
    public medico(String nomeCompleto, String especialidade, String crm) {
        // Chamando a classe ValidaCRM
        if (!ValidaCRM.isValid(crm)) {
            throw new IllegalArgumentException("CRM inválido! Verifique o formato e o estado. Exemplo: 123456SP");
        }
        this.nomeCompleto = nomeCompleto;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    // Getters e Setters

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        if (!ValidaCRM.isValid(crm)) {
            throw new IllegalArgumentException("CRM inválido. Verifique o formato e o estado.");
        }
        this.crm = crm;
    }
    
    @Override
    public int compareTo(medico outroMedico) {
        return this.crm.compareTo(outroMedico.getCrm());
    }

    @Override
    public String toString() {
        return this.crm;
    }

    public Long getCodigo() { 
        return codigo; 
    }
    public void setCodigo(Long codigo) { 
        this.codigo = codigo; 
    }
    public String getNomeCompleto() { 
        return nomeCompleto; 
    }
    public void setNomeCompleto(String nomeCompleto) { 
        this.nomeCompleto = nomeCompleto; 
    }
    public String getEspecialidade() { 
        return especialidade; 
    }
    public void setEspecialidade(String especialidade) { 
        this.especialidade = especialidade; 
    }
}