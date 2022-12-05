package yogiyodelivery.domain;

import yogiyodelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class OrderRejected extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private String address;
    private List<String> options;
    private String storeId;
}
