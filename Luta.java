import java.util.Random;

public class Luta {// implements InterfaceLuta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rouds;
    private boolean aprovada;
    /*
     * @param l1
     * @param l2
     
    @Override*/
    public void marcarLuta (Lutador l1,Lutador l2) {
        System.out.println("Marcando luta.");
        if (l1.getCategoria().equals(l2.getCategoria())  && l1 != l2){
            this.aprovada=true;
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.aprovada=false;
            this.desafiado=null;
            this.desafiante=null;
        }
        
    }
    
   // @Override
    public void luta() {
        if(this.aprovada){
            System.out.println("O DESAFIADO!");
            this.desafiado.apresentador();
            System.out.println("O DESAFIANTE!");
            this.desafiante.apresentador();

            Random aleatorio=new Random();
            int vencedor=aleatorio.nextInt(3);
            System.out.println("=====RESULTADO DA LUTA=====");
            switch(vencedor){
                case 0:
                System.out.println("EMPATOU");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                break;

                case 1:
                System.out.println("VITORIA do "+this.desafiado.getNome());
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;

                case 2:
                System.out.println("VITORIA do "+this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;
               
            }
            System.out.println("======================");

        }else{
            System.out.println("A luta nao pode acontecer.");
        }
        
    }
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRouds() {
        return rouds;
    }
    public void setRouds(int rouds) {
        this.rouds = rouds;
    }
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

   
    

}
