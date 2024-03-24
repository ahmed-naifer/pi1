package Project.pifinity.servicelmpl;


import Project.pifinity.entity.Investment;
import Project.pifinity.entity.Wallet;
import Project.pifinity.repository.InvestmentRepo;
import Project.pifinity.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WalletService {
    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private InvestmentRepo investmentRepository;

    // Méthode pour créer un nouveau portefeuille
    public Wallet createWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    public Optional<Wallet> getWalletById(Long walletId) {
        return walletRepository.findById(walletId);
    }

    // Méthode pour ajouter un investissement à un portefeuille
    public Wallet addInvestmentToWallet(Long walletId, Long investmentId) {
        Optional<Wallet> walletOptional = walletRepository.findById(walletId);
        Optional<Investment> investmentOptional = investmentRepository.findById(investmentId);

        if (walletOptional.isPresent() && investmentOptional.isPresent()) {
            Wallet wallet = walletOptional.get();
            Investment investment = investmentOptional.get();
            investment.setWallet(wallet);
            // Ajouter l'investissement au portefeuille
            wallet.getInvestments().add(investment);



            wallet.setBalance(wallet.getBalance() + investment.getMount());

            return walletRepository.save(wallet);
        } else {
            throw new IllegalArgumentException("Wallet or investment not found");
        }
    }

    // Méthode pour consulter la performance globale du portefeuille (somme des investissements)
    public float getPortfolioPerformance(Long walletId) {
        Optional<Wallet> walletOptional = walletRepository.findById(walletId);
        if (walletOptional.isPresent()) {
            Wallet wallet = walletOptional.get();
            return wallet.getBalance();
        } else {
            throw new IllegalArgumentException("Wallet not found");
        }
    }
}
