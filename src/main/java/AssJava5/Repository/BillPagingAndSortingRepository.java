package AssJava5.Repository;


import AssJava5.Model.Bill;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BillPagingAndSortingRepository extends PagingAndSortingRepository<Bill,Long> {
}
