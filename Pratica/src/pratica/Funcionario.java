/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica;

public class Funcionario extends Pessoa {
    protected String usuario;
    protected String senha;
    protected String horarioI;
    protected String horarioF;
    
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getsenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getHorarioI(){
        return horarioI;
    }
    public void setHorarioI(String horarioI){
         this.horarioI = horarioI;
      
    }
    public String getHorarioF(){
        return horarioF;
    }
    public void setHorarioF(String horarioF){
        this.horarioF = horarioF;
    }
    
    public Funcionario(){
        System.out.println("Objeto funcionário criado");
    }
    
    public Funcionario(String User,String Senha,String HorarioI,String HorarioF){
        usuario = User;
        senha = Senha;
        horarioI = HorarioI;
        horarioF = HorarioF;
    }
    
            
     public void FazerLogin(){
         System.out.println("Realizar o login");
     }       
     public void MandarMensagem(){
         System.out.println("Funcionario mandando mensagem");
     }       
            
           
            
}