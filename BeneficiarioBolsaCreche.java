package aps;

import javax.swing.JOptionPane;


/**
 *
 * @author Matheus
 */
public class BeneficiarioBolsaCreche extends Beneficiario implements Avaliacao{
    private int nFilhos;
    private String nomeFilho;
    private int idadeFilho;
    private String status;
   
            
   public BeneficiarioBolsaCreche(String nome, String cpf,int nPessoas, int nFilhos,  Double renda, int nfilhos){
       super(nome,cpf,nPessoas,renda);
       this.nFilhos = nfilhos;
       Avaliacao();
       MostrarStatus();
       
   
         
        
    }

    
    public void Avaliacao(){
        if(renda <= 1200.00 && nFilhos >= 1){
           status = "Auxilio bolsa Creche aceito";
            
            
        }else{
            status = "Auxilio bolsa-creche negado";
        }

   
}

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getnFilhos() {
        return nFilhos;
    }

    public void setnFilhos(int nFilhos) {
        this.nFilhos = nFilhos;
    }

    public String getNomeFilho() {
        return nomeFilho;
    }

    public void setNomeFilho(String nomeFilho) {
        this.nomeFilho = nomeFilho;
    }

      
    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }
    public void MostrarStatus(){
        JOptionPane.showMessageDialog(null,"\nNome: " + super.getNome() + "\nCpf: " + super.getCpf() + "\nRenda: " + this.renda +  "\nFilhos com menos de 3 anos: " + this.nFilhos + "\nStatus: " + status);
        
    }
    
    
    
}
