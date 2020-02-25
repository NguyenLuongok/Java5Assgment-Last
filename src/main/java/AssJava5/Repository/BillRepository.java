package AssJava5.Repository;

import AssJava5.Model.Bill;

import java.util.List;

public interface BillRepository extends Repository<Bill>{
    public List<Bill> saveAll(List<Bill> bill);
}
