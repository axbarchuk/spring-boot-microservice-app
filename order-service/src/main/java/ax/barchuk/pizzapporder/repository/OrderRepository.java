package ax.barchuk.pizzapporder.repository;

import ax.barchuk.pizzapporder.domain.CombinedOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<CombinedOrder, UUID> {
}
