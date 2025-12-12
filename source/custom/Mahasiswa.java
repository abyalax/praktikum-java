package custom;

public class Mahasiswa implements Comparable<Mahasiswa> {
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

    /** This is Advanced Use, usefull for next implementation of data structure */
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

    /** This is Advanced Use, usefull for next implementation of data structure */
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + npm.hashCode();
        result = 31 * result + semester;
        return result;
    }

    @Override
    public int compareTo(Mahasiswa o) {
        if (this == o)
            return 0;
        if (o == null || getClass() != o.getClass()) // check for instance
            return -1;

        // Compare name first
        int nameComparison = this.name.compareTo(o.name); // lexicographically for compare data string
        if (nameComparison != 0)
            return nameComparison;

        // If names are equal, compare npm
        int npmComparison = this.npm.compareTo(o.npm); // lexicographically
        if (npmComparison != 0)
            return npmComparison;

        // If nmps are also equal, compare semester
        return Integer.compare(this.semester, o.semester); // normal comparison
    }

}