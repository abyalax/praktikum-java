package custom;

public class Mahasiswa {
    public String name;
    public String npm;
    public int semester;

    public Mahasiswa(String name, String npm, int semester) {
        this.name = name;
        this.npm = npm;
        this.semester = semester;
    }

    @Override
    public String toString() {
        // return name + " - " + semester + " - " + npm;
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        // check reference
        if (this == obj)
            return true;
        // check instance class
        if (obj == null || getClass() != obj.getClass())
            return false; 
        // casting object ke mahasiswa
        Mahasiswa other = (Mahasiswa) obj;
        // check tiap fieldnya
        return semester == other.semester &&
                name.equals(other.name) &&
                npm.equals(other.npm);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + npm.hashCode();
        result = 31 * result + semester;
        return result;
    }

}