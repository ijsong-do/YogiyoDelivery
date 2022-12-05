package yogiyodelivery.domain;

import yogiyodelivery.domain.*;
import yogiyodelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCancled extends AbstractEvent {

    private Long id;

    public OrderCancled(Order aggregate){
        super(aggregate);
    }
    public OrderCancled(){
        super();
    }
}
