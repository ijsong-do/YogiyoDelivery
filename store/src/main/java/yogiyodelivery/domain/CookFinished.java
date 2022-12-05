package yogiyodelivery.domain;

import yogiyodelivery.domain.*;
import yogiyodelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class CookFinished extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private String address;
    private List<String> options;
    private String storeId;

    public CookFinished(FoodCooking aggregate){
        super(aggregate);
    }
    public CookFinished(){
        super();
    }
}
