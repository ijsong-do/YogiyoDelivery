package yogiyodelivery.domain;

import yogiyodelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class Picked extends AbstractEvent {

    private Long id;
    private String status;
    private String orderId;
    private String address;
}
