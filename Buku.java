package uts_praktik.no2;

class Buku {
    private final String judul;
    private final String penulis;
    private final String genre;

    public Buku(String judul, String penulis, String genre){
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
    }

    public String getJudul(){
        return judul;
    }

    @Override
    public String toString(){
        return "Judul: " + judul + ", Penulis: " + penulis + ", genre: " + genre;
    }
}