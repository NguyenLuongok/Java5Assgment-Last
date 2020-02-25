package AssJava5.Service;


import AssJava5.Model.Bill;
import AssJava5.Repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillServiceImpl implements BillService {
    @Autowired
    private BillRepository billRepository;

    @Override
    public List<Bill> findAll() {
        return billRepository.findAll();
    }

    @Override
    public Bill finById(Long id) {
        return billRepository.findById(id);
    }

    @Override
    public void save(Bill bill) {
        billRepository.save(bill);
    }

    @Override
    public void remove(Long id) {
        billRepository.remove(id);
    }

    @Override
    public List<Bill> saveAll(List<Bill> bill) {
        return billRepository.saveAll(bill);
    }

}
