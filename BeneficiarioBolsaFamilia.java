package aps;

import javax.swing.JOptionPane;


public class BeneficiarioBolsaFamilia extends Beneficiario  implements Avaliacao {
   
    
    private String status;
    private double rendapercap;
    public BeneficiarioBolsaFamilia(String nome, String cpf, int nPessoas, Double renda){
        super(nome,cpf,nPessoas,renda);
        Avaliacao();
        MostraStatus();
        
        
    }
    public void Avaliacao(){
        rendapercap = (super.getRenda() / super.getnPessoas());
        if(rendapercap <= 140){
            status = "Auxilio bolsa-Familia Aprovado";
            
        }else{
            status = "Auxilio Bolsa-Familia negado";
        }
        
            }

 
    public void MostraStatus(){
        JOptionPane.showMessageDialog(null,"\nNome: " + super.getNome() + "\nCpf: " + super.getCpf() + "\nRenda: " + this.renda +  "\nStatus: " + this.status + "\nRenda per capita: "
                + this.rendapercap +  "\nRenda Total: " + renda);
    }
            

     
}
