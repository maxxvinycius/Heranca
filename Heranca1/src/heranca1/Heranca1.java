
package heranca1;


public class Heranca1 {

   
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("max");
        System.out.println("nome: " + aluno.getNome());
        aluno.setIdade(16);
        System.out.println("idade: " + aluno.getIdade());
        aluno.setCurso("informatica");
        System.out.println("curso: " + aluno.getCurso());
        aluno.setMatricula("MAT202310");
        System.out.println("matricula: " + aluno.getMatricula());
    }
    
}
