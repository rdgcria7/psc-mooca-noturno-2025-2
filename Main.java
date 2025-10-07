public class Main {

 public static void main(String[] args) {
     
    Professor prof = new Professor("Danilo", "danilo@gmail.com", 101010);
    Aluno aluno1 = new Aluno("Rodolfo", 12345, "rodolfo@gmail.com");
    Aluno aluno2 = new Aluno("Mari", 23456, "mari@gmail.com");
    Aluno aluno3 = new Aluno("Alvins", 67890, "alvins@gmail.com");


    prof.lancarNota(aluno3, 21);
    prof.lancarNota(aluno3, 17, "A2");
    prof.lancarNota(aluno3, 10, 30);


}


}