public class Luar{
    int varLuar;
    void cetakLuar(){
        System.out.println("cetak luar...");
    }

    public class Dalam{
        int varDalam;
        void cetakDalam(){
            cetakLuar();
            System.out.println("cetak dalam...");
        }
    }

}