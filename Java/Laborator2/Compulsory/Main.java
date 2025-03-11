enum TipProiect {
    THEORETICAL,
    PRACTICAL
}

class Student {
    private String nume;
    private int varsta;
    private int numar_matricol;

    public Student(String nume, int varsta,int numar_matricol){
        this.nume=nume;
        this.varsta=varsta;
        this.numar_matricol=numar_matricol;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getNumar_matricol() {
        return numar_matricol;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setNumar_matricol(int numar_matricol) {
        this.numar_matricol = numar_matricol;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", numar_matricol=" + numar_matricol +
                '}';
    }
}

class Project {
    private String titluProiect;
    private TipProiect Tip;

    public Project(String titluProiect, TipProiect tip) {
        this.titluProiect = titluProiect;
        this.Tip = tip;
    }

    public String getTitluProiect() {
        return titluProiect;
    }

    public void setTitluProiect(String titluProiect) {
        this.titluProiect = titluProiect;
    }

    public TipProiect getTip() {
        return Tip;
    }

    public void setTip(TipProiect tip) {
        Tip = tip;
    }

    @Override
    public String toString() {
        return "Project{" +
                "titluProiect='" + titluProiect + '\'' +
                ", Tip=" + Tip +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Andrei",20, 123);
        Student student2 = new Student( "Anca",21,124);
        System.out.println("Studentii inmatriculati: " + student1 + " " + student2);

        Project proiect1 = new Project("Joc IP",TipProiect.PRACTICAL);
        Project proiect2 = new Project("Limba De Programare LFAC",TipProiect.THEORETICAL);
        System.out.println("Proiectele din care pot alege: " + proiect1 + " " + proiect2);
        }
}
