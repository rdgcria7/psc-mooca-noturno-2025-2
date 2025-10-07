    public class Professor{

        private String nome;
        private String email;
        private double matricula;
        private double notaA1;
        private double notaA2;
        private double notaA3;

        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }
        

    public Professor(String nome, String email, double matricula){



    }

    public void lancarNota(Aluno aluno, double notaA1){
            System.out.print("Lançando a nota da A1 para: " + 
            aluno.getNome()+ ": " + notaA1);

        }
    public void lancarNota(Aluno aluno, double notaA2, String tipoAvaliacao){
            System.out.print("Lançando a nota da A2 para " + 
            aluno.getNome()+ ": " + notaA2);

        }
    public void lancarNota(Aluno aluno, double notaCurso, double notaProjeto){
            System.out.print("Lançando a nota da A1 para: " + aluno.getNome()+ "Curso: " + notaCurso +"Nota do projeto " + notaProjeto
             +"Nota da A3 é igual a "+ (notaCurso + notaProjeto));

        }

    public void visualizarNota(Aluno aluno, double ra){
        
            System.out.println("Avaliação A1: "+notaA1+ "Avaliação A2: "+notaA2+"AvaliaçãoA3: "+notaA3);

        }

    public void visualizarAluno(){


        }

    }