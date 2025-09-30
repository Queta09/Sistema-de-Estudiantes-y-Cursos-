package src.org.sistema.eyc;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setNombreCurso("Matemáticas");
        curso1.setCreditos(5);

        Curso curso2 = new Curso();
        curso2.setNombreCurso("Historia");
        curso2.setCreditos(9);

        Curso curso3 = new Curso();
        curso3.setNombreCurso("Biología");
        curso3.setCreditos(3);

        Estudiate estudianteFmat = new Estudiate("Juan Pérez", curso1);
        Estudiate estudianteFmat1 = new Estudiate("Ana Gómez");
        Estudiate estudianteFmat2 = new Estudiate("Luis Martínez", curso2);
        Estudiate estudianteFmat3 = new Estudiate("María Rodríguez", curso3);


        System.out.println(estudianteFmat);
        System.out.println(estudianteFmat1);
        System.out.println(estudianteFmat2);
        System.out.println(estudianteFmat3);
    
    }
}