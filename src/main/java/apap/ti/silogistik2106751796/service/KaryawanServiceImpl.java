package apap.ti.silogistik2106751796.service;

import apap.ti.silogistik2106751796.model.Karyawan;
import apap.ti.silogistik2106751796.repository.KaryawanDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaryawanServiceImpl implements KaryawanService{
    @Autowired
    KaryawanDb karyawanDb;

    @Override
    public Karyawan createKaryawan(Karyawan karyawan) {
        return karyawanDb.save(karyawan);
    }

    @Override
    public List<Karyawan> getAllKaryawan() {
        return karyawanDb.findAll();
    }

    @Override
    public long countAllKaryawan() {
        return karyawanDb.count();
    }
}
