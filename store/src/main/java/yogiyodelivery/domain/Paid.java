package yogiyodelivery.domain;

import yogiyodelivery.domain.*;
import yogiyodelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Paid extends AbstractEvent {

    private Long id;
    private String orderId;
}


