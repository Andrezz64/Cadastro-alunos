package alunos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Main {
    public static void main(String[] args){
        long matricula = 06003175;
       long tel = 992874256;
       String endereco = "Vargem grande";
        AlunoData controle = new AlunoData();
        Aluno novoAluno = new Aluno(matricula,"Andre Felipe Melo","andref841@gmail.com",tel,"Vargem grande");
        System.out.println(novoAluno.getMatricula());
    }
}
