package tec.buildrun.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tec.buildrun.picpay.entity.Wallet;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByCpfCnpjOrEmail(String cpfCnpj, String email);
}
