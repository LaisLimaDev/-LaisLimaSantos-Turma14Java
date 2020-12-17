package POO;

public class Lista2PooTarefa1 {
    private String nome;
    private String endereco;
    private String telefone;
    private int idade;
    private String dataAniv;
    private String CPF;
    private String RG;
   
    public Lista2PooTarefa1 (String nome, String endereco, String telefone); {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
   
    public Lista2PooTarefa1 (String nome, String idade, String dataAniv) {
        this.nome = nome;
        this.idade = idade;
        this.dataAniv = dataAniv;
    }
   
    public Lista2PooTarefa1 (String nome, String CPF, String RG) {
        this.nome = nome;
        this.CPF = CPF;
        this.RG = RG;
    }
   
    public String getNome()
    {
        return this.nome;
    }
   
    public void setNome(String nome)
    {
        this.nome = nome;
    }
   
    public String getEndereco()
    {
        return this.endereco;
    }
   
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
   
    public String getTelefone()
    {
        return this.telefone;
    }
   
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
   
    public int getIdade()
    {
        return this.idade;
    }
   
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
   
    public String getDataAniv()
    {
        return this.dataAniv;
    }
   
    public void setDataAniv(String dataAniv)
    {
        this.dataAniv = dataAniv;
    }
   
    public String getCPF()
    {
        return this.CPF;
    }
   
    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }
   
    public String getRG()
    {
        return this.RG;
    }
   
    public void setRG(String RG)
    {
        this.RG = RG;
    }
   
}
