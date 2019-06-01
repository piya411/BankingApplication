package application.controller;

import application.service.AccountDtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountsAPIController {

    @Autowired
    AccountDtoService accountDtoService;

    /** Login Page
     * @param model
     * @return
     */
    @GetMapping("/")
    public String getLogin(Model model) {
        return "login"; //view
    }
    /**
     * Gets the list of accounts
     * @param model
     * @return
     */
    @GetMapping("/accounts")
    public String getAccounts(Model model) {
        model.addAttribute("accounts", accountDtoService.getAccountList());
        return "accountList"; //view
    }

    /**
     * Gets the list of transactions for a particular account
     * @param accId
     * @param model
     * @return
     */
    @GetMapping("/transactions")
    public String getAccountTransactions(@RequestParam(value="accId") String accId, Model model) {
        model.addAttribute("transactions", accountDtoService.getTransactionsByAccId(accId));
        return "transactionList"; //view
    }
}
