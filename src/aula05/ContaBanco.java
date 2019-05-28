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
    
    public void estadoAtual(){
    
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
     }
    
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
            //this.saldo = this.saldo + v; ** Acesso direto ao atributo.
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta " + this.getDono());
        }else{
            System.out.println("Impossvel depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saque realiza na Conta de " + this.getDono());
            } else {
                    System.out.println("Saldo insulficiate para sacar");
            } 
        }else {
                    System.out.println("Impossivel sacar conta encerrada");
          }
    }
    
    public void pagarMesal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } 
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso da conta " + this.getDono());
        } else {
            System.out.println("Impossivel pagar uma conta fechada");
        }
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
