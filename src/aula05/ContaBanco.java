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
    
    public void abrirConta(){
    
    }
    
    public void fecharConta(){
    
    }
    
    public void depositar() {
    
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
