public class Paciente implements Comparable<Paciente> {
    private String nome;
    private String datanascimento;
    private String cpf;
    private String telefone;
    private String rg;
    private String prontuario;

    public Paciente(String nome, String datanascimento, String cpf, String telefone, String rg, String prontuario) {
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.rg = rg;
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getRg() {
        return rg;
    }
    public String getProntuario() {
        return prontuario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public void setCpf(String cpf) {
        if (ValidaCPF.isCPF(cpf)) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF inválido");
        }
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setRg(String rg) {
        if (ValidaRG.isRG(rg)) {
            this.rg = rg;
        } else {
            throw new IllegalArgumentException("RG inválido");
        }
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    @Override
    public int compareTo(Paciente outro) {
        return this.prontuario.compareTo(outro.prontuario);
    }

    @Override
    public String toString() {
        System.out.println("");
        return " \n Paciente{" +
                "nome='" + nome + '\'' +
                ", datanascimento='" + datanascimento + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", rg='" + rg + '\'' +
                ", prontuario='" + prontuario + '\'' +
                '}';
    }
    
}
