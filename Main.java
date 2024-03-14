import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Barang> tugas = new LinkedList<Barang>();
        Scanner input = new Scanner(System.in);
        int angka;
        do {
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Keluar");
            angka = input.nextInt();
            input.nextLine();

            switch (angka) {
                case 1:
                    System.out.print("Masukkan nama mata kuliah : ");
                    String mataKuliah = input.nextLine();
                    System.out.print("Masukkan nama tugas : ");
                    String namaTugas = input.nextLine();
                    System.out.print("Masukkan deadline : ");
                    String deadline = input.nextLine();
                    Barang newData = new Barang(mataKuliah, namaTugas, deadline);
                    tugas.add(newData);
                    break;
                case 2:
                    System.out.println("Hapus depan / Hapus belakang");
                    System.out.println("1. hapus depan");
                    System.out.println("2. hapus belakang");
                    System.out.println("3. Hapus berdasarkan mata kuliah atau nama tugas");
                    int pilih = input.nextInt();
                    switch (pilih) {
                        case 1:
                            Barang removedatafirst = tugas.removeFirst();
                            break;
                        case 2:
                            Barang removedataLast = tugas.removeLast();
                            break;
                        case 3:
                            System.out.print("Mata kuliah yang ingin dihapus : ");
                            String matkul = input.next();
                            System.out.print("Nama tugas yang ingin dihapus : ");
                            String task = input.next();
                            ListIterator<Barang> current = tugas.listIterator();
                            while (current.hasNext()) { // mengecek apakah masih ada not setelah current atau tidak null
                                Barang currentTugas = current.next();
                                if (currentTugas.getNamaMataKuliah().equalsIgnoreCase(matkul)
                                        || currentTugas.getNamaTugas().equalsIgnoreCase(task)) {
                                    current.remove();
                                    break;
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Cetak dari Depan / Cetak dari Belakang");
                    System.out.println("1. Cetak dari depan");
                    System.out.println("2. Cetak dari belakang");
                    int pilih2 = input.nextInt();
                    switch (pilih2) {
                        case 1:
                            for (Barang data : tugas) {
                                System.out.println(data);
                            }
                            break;
                        case 2:
                            for (int i = tugas.size() - 1; i >= 0; i--) {
                                System.out.println(tugas.get(i));
                            }
                            break;
                    }
            }
        } while (angka != 4);

    }

}