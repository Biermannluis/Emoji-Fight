
public class Lutador implements InterfaceLutador{
    private String nome, nacionalidade,categoria;
    private int idade,vitorias,derrotas,empates;
    private float altura,peso;

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura,float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }
    @Override
    public void apresentador() {
        System.out.println("============================================");
       System.out.println("On the left blue coner! "+this.getNome()+" diretamente de " +this.getNacionalidade()+" com "+this.getIdade()+" anos. Pesando "+this.getPeso()+"kg, na categoria  "+this.getCategoria()+" com o cartel de "+this.getVitorias()+" Vitorias, "+this.getEmpates()+" Empates e "+this.getDerrotas()+" Derrotas.");
        
    }
    @Override
    public void status() {
        System.out.println("Nome:" +this.getNome());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Vitorias: "+this.getVitorias());
        
    }
    @Override
    public void ganharLuta() {
       this.setVitorias(getVitorias()+1);
        
    }
    @Override
    public void perderLuta() {
        this.setDerrotas(getDerrotas()+1);
        
    }
    @Override
    public void empatarLuta() {
        this.setEmpates(getEmpates()+1);
        
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
                  
        if (this.peso<52.2){
            this.categoria="Invalido";
        }else if(this.peso<=70.3){
            this.categoria="Leve";
        }else if (this.peso<=83.9){
            this.categoria="Medio";
        }else if (this.peso<=120.2){
            this.categoria="Pesado";
        }else {
            this.categoria="invalido";
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();

    }


}
