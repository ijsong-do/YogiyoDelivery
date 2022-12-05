package yogiyodelivery.infra;

import yogiyodelivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="myPages", path="myPages")
public interface MyPageRepository extends PagingAndSortingRepository<MyPage, Long> {

    

    
}
