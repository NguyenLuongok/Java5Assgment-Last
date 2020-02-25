package AssJava5.Service;


import AssJava5.Model.Bill;

import java.util.List;

public interface BillService {
    List<Bill> findAll();
    Bill finById(Long id);
    void save(Bill bill);
    void remove(Long id);
    List<Bill> saveAll(List<Bill> bill);
}
