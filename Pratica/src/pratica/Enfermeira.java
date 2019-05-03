/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica;
public class Enfermeira extends Funcionario {
    protected int codigoEnf;
    protected String cargo;
    
    public int getCodigo(){
        return codigoEnf;
    }
    public void setCodigo(int codigo){
        this.codigoEnf = codigo;
 
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
      
    }
    
    public Enfermeira(){
        System.out.println("Objeto enfermeira criado");
    }
    
    public Enfermeira(int codigo,String Cargo){
        codigoEnf = codigo;
        cargo = Cargo;
    }
    
    public void FazerCadastro(){
        System.out.println("Enfermeira fazendo o cadastro do cliente");
    }
    
}