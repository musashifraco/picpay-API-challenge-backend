package tec.buildrun.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tec.buildrun.picpay.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
