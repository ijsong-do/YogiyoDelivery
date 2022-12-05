package yogiyodelivery.domain;

import yogiyodelivery.domain.OrderPlaced;
import yogiyodelivery.domain.OrderCancled;
import yogiyodelivery.FrontappApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    @ElementCollection
    
    private List<String> options;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String storeId;
    
    
    
    
    
    private String customerId;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();



        OrderCancled orderCancled = new OrderCancled(this);
        orderCancled.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = FrontappApplication.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
