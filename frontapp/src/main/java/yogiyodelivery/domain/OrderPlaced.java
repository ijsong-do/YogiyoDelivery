package yogiyodelivery.domain;

import yogiyodelivery.domain.*;
import yogiyodelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private List<String> options;
    private String address;

    public OrderPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
