package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryCode {
// 빠른배송 일반 배송 느린배송
    private String code;
    private String displayName;


}
