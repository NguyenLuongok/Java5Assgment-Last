package AssJava5.Repository;


import AssJava5.Model.Products;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductPagingAndSortingRepository extends PagingAndSortingRepository<Products,Long> {
}
