package application.controller;

import application.model.Account;
import application.model.AccountTransaction;
import application.service.AccountDtoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class AccountsAPIControllerTest {

    @InjectMocks
    AccountsAPIController controller;

    private MockMvc mockMvc;

    @Mock
    public AccountDtoService accountDtoService;

    @Before
    public void setup() {

        // this must be called for the @Mock annotations above to be processed
        // and for the mock service to be injected into the controller under
        // test.
        MockitoAnnotations.initMocks(this);

        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

    }

    @Test
    public void getLogin() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("login"));

    }
    @Test
    public void getAccounts() throws Exception {
        List<Account> expectedList = new ArrayList<>();
        Account account1 = new Account();
        expectedList.add(account1);
        when(accountDtoService.getAccountList()).thenReturn(expectedList);
                mockMvc.perform(get("/accounts"))
                .andExpect(status().isOk())
                .andExpect(view().name("accountList"))
                .andExpect(model().attribute("accounts", is(expectedList)));

    }

    // Get request with Param
    @Test
    public void getTransactions() throws Exception {
        List<AccountTransaction> trnList = new ArrayList<>();
       when(accountDtoService.getTransactionsByAccId(ArgumentMatchers.any(String.class))).thenReturn(trnList);
        mockMvc.perform(get("/transactions").param("accId", "123"))
                .andExpect(status().isOk())
                .andExpect(view().name("transactionList"))
                .andExpect(model().attribute("transactions", is(trnList)));
    }

}
