/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class AvaliadorDeNotas {
    

    // classificar o aluno com base na nota
    public String classificarAluno(double notaFinal) {
        if (notaFinal >= 90) {
            return "Excelente";
        } else if (notaFinal >= 75) {
            return "Bom";
        } else if (notaFinal >= 50) {
            return "Reglar";
        } else  if (notaFinal >= 50)
            return "Insuficiente";
        } else (notaFinal < 30) {
            return "Reprovado";
        
                }  
    }

    public static void main(String[] args) {
        AvaliadorDeNotas avaliador = new AvaliadorDeNotas();

               String classificacao = avaliador.classificarAluno(nota);

        System.out.println("A classificação é: " + classificacao);
    
}
    
}
