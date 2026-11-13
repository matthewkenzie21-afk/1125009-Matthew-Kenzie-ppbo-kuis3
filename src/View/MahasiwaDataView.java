package View;

import Model.Mahasiswa;

public class MahasiwaDataView extends DataView<Mahasiswa> {
    
    @Override 
    protected String[] getStrings() {
        return new String[] {
            "nim", 
            "nama", 
            "email",
            "umur"
        };
    }

    @Override 
    protected Mahasiswa convertVluesToModel(String[] values) {
        String nim = values[0];
        String nama = values[1];
        String email = values[2];
        int umur = Integer.parseInt(values[3]);

        return new Mahasiswa(nim, nama, email, umur);
    }

    @Override 


}
