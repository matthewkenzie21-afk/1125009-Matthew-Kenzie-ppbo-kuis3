package View;

import Model.Mahasiswa;

public class MahasiwaDataView extends DataView<Mahasiswa> {
    
    protected String[] getStrings() {
        return new String[] {
            "nim", 
            "nama", 
            "email",
            "umur"
        };
    }

    
}
