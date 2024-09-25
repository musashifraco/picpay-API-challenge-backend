package tec.buildrun.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tec.buildrun.picpay.entity.WalletType;

public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {
}
