/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author MJS
 */
public class ContaBanco {
    
// ******* ATRIBUTOS ******* 
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status; 
    
    // MÉTODOS PERSONALIZADOS
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
            if ("CC".equals(t)) {
                this.setSaldo(50);
        } else if ("CP".equals(t)){
                   this.setSaldo(150);
        }
            System.out.println("Conta aberta com sucesso!!!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta tem saldo, impossivel fechar");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta não pode ser encerrado, pois tem debitos");
        } else {
            this.setStatus(false);
            System.out.println("Conta Encerrada");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus()){
            this.saldo = this.saldo + v;
        }
    }
    
    public void sacar(){
    
    }
    
    public void pagarMesal(){
    
    }
    
    // **** MÉTODOS ESPECIAS ******

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
