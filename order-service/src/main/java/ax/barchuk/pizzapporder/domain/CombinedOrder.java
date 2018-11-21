package ax.barchuk.pizzapporder.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "orders")
public class CombinedOrder {

    @Id
    private UUID id;

    @ElementCollection
    @CollectionTable(name = "menu_items",
            joinColumns = @JoinColumn(name = "order_id"),
            foreignKey = @ForeignKey(name = "menu_items_orders_fk"))
    private List<MenuItem> items;

    private String email;

}
