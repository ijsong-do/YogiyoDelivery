package yogiyodelivery.domain;

import yogiyodelivery.domain.*;
import yogiyodelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String foodId;
    private Object options;
    private String address;
}


