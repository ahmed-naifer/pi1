package Project.pifinity.controller;


import Project.pifinity.entity.Wallet;
import Project.pifinity.servicelmpl.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/wallets")
public class WalletController {

    @Autowired
    private WalletService walletService;

    // Endpoint pour créer un nouveau portefeuille
    @PostMapping("/addwallet")
    public Wallet createWallet(@RequestBody Wallet wallet) {
        return walletService.createWallet(wallet);
    }

    // Endpoint pour récupérer un portefeuille par son ID
    @GetMapping("/{id}")
    public Optional<Wallet> getWalletById(@PathVariable("id") Long id) {
        return walletService.getWalletById(id);
    }

    // Endpoint pour ajouter un investissement à un portefeuille
    @PutMapping("/{walletId}/addInvestment/{investmentId}")
    public Wallet addInvestmentToWallet(@PathVariable("walletId") Long walletId, @PathVariable("investmentId") Long investmentId) {
        return walletService.addInvestmentToWallet(walletId, investmentId);
    }

    // Endpoint pour consulter la performance globale du portefeuille (somme des investissements)
    @GetMapping("/{id}/performance")
    public float getPortfolioPerformance(@PathVariable("id") Long id) {
        return walletService.getPortfolioPerformance(id);
    }

}
